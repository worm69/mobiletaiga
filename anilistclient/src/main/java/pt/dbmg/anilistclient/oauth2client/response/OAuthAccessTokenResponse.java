package pt.dbmg.anilistclient.oauth2client.response;


import pt.dbmg.anilistclient.oauth2client.validator.TokenValidator;
import pt.dbmg.anilistclient.oauth2common.exception.OAuthProblemException;

public abstract class OAuthAccessTokenResponse extends OAuthClientResponse {

    public abstract String getAccessToken();

    public abstract String getExpiresIn();

    public abstract String getRefreshToken();

    public abstract String getScope();

    public String getBody() {
        return body;
    }

    @Override
    protected void init(String body, String contentType, int responseCode) throws OAuthProblemException {
        validator = new TokenValidator();
        super.init(body, contentType, responseCode);
    }
}
