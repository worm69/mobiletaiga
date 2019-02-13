package pt.dbmg.anilistclient.oauth2common.message.types;

public enum ResponseType {

    CODE("code"),
    TOKEN("token"),
    CODE_AND_TOKEN("code_and_token");

    private String code;

    ResponseType(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return code;
    }
}
