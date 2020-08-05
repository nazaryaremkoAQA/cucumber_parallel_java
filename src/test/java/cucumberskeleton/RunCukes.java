package cucumberskeleton;

import cucumber.api.CucumberOptions;
import cucumber.api.java.After;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumberskeleton.config.DriverFactory;
 import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;

//@RunWith(Cucumber.class)
@CucumberOptions(plugin = "json:target/cucumber-report.json")
public class RunCukes extends AbstractTestNGCucumberTests {

    DriverFactory driverFactory = new DriverFactory();
    @DataProvider(parallel = true)
    @Override
    public Object[][] scenarios() {
        return super.scenarios();
    }

    @AfterTest
     public void teardown(){
        driverFactory.quitDriver();
//        DriverFactory.webDriver.quit();
    }
}