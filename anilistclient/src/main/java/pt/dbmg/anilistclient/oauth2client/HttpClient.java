package pt.dbmg.anilistclient.oauth2client;

import java.util.Map;
import pt.dbmg.anilistclient.oauth2client.request.OAuthClientRequest;
import pt.dbmg.anilistclient.oauth2client.response.OAuthClientResponse;
import pt.dbmg.anilistclient.oauth2common.exception.OAuthProblemException;
import pt.dbmg.anilistclient.oauth2common.exception.OAuthSystemException;


public interface HttpClient {

    public <T extends OAuthClientResponse> T execute(
        OAuthClientRequest request,
        Map<String, String> headers,
        String requestMethod,
        Class<T> responseClass)
        throws OAuthSystemException, OAuthProblemException;
}
