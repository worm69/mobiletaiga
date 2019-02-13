package pt.dbmg.anilistclient.oauth2client.response;

import java.util.HashMap;
import java.util.Map;
import pt.dbmg.anilistclient.oauth2client.validator.OAuthClientValidator;
import pt.dbmg.anilistclient.oauth2common.exception.OAuthProblemException;



public abstract class OAuthClientResponse {

    protected String body;
    protected String contentType;
    protected int responseCode;

    protected OAuthClientValidator validator;
    protected Map<String, String> parameters = new HashMap<String, String>();

    public abstract String getParam(String param);

    protected abstract void setBody(String body) throws OAuthProblemException;

    protected abstract void setContentType(String contentTypr);

    protected abstract void setResponseCode(int responseCode);

    protected void init(String body, String contentType, int responseCode) throws OAuthProblemException {
        this.setBody(body);
        this.setContentType(contentType);
        this.setResponseCode(responseCode);
        this.validate();

    }

    protected void validate() throws OAuthProblemException {
        validator.validate(this);
    }
}
