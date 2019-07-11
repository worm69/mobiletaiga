package pt.dbmg.anilistclient.oauth2common.error;

public abstract class OAuthError {

    //error response params
    public static final String OAUTH_ERROR = "error";
    public static final String OAUTH_ERROR_DESCRIPTION = "error_description";
    public static final String OAUTH_ERROR_URI = "error_uri";

    public static final class CodeResponse {
        public static final String INVALID_REQUEST = "invalid_request";
        public static final String INVALID_CLIENT = "invalid_client";
        public static final String UNAUTHORIZED_CLIENT = "unauthorized_client";
        public static final String REDIRECT_URI_MISMATCH = "redirect_uri_mismatch";
        public static final String ACCESS_DENIED = "access_denied";
        public static final String UNSUPPORTED_RESPONSE_TYPE = "unsupported_response_type";
        public static final String INVALID_SCOPE = "invalid_scope";
    }

    public static final class TokenResponse {
        public static final String INVALID_REQUEST = "invalid_request";
        public static final String INVALID_CLIENT = "invalid_client";
        public static final String UNAUTHORIZED_CLIENT = "unauthorized_client";
        public static final String INVALID_GRANT = "invalid_grant";
        public static final String UNSUPPORTED_GRANT_TYPE = "unsupported_grant_type";
        public static final String INVALID_SCOPE = "invalid_scope";
    }

    public static final class ResourceResponse {
        public static final String INVALID_REQUEST = "invalid_request";
        public static final String EXPIRED_TOKEN = "expired_token";
        public static final String INSUFFICIENT_SCOPE = "insufficient_scope";
        public static final String INVALID_TOKEN = "invalid_token";
    }

}
