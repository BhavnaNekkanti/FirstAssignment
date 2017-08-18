package com.capgemini.FirstAssignment_1.general.dataaccess.base.dao;

import com.capgemini.FirstAssignment_1.general.dataaccess.api.BinaryObjectEntity;
import com.capgemini.FirstAssignment_1.general.dataaccess.api.dao.BinaryObjectDao;

import javax.inject.Named;

/**
 * Implementation of {@link BinaryObjectDao}.
 *
 */
@Named
public class BinaryObjectDaoImpl extends ApplicationDaoImpl<BinaryObjectEntity> implements BinaryObjectDao {

  @Override
  public Class<BinaryObjectEntity> getEntityClass() {

    return BinaryObjectEntity.class;
  }

}
