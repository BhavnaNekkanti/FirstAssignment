package com.capgemini.FirstAssignment_1.general.logic.impl;

import com.capgemini.FirstAssignment_1.general.logic.base.AbstractComponentFacade;
import com.capgemini.FirstAssignment_1.general.common.api.constants.PermissionConstants;
import com.capgemini.FirstAssignment_1.general.dataaccess.api.EmployeeEntity;
import com.capgemini.FirstAssignment_1.general.dataaccess.api.dao.EmployeeDao;
import com.capgemini.FirstAssignment_1.general.logic.api.General;
import com.capgemini.FirstAssignment_1.general.logic.api.to.EmployeeEto;
import com.capgemini.FirstAssignment_1.general.logic.api.to.EmployeeSearchCriteriaTo;

import io.oasp.module.jpa.common.api.to.PaginatedListTo;

import java.util.List;
import java.util.Objects;

import javax.inject.Inject;
import javax.inject.Named;
import javax.annotation.security.RolesAllowed;

import org.springframework.transaction.annotation.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Implementation of component interface of general
 */
@Named
@Transactional
public class GeneralImpl extends AbstractComponentFacade implements General {

  /** Logger instance. */
  private static final Logger LOG = LoggerFactory.getLogger(GeneralImpl.class);

  /** @see #getEmployeeDao() */
  @Inject
  private EmployeeDao employeeDao;

  /**
   * The constructor.
   */
  public GeneralImpl() {
    super();
  }

  @Override
  public EmployeeEto findEmployee(Long id) {

    LOG.debug("Get Employee with id {} from database.", id);
    return getBeanMapper().map(getEmployeeDao().findOne(id), EmployeeEto.class);
  }

  @Override
  public PaginatedListTo<EmployeeEto> findEmployeeEtos(EmployeeSearchCriteriaTo criteria) {

    criteria.limitMaximumPageSize(MAXIMUM_HIT_LIMIT);
    PaginatedListTo<EmployeeEntity> employees = getEmployeeDao().findEmployees(criteria);
    return mapPaginatedEntityList(employees, EmployeeEto.class);
  }

  @Override
  public boolean deleteEmployee(Long employeeId) {

    EmployeeEntity employee = getEmployeeDao().find(employeeId);
    getEmployeeDao().delete(employee);
    LOG.debug("The employee with id '{}' has been deleted.", employeeId);
    return true;
  }

  @Override
  public EmployeeEto saveEmployee(EmployeeEto employee) {

    Objects.requireNonNull(employee, "employee");
    EmployeeEntity employeeEntity = getBeanMapper().map(employee, EmployeeEntity.class);

    // initialize, validate employeeEntity here if necessary
    EmployeeEntity resultEntity = getEmployeeDao().save(employeeEntity);
    LOG.debug("Employee with id '{}' has been created.", resultEntity.getId());

    return getBeanMapper().map(resultEntity, EmployeeEto.class);
  }

  /**
   * Returns the field 'employeeDao'.
   * 
   * @return the {@link EmployeeDao} instance.
   */
  public EmployeeDao getEmployeeDao() {

    return this.employeeDao;
  }

}