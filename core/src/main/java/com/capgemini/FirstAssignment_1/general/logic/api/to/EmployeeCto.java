package com.capgemini.FirstAssignment_1.general.logic.api.to;

import com.capgemini.FirstAssignment_1.general.common.api.to.AbstractCto;
import com.capgemini.FirstAssignment_1.general.common.api.Employee;

import java.util.List;
import java.util.Set;

/**
 * Composite transport object of Employee
 */
public class EmployeeCto extends AbstractCto {

  private static final long serialVersionUID = 1L;

  private EmployeeEto employee;

  public EmployeeEto getEmployee() {

    return employee;
  }

  public void setEmployee(EmployeeEto employee) {

    this.employee = employee;
  }

}
