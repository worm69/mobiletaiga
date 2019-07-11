package pt.dbmg.anilistclient.oauth2common.utils;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
public final class JSONUtils {

    public static String buildJSON(Map<String, String> params) throws JSONException {
        JSONObject jsonObject = new JSONObject();
        for (Map.Entry<String, String> param : params.entrySet()) {
            if (param.getKey() != null && !"".equals(param.getKey()) && param.getValue() != null && !""
                .equals(param.getValue())) {
                jsonObject.put(param.getKey(), param.getValue());
            }
        }

        return jsonObject.toString();
    }

    public static Map<String, String> parseJSON(String jsonBody) throws JSONException {

        Map<String, String> params = new HashMap<String, String>();
        JSONObject obj = new JSONObject(jsonBody);
        Iterator it = obj.keys();
        while (it.hasNext()) {
            Object o = it.next();
            if (o instanceof String) {
                String key = (String)o;
                params.put(key, obj.getString(key));
            }
        }
        return params;
    }

}
