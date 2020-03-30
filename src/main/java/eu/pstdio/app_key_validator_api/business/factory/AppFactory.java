package eu.pstdio.app_key_validator_api.business.factory;

import eu.pstdio.app_key_validator_api.business.message.InputMessage;
import eu.pstdio.app_key_validator_api.integration.entity.AppEntity;

/**
 *
 * @author mib
 */
public interface AppFactory {
    AppEntity create(InputMessage input);
}
