package pt.dbmg.anilistclient.oauth2client;

import java.util.HashMap;
import java.util.Map;
import pt.dbmg.anilistclient.oauth2client.request.OAuthClientRequest;
import pt.dbmg.anilistclient.oauth2client.response.OAuthAccessTokenResponse;
import pt.dbmg.anilistclient.oauth2client.response.OAuthJSONAccessTokenResponse;
import pt.dbmg.anilistclient.oauth2common.OAuth;
import pt.dbmg.anilistclient.oauth2common.exception.OAuthProblemException;
import pt.dbmg.anilistclient.oauth2common.exception.OAuthSystemException;


public class OAuthClient {

    protected HttpClient httpClient;

    public OAuthClient(HttpClient oauthClient) {
        this.httpClient = oauthClient;
    }

    public <T extends OAuthAccessTokenResponse> T accessToken(
        OAuthClientRequest request,
        Class<T> responseClass)
        throws OAuthSystemException, OAuthProblemException {
        Map<String, String> headers = new HashMap<String, String>();
        String method = OAuth.HttpMethod.POST;
        if(request.getHeaders()!=null){
            headers = request.getHeaders();
            headers.put(OAuth.HeaderType.CONTENT_TYPE, OAuth.ContentType.URL_ENCODED);
        }else {
            headers.put(OAuth.HeaderType.CONTENT_TYPE, OAuth.ContentType.URL_ENCODED);
        }


        return httpClient.execute(request, headers, method, responseClass);
    }

    public OAuthJSONAccessTokenResponse accessToken(
        OAuthClientRequest request)
        throws OAuthSystemException, OAuthProblemException {
        return accessToken(request, OAuthJSONAccessTokenResponse.class);
    }
}
