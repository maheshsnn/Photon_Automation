package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;




@RunWith(Cucumber.class)
@CucumberOptions(features={"inner.feature"},
glue={"testcases"},
plugin={"html:target/cucmber-html-report","json:target/cucumber.json"},
format={"pretty",""}

)
public class tesdatd {

}
