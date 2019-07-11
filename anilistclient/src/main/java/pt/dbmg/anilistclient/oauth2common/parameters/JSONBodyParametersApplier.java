
package pt.dbmg.anilistclient.oauth2common.parameters;

import java.util.Map;
import org.codehaus.jettison.json.JSONException;
import pt.dbmg.anilistclient.oauth2common.exception.OAuthSystemException;
import pt.dbmg.anilistclient.oauth2common.message.OAuthMessage;
import pt.dbmg.anilistclient.oauth2common.utils.JSONUtils;




public class JSONBodyParametersApplier implements OAuthParametersApplier {
    public OAuthMessage applyOAuthParameters(OAuthMessage message, Map<String, String> params)
        throws OAuthSystemException {
        String json = null;
        try {
            json = JSONUtils.buildJSON(params);
            message.setBody(json);
            return message;
        } catch (JSONException e) {
            throw new OAuthSystemException(e);
        }
    }
}
