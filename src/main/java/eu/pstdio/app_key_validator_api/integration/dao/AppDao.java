package eu.pstdio.app_key_validator_api.integration.dao;

import eu.pstdio.app_key_validator_api.integration.entity.AppEntity;

/**
 *
 * @author mib
 */
public interface AppDao {
    AppEntity getByUuid(AppEntity entity);
}
