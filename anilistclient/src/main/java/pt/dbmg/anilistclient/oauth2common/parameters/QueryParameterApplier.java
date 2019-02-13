
package pt.dbmg.anilistclient.oauth2common.parameters;

import java.util.HashMap;
import java.util.Map;
import pt.dbmg.anilistclient.oauth2common.OAuth;
import pt.dbmg.anilistclient.oauth2common.message.OAuthMessage;
import pt.dbmg.anilistclient.oauth2common.utils.OAuthUtils;

public class QueryParameterApplier implements OAuthParametersApplier {

    public OAuthMessage applyOAuthParameters(OAuthMessage message, Map<String, String> params) {

        String messageUrl = message.getLocationUri();
        if (messageUrl != null) {
            boolean containsQuestionMark = messageUrl.contains("?");
            StringBuffer url = new StringBuffer(messageUrl);

            //apply uri fragment component if exist access_toke param
            Map<String, String> fragmentParams = new HashMap<String, String>();
            if (params.containsKey(OAuth.OAUTH_ACCESS_TOKEN)) {
                fragmentParams.put(OAuth.OAUTH_ACCESS_TOKEN, params.remove(OAuth.OAUTH_ACCESS_TOKEN));

                if (params.containsKey(OAuth.OAUTH_EXPIRES_IN)) {
                    fragmentParams.put(OAuth.OAUTH_EXPIRES_IN, params.remove(OAuth.OAUTH_EXPIRES_IN));
                }
            }

            StringBuffer query = new StringBuffer(OAuthUtils.format(params.entrySet(), "UTF-8"));
            String fragmentQuery = "";
            if (fragmentParams.containsKey(OAuth.OAUTH_ACCESS_TOKEN)) {
                fragmentQuery = OAuthUtils.format(fragmentParams.entrySet(), "UTF-8");
            }

            if (!OAuthUtils.isEmpty(query.toString())) {
                if (containsQuestionMark) {
                    url.append("&").append(query);
                } else {
                    url.append("?").append(query);
                }
            }

            if (!OAuthUtils.isEmpty(fragmentQuery)) {
                url.append("#").append(fragmentQuery);
            }

            message.setLocationUri(url.toString());
        }
        return message;
    }
}
