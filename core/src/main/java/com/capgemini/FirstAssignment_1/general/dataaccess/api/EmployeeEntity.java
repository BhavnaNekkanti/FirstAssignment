package com.capgemini.FirstAssignment_1.general.dataaccess.api;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.capgemini.FirstAssignment_1.general.common.api.Employee;
import com.capgemini.FirstAssignment_1.general.dataaccess.api.ApplicationPersistenceEntity;
import javax.persistence.Transient;

/**
 * @author bnekkant
 */
@Entity
@Table(name = "Employee")
public class EmployeeEntity extends ApplicationPersistenceEntity implements Employee {

  private static final long serialVersionUID = 1L;

  private String firstName;

  private String lastName;

  /**
   * The constructor.
   */
  public EmployeeEntity() {

    super();
  }

  /**
   * @return
   */
  public String getFirstName() {

    return this.firstName;
  }

  /**
   * @param firstName
   */
  public void setFirstName(String firstName) {

    this.firstName = firstName;
  }

  /**
   * @return
   */
  public String getLastName() {

    return this.lastName;
  }

  /**
   * @param lastName
   */
  public void setLastName(String lastName) {

    this.lastName = lastName;
  }

}
