package com.capgemini.FirstAssignment_1.general.logic.api.to;

import io.oasp.module.jpa.common.api.to.SearchCriteriaTo;

/**
 * This is the {@link SearchCriteriaTo search criteria} {@link net.sf.mmm.util.transferobject.api.TransferObject TO}
 * used to find {@link com.capgemini.FirstAssignment_1.general.common.api.Employee}s.
 *
 */
public class EmployeeSearchCriteriaTo extends SearchCriteriaTo {

  private static final long serialVersionUID = 1L;

  private String firstName;

  private String lastName;

  /**
   * The constructor.
   */
  public EmployeeSearchCriteriaTo() {

    super();
  }

  public String getFirstName() {

    return firstName;
  }

  public void setFirstName(String firstName) {

    this.firstName = firstName;
  }

  public String getLastName() {

    return lastName;
  }

  public void setLastName(String lastName) {

    this.lastName = lastName;
  }

}
