package pt.dbmg.mobiletaiga.repository.data;


public interface LogicPreferences {
    int getLastChangelogVersion();

    void setLastChangelogVersion(int version);

    boolean getHContentEnabled();

    void setHContentEnabled(boolean isEnabled);
}
