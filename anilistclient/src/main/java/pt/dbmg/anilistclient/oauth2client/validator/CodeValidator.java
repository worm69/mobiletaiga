package pt.dbmg.anilistclient.oauth2client.validator;

import pt.dbmg.anilistclient.oauth2common.OAuth;

public class CodeValidator extends OAuthClientValidator {

    public CodeValidator() {

        requiredParams.put(OAuth.OAUTH_CODE, new String[] {});

        notAllowedParams.add(OAuth.OAUTH_ACCESS_TOKEN);
        notAllowedParams.add(OAuth.OAUTH_EXPIRES_IN);
    }
}
