
package pt.dbmg.anilistclient.oauth2common.parameters;

import java.util.Map;
import pt.dbmg.anilistclient.oauth2common.exception.OAuthSystemException;
import pt.dbmg.anilistclient.oauth2common.message.OAuthMessage;


/**
 * Applies given parameters to the OAuth message.
 * Provided implementations include OAuth parameters in one of those:
 * <ul>
 * <li>HTTP request URI Query</li>
 * <li>HTTP request entity-body with application/x-www-form-urlencoded encoding</li>
 * <li>HTTP request entity-body with application/json encoding</li>
 * <li>HTTP request Authorization/WWW-Authenticate header</li>
 * </ul>
 * <p/>
 * Additional implementations can be provided.
 *
 * @author Maciej Machulak
 * @author Lukasz Moren
 */
public interface OAuthParametersApplier {

    OAuthMessage applyOAuthParameters(OAuthMessage message, Map<String, String> params) throws
            OAuthSystemException;
}
