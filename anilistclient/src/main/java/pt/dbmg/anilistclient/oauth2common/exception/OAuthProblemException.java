package pt.dbmg.anilistclient.oauth2common.exception;

import java.util.HashMap;
import java.util.Map;
import pt.dbmg.anilistclient.oauth2common.utils.OAuthUtils;


public final class OAuthProblemException extends Exception {

    private String error;
    private String description;
    private String uri;
    private String state;
    private String scope;
    private String redirectUri;

    private Map<String, String> parameters = new HashMap<String, String>();

    private OAuthProblemException(String error) {
        this(error, "");
    }

    private OAuthProblemException(String error, String description) {
        super(error + " " + description);
        this.description = description;
        this.error = error;
    }


    public static OAuthProblemException error(String error) {
        return new OAuthProblemException(error);
    }

    public static OAuthProblemException error(String error, String description) {
        return new OAuthProblemException(error, description);
    }

    public OAuthProblemException description(String description) {
        this.description = description;
        return this;
    }

    public OAuthProblemException uri(String uri) {
        this.uri = uri;
        return this;
    }

    public OAuthProblemException state(String state) {
        this.state = state;
        return this;
    }

    public OAuthProblemException scope(String scope) {
        this.scope = scope;
        return this;
    }

    public OAuthProblemException setParameter(String name, String value) {
        parameters.put(name, value);
        return this;
    }

    public String getError() {
        return error;
    }

    public String getDescription() {
        return description;
    }

    public String getUri() {
        return uri;
    }

    public String getState() {
        return state;
    }

    public String getScope() {
        return scope;
    }

    public String get(String name) {
        return parameters.get(name);
    }

    public Map<String, String> getParameters() {
        return parameters;
    }

    public String getRedirectUri() {
        return redirectUri;
    }

    public void setRedirectUri(String redirectUri) {
        this.redirectUri = redirectUri;
    }

    @Override
    public String getMessage() {
        StringBuffer b = new StringBuffer();
        if (!OAuthUtils.isEmpty(error)) {
            b.append(error);
        }

        if (!OAuthUtils.isEmpty(description)) {
            b.append(", ").append(description);
        }


        if (!OAuthUtils.isEmpty(uri)) {
            b.append(", ").append(uri);
        }


        if (!OAuthUtils.isEmpty(state)) {
            b.append(", ").append(state);
        }

        if (!OAuthUtils.isEmpty(scope)) {
            b.append(", ").append(scope);
        }

        return b.toString();
    }

    @Override
    public String toString() {
        return "OAuthProblemException{"
            + "description='" + description + '\''
            + ", error='" + error + '\''
            + ", uri='" + uri + '\''
            + ", state='" + state + '\''
            + ", scope='" + scope + '\''
            + '}';
    }
}
