package com.capgemini.FirstAssignment_1.general.logic.api.to;

import com.capgemini.FirstAssignment_1.general.common.api.Employee;
import com.capgemini.FirstAssignment_1.general.dataaccess.api.ApplicationPersistenceEntity;

/**
 * Entity transport object of Employee
 */
public class EmployeeEto extends ApplicationPersistenceEntity implements Employee {

  private static final long serialVersionUID = 1L;

  private String firstName;

  private String lastName;

  @Override
  public String getFirstName() {

    return this.firstName;
  }

  @Override
  public void setFirstName(String firstName) {

    this.firstName = firstName;
  }

  @Override
  public String getLastName() {

    return this.lastName;
  }

  @Override
  public void setLastName(String lastName) {

    this.lastName = lastName;
  }

  @Override
  public int hashCode() {

    final int prime = 31;
    int result = super.hashCode();
    result = prime * result + ((this.firstName == null) ? 0 : this.firstName.hashCode());
    result = prime * result + ((this.lastName == null) ? 0 : this.lastName.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {

    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    // class check will be done by super type EntityTo!
    if (!super.equals(obj)) {
      return false;
    }
    EmployeeEto other = (EmployeeEto) obj;
    if (this.firstName == null) {
      if (other.firstName != null) {
        return false;
      }
    } else if (!this.firstName.equals(other.firstName)) {
      return false;
    }
    if (this.lastName == null) {
      if (other.lastName != null) {
        return false;
      }
    } else if (!this.lastName.equals(other.lastName)) {
      return false;
    }
    return true;
  }
}
