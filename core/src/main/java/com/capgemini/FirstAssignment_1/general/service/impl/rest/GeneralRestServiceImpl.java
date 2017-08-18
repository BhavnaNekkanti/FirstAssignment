package com.capgemini.FirstAssignment_1.general.service.impl.rest;

import com.capgemini.FirstAssignment_1.general.common.api.Employee;
import com.capgemini.FirstAssignment_1.general.logic.api.General;
import com.capgemini.FirstAssignment_1.general.logic.api.to.EmployeeEto;
import com.capgemini.FirstAssignment_1.general.logic.api.to.EmployeeSearchCriteriaTo;
import com.capgemini.FirstAssignment_1.general.service.api.rest.GeneralRestService;

import io.oasp.module.jpa.common.api.to.PaginatedListTo;

import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.BadRequestException;
import javax.ws.rs.NotFoundException;

/**
 * The service implementation for REST calls in order to execute the logic of component {@link General}.
 */
@Named("GeneralRestService")
public class GeneralRestServiceImpl implements GeneralRestService {

  @Inject
  private General general;

  @Override
  public EmployeeEto getEmployee(long id) {

    return this.general.findEmployee(id);
  }

  @Override
  public EmployeeEto saveEmployee(EmployeeEto employee) {

    return this.general.saveEmployee(employee);
  }

  @Override
  public void deleteEmployee(long id) {

    this.general.deleteEmployee(id);
  }

  @Override
  public PaginatedListTo<EmployeeEto> findEmployeesByPost(EmployeeSearchCriteriaTo searchCriteriaTo) {

    return this.general.findEmployeeEtos(searchCriteriaTo);
  }

}