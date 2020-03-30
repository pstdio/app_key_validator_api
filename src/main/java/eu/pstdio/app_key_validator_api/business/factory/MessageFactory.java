package eu.pstdio.app_key_validator_api.business.factory;

/**
 *
 * @author mib
 */
public interface MessageFactory {
    <T> T create(String message, Class clazz);
}
