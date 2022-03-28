package com.sha.run;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"../CucumberDemo3/src/test/java/com/sha/features"}
        ,glue = {"com.sha.steps"}
        ,monochrome = true
        ,plugin = {"pretty"}
        ,tags = "@SmokeTest"  //for single test
        //,tags = "@SanityTest or @RegressionTest"  //for multiple test with or condition
        //,tags = "@SanityTest or @End2EndTest and @SmokeTest"  //for multiple test with 'and' & 'or' both condition
        //,tags = "@End2EndTest and @SmokeTest"  //for multiple test with and condition
        //,tags = "@smokeTest and not @SanityTest  // for skip @SanityTest
        //,tags = "not @End2EndTest and not @RegressionTest"  //skip 2 tests
        //,tags = "not@End2EndTest"  // for skip a test
        ,dryRun = false
)
public class RunnerTest {
}
