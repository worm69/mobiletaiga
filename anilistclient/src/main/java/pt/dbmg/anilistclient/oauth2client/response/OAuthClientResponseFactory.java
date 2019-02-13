package pt.dbmg.anilistclient.oauth2client.response;


import pt.dbmg.anilistclient.oauth2common.exception.OAuthProblemException;
import pt.dbmg.anilistclient.oauth2common.exception.OAuthSystemException;
import pt.dbmg.anilistclient.oauth2common.utils.OAuthUtils;

public class OAuthClientResponseFactory {

    public static OAuthClientResponse createGitHubTokenResponse(String body, String contentType,
                                                                int responseCode)
        throws OAuthProblemException {
        GitHubTokenResponse resp = new GitHubTokenResponse();
        resp.init(body, contentType, responseCode);
        return resp;
    }

    public static OAuthClientResponse createJSONTokenResponse(String body, String contentType,
                                                              int responseCode)
        throws OAuthProblemException {
        OAuthJSONAccessTokenResponse resp = new OAuthJSONAccessTokenResponse();
        resp.init(body, contentType, responseCode);
        return resp;
    }

    public static <T extends OAuthClientResponse> T createCustomResponse(String body, String contentType,
                                                                         int responseCode,
                                                                         Class<T> clazz)
        throws OAuthSystemException, OAuthProblemException {

        OAuthClientResponse resp = (OAuthClientResponse) OAuthUtils
            .instantiateClassWithParameters(clazz, null, null);

        resp.init(body, contentType, responseCode);

        return (T)resp;
    }


}
