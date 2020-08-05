package cucumberskeleton.config;

import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.IOException;

public class MasterHooks extends DriverFactory {

    @Before
    public void start() throws IOException, InterruptedException {
//        webDriver = BrowserDriverFactory.getDriver(utils.getProperty("browser"));

    }

    @After
    public void tearDown() throws IOException {
//        if (w Driver.quit();
    }

}

