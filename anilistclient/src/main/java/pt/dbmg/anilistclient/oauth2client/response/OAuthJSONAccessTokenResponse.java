package pt.dbmg.anilistclient.oauth2client.response;

import org.codehaus.jettison.json.JSONException;
import pt.dbmg.anilistclient.oauth2common.OAuth;
import pt.dbmg.anilistclient.oauth2common.error.OAuthError;
import pt.dbmg.anilistclient.oauth2common.exception.OAuthProblemException;
import pt.dbmg.anilistclient.oauth2common.utils.JSONUtils;


public class OAuthJSONAccessTokenResponse extends OAuthAccessTokenResponse {

    public OAuthJSONAccessTokenResponse() {
    }

    @Override
    public String getAccessToken() {
        return parameters.get(OAuth.OAUTH_ACCESS_TOKEN);
    }

    @Override
    public String getExpiresIn() {
        return parameters.get(OAuth.OAUTH_EXPIRES_IN);
    }

    public String getScope() {
        return parameters.get(OAuth.OAUTH_SCOPE);
    }

    public String getRefreshToken() {
        return parameters.get(OAuth.OAUTH_REFRESH_TOKEN);
    }

    protected void setBody(String body) throws OAuthProblemException {

        try {
            this.body = body;

            parameters = JSONUtils.parseJSON(body);
        } catch (JSONException e) {
            throw OAuthProblemException.error(OAuthError.CodeResponse.UNSUPPORTED_RESPONSE_TYPE,
                "Invalid response! Response body is not " + OAuth.ContentType.JSON + " encoded");
        }
    }

    protected void setContentType(String contentType) {
        this.contentType = contentType;
    }


    protected void setResponseCode(int code) {
        this.responseCode = code;
    }

    public String getParam(String name) {
        return parameters.get(name);
    }

}
