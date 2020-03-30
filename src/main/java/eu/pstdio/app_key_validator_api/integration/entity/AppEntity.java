package eu.pstdio.app_key_validator_api.integration.entity;

/**
 *
 * @author mib
 */
public interface AppEntity {
    String getAppKey();
    void setAppKey(String appKey);
    String getUuid();
    void setUuid(String uuid);
    boolean isDisabled();
    void setDisabled(boolean disabled);
}
