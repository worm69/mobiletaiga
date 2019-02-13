package pt.dbmg.anilistclient.oauth2client.validator;

import pt.dbmg.anilistclient.oauth2common.OAuth;

public class TokenValidator extends OAuthClientValidator {

    public TokenValidator() {

        requiredParams.put(OAuth.OAUTH_ACCESS_TOKEN, new String[] {});

        notAllowedParams.add(OAuth.OAUTH_CODE);
    }
}
