package com.polestar.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(		
        features = "src/test/resources/features",
        glue = {"com.polestar.steps", "com.polestar.setup"},        
        monochrome = true,
        strict = true
)
public class TestRunner {
}