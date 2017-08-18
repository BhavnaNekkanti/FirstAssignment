package com.capgemini.FirstAssignment_1.general.gui.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author bnekkant
 *
 */
@Controller
public class MasterController {

  @RequestMapping(value = "/")

  public String home() {

    System.out.println("this is default");

    return null;
  }

}
