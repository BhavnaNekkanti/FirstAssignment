package com.capgemini.FirstAssignment_1.general.common.api;

import com.capgemini.FirstAssignment_1.general.common.api.ApplicationEntity;

public interface Employee extends ApplicationEntity {

  public String getFirstName();

  public void setFirstName(String firstName);

  public String getLastName();

  public void setLastName(String lastName);

}
