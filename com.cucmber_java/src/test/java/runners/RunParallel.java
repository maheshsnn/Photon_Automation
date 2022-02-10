package runners;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"D:\\Workplace\\Photon_Automation\\com.cucmber_java\\Alldocfiles\\testfile.feature"},
glue={"testcases"})
public class RunParallel  {

    
}