package com.capgemini.FirstAssignment_1.general.logic.api;

import com.capgemini.FirstAssignment_1.general.logic.api.to.EmployeeEto;
import com.capgemini.FirstAssignment_1.general.logic.api.to.EmployeeSearchCriteriaTo;

import io.oasp.module.jpa.common.api.to.PaginatedListTo;

/**
 * Interface for General component.
 */
public interface General {
  /**
   * Returns a Employee by its id 'id'.
   *
   * @param id The id 'id' of the Employee.
   * @return The {@link EmployeeEto} with id 'id'
   */
  EmployeeEto findEmployee(Long id);

  /**
   * Returns a paginated list of Employees matching the search criteria.
   *
   * @param criteria the {@link EmployeeSearchCriteriaTo}.
   * @return the {@link List} of matching {@link EmployeeEto}s.
   */
  PaginatedListTo<EmployeeEto> findEmployeeEtos(EmployeeSearchCriteriaTo criteria);

  /**
   * Deletes a employee from the database by its id 'employeeId'.
   *
   * @param employeeId Id of the employee to delete
   * @return boolean <code>true</code> if the employee can be deleted, <code>false</code> otherwise
   */
  boolean deleteEmployee(Long employeeId);

  /**
   * Saves a employee and store it in the database.
   *
   * @param employee the {@link EmployeeEto} to create.
   * @return the new {@link EmployeeEto} that has been saved with ID and version.
   */
  EmployeeEto saveEmployee(EmployeeEto employee);

}