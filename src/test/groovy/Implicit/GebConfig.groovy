package test.groovy.Implicit


import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.firefox.FirefoxDriver

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

driver ={ new FirefoxDriver() }

environments {

    firefox {
        driver = {new FirefoxDriver()}
    }

}

baseUrl = "https://demoqa.com/"
reportsDir ="./target/report"
