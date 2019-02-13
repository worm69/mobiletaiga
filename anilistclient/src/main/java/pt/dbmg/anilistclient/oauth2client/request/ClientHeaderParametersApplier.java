package pt.dbmg.anilistclient.oauth2client.request;

import java.util.Map;
import pt.dbmg.anilistclient.oauth2common.OAuth;
import pt.dbmg.anilistclient.oauth2common.exception.OAuthSystemException;
import pt.dbmg.anilistclient.oauth2common.message.OAuthMessage;
import pt.dbmg.anilistclient.oauth2common.parameters.OAuthParametersApplier;
import pt.dbmg.anilistclient.oauth2common.utils.OAuthUtils;



public class ClientHeaderParametersApplier implements OAuthParametersApplier {

    public OAuthMessage applyOAuthParameters(OAuthMessage message, Map<String, String> params)
        throws OAuthSystemException {

        String header = OAuthUtils.encodeOAuthHeader(params);
        message.addHeader(OAuth.HeaderType.AUTHORIZATION, header);
        return message;

    }

}
