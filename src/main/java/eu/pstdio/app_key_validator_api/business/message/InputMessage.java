package eu.pstdio.app_key_validator_api.business.message;

/**
 *
 * @author mib
 */
public interface InputMessage {
    String getUuid();
    void setUuid(String uuid);
    String getAppKey();
    void setAppKey(String appKey);
}
