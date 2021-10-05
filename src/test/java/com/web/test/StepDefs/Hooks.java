package com.web.test.StepDefs;

import cucumber.api.java.After;
import cucumber.api.java.Before;

import static com.web.test.utils.DriverUtils.getDriver;
import static com.web.test.utils.DriverUtils.tearDown;

public class Hooks {
    //control slash
    @Before
   public void setUp(){
        getDriver(); }

    @After
    public void teardown(){
   tearDown();
 }
}
