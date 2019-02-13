package pt.dbmg.anilistclient.oauth2client.response;

import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import pt.dbmg.anilistclient.oauth2client.validator.CodeTokenValidator;
import pt.dbmg.anilistclient.oauth2client.validator.CodeValidator;
import pt.dbmg.anilistclient.oauth2client.validator.OAuthClientValidator;
import pt.dbmg.anilistclient.oauth2client.validator.TokenValidator;
import pt.dbmg.anilistclient.oauth2common.OAuth;
import pt.dbmg.anilistclient.oauth2common.exception.OAuthProblemException;
import pt.dbmg.anilistclient.oauth2common.utils.OAuthUtils;


public class OAuthAuthzResponse extends OAuthClientResponse {

    private HttpServletRequest request;

    protected OAuthAuthzResponse(HttpServletRequest request, OAuthClientValidator validator) {
        this.request = request;
        Map<String, String[]> params = request.getParameterMap();
        for (Map.Entry<String, String[]> entry : params.entrySet()) {
            String key = entry.getKey();
            String[] values = entry.getValue();
            if (!OAuthUtils.hasEmptyValues(values)) {
                parameters.put(key, values[0]);
            }
        }
        this.validator = validator;
    }

    public static OAuthAuthzResponse oauthCodeAuthzResponse(HttpServletRequest request)
        throws OAuthProblemException {
        OAuthAuthzResponse response = new OAuthAuthzResponse(request, new CodeValidator());
        response.validate();
        return response;
    }

    public static OAuthAuthzResponse oAuthCodeAndTokenAuthzResponse(HttpServletRequest request)
        throws OAuthProblemException {
        OAuthAuthzResponse response = new OAuthAuthzResponse(request, new CodeTokenValidator());
        response.validate();
        return response;
    }

    public static OAuthAuthzResponse oauthTokenAuthzResponse(HttpServletRequest request)
        throws OAuthProblemException {
        OAuthAuthzResponse response = new OAuthAuthzResponse(request, new TokenValidator());
        response.validate();
        return response;
    }

    public String getAccessToken() {
        return getParam(OAuth.OAUTH_ACCESS_TOKEN);
    }

    public String getExpiresIn() {
        return getParam(OAuth.OAUTH_EXPIRES_IN);
    }

    public String getScope() {
        return getParam(OAuth.OAUTH_SCOPE);
    }

    public String getCode() {
        return getParam(OAuth.OAUTH_CODE);
    }

    public String getState() {
        return getParam(OAuth.OAUTH_STATE);
    }

    public HttpServletRequest getRequest() {
        return request;
    }

    public String getParam(String key) {
        return this.parameters.get(key);
    }

    protected void setBody(String body) {
        this.body = body;
    }

    protected void setContentType(String contentType) {
        this.contentType = contentType;
    }

    protected void setResponseCode(int responseCode) {
        this.responseCode = responseCode;
    }

}
