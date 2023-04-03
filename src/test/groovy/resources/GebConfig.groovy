

import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions

import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.firefox.FirefoxOptions


waiting {
    timeout=2
    retryInterval= 0.5
    includeCauseInMessage = true

    preset {
        slow{
            timeout = 20
            retryInterval = 1
        }

        verySlow{ timeout = 50 }
    }
}

atCheckWaiting = "slow"
atCheckWaiting = true

driver = {
    FirefoxOptions options = new FirefoxOptions()
    options.addArguments("--headless") // Uncomment this line if you want to run the test in headless mode
    new FirefoxDriver(options)
}

environments {
    firefox {
        driver = {
            FirefoxOptions options = new FirefoxDriver()
            options.addArguments("--headless") // Uncomment this line if you want to run the test in headless mode
            new FirefoxDriver(options)
        }
    }
}