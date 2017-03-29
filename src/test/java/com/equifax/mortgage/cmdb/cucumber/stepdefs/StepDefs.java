package com.equifax.mortgage.cmdb.cucumber.stepdefs;

import com.equifax.mortgage.cmdb.Angular2AppApp;

import org.springframework.boot.test.SpringApplicationContextLoader;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

@WebAppConfiguration
@ContextConfiguration(classes = Angular2AppApp.class, loader = SpringApplicationContextLoader.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
