package pt.dbmg.anilistclient.oauth2common.parameters;

import java.util.Map;
import pt.dbmg.anilistclient.oauth2common.exception.OAuthSystemException;
import pt.dbmg.anilistclient.oauth2common.message.OAuthMessage;
import pt.dbmg.anilistclient.oauth2common.utils.OAuthUtils;


public class BodyURLEncodedParametersApplier implements OAuthParametersApplier {

    public OAuthMessage applyOAuthParameters(OAuthMessage message, Map<String, String> params)
        throws OAuthSystemException {

        String body = OAuthUtils.format(params.entrySet(), "UTF-8");
        message.setBody(body);
        return message;

    }
}
