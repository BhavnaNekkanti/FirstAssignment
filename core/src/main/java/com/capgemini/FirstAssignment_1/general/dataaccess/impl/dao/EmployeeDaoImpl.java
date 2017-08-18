package com.capgemini.FirstAssignment_1.general.dataaccess.impl.dao;

import javax.inject.Named;

import com.capgemini.FirstAssignment_1.general.dataaccess.api.EmployeeEntity;
import com.capgemini.FirstAssignment_1.general.dataaccess.api.dao.EmployeeDao;
import com.capgemini.FirstAssignment_1.general.dataaccess.base.dao.ApplicationDaoImpl;
import com.capgemini.FirstAssignment_1.general.logic.api.to.EmployeeSearchCriteriaTo;
import com.mysema.query.alias.Alias;
import com.mysema.query.jpa.impl.JPAQuery;
import com.mysema.query.types.path.EntityPathBase;

import io.oasp.module.jpa.common.api.to.PaginatedListTo;

/**
 * This is the implementation of {@link EmployeeDao}.
 */
@Named
public class EmployeeDaoImpl extends ApplicationDaoImpl<EmployeeEntity> implements EmployeeDao {

  /**
   * The constructor.
   */
  public EmployeeDaoImpl() {

    super();
  }

  @Override
  public Class<EmployeeEntity> getEntityClass() {

    return EmployeeEntity.class;
  }

  @Override
  public PaginatedListTo<EmployeeEntity> findEmployees(EmployeeSearchCriteriaTo criteria) {

    EmployeeEntity employee = Alias.alias(EmployeeEntity.class);
    EntityPathBase<EmployeeEntity> alias = Alias.$(employee);
    JPAQuery query = new JPAQuery(getEntityManager()).from(alias);

    String firstName = criteria.getFirstName();
    if (firstName != null) {
      query.where(Alias.$(employee.getFirstName()).eq(firstName));
    }
    String lastName = criteria.getLastName();
    if (lastName != null) {
      query.where(Alias.$(employee.getLastName()).eq(lastName));
    }
    return findPaginated(criteria, query, alias);
  }

}