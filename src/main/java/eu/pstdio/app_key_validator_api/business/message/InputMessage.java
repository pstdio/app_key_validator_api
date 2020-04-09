package eu.pstdio.app_key_validator_api.business.message;

/**
 *
 * @author mib
 */
public interface InputMessage {
    String getAppUuid();
    void setAppUuid(String appUuid);
    String getAppKey();
    void setAppKey(String appKey);
}
