package eu.pstdio.app_key_validator_api.integration.entity;

/**
 *
 * @author mib
 */
public interface AppEntity {
    String getKey();
    void setKey(String key);
    String getUuid();
    void setUuid(String key);
    boolean isDisabled();
    void setDisabled(boolean disabled);
}
