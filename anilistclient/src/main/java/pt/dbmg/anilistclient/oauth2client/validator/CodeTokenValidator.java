package pt.dbmg.anilistclient.oauth2client.validator;

import pt.dbmg.anilistclient.oauth2common.OAuth;

public class CodeTokenValidator extends OAuthClientValidator {

    public CodeTokenValidator() {
        requiredParams.put(OAuth.OAUTH_CODE, new String[] {});
        requiredParams.put(OAuth.OAUTH_ACCESS_TOKEN, new String[] {});

        notAllowedParams.add(OAuth.OAUTH_ACCESS_TOKEN);
    }
}
