package com.capgemini.FirstAssignment_1.general.dataaccess.api.dao;

import com.capgemini.FirstAssignment_1.general.dataaccess.api.dao.ApplicationDao;
import com.capgemini.FirstAssignment_1.general.dataaccess.api.EmployeeEntity;
import com.capgemini.FirstAssignment_1.general.logic.api.to.EmployeeSearchCriteriaTo;
import io.oasp.module.jpa.common.api.to.PaginatedListTo;

/**
 * Data access interface for Employee entities
 */
public interface EmployeeDao extends ApplicationDao<EmployeeEntity> {

  /**
   * Finds the {@link EmployeeEntity employees} matching the given {@link EmployeeSearchCriteriaTo}.
   *
   * @param criteria is the {@link EmployeeSearchCriteriaTo}.
   * @return the {@link PaginatedListTo} with the matching {@link EmployeeEntity} objects.
   */
  PaginatedListTo<EmployeeEntity> findEmployees(EmployeeSearchCriteriaTo criteria);
}
