package com.capgemini.FirstAssignment_1.general.service.api.rest;

import com.capgemini.FirstAssignment_1.general.common.api.Employee;
import com.capgemini.FirstAssignment_1.general.logic.api.General;
import com.capgemini.FirstAssignment_1.general.logic.api.to.EmployeeEto;
import com.capgemini.FirstAssignment_1.general.logic.api.to.EmployeeSearchCriteriaTo;
import io.oasp.module.jpa.common.api.to.PaginatedListTo;

import javax.ws.rs.BadRequestException;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * The service interface for REST calls in order to execute the logic of component {@link General}.
 */
@Path("/general/v1")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface GeneralRestService {

  /**
   * Delegates to {@link General#findEmployee}.
   *
   * @param id the ID of the {@link EmployeeEto}
   * @return the {@link EmployeeEto}
   */
  @GET
  @Path("/employee/{id}/")
  public EmployeeEto getEmployee(@PathParam("id") long id);

  /**
   * Delegates to {@link General#saveEmployee}.
   *
   * @param employee the {@link EmployeeEto} to be saved
   * @return the recently created {@link EmployeeEto}
   */
  @POST
  @Path("/employee/")
  public EmployeeEto saveEmployee(EmployeeEto employee);

  /**
   * Delegates to {@link General#deleteEmployee}.
   *
   * @param id ID of the {@link EmployeeEto} to be deleted
   */
  @DELETE
  @Path("/employee/{id}/")
  public void deleteEmployee(@PathParam("id") long id);

  /**
   * Delegates to {@link General#findEmployeeEtos}.
   *
   * @param searchCriteriaTo the pagination and search criteria to be used for finding employees.
   * @return the {@link PaginatedListTo list} of matching {@link EmployeeEto}s.
   */
  @Path("/employee/search")
  @POST
  public PaginatedListTo<EmployeeEto> findEmployeesByPost(EmployeeSearchCriteriaTo searchCriteriaTo);

}