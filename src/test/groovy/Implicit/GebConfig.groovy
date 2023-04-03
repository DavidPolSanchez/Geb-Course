package test.groovy.Implicit


import org.openqa.selenium.chrome.ChromeDriver

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

driver ={ new ChromeDriver() }

environments {

    chrome {
        driver = {new ChromeDriver()}
    }

}

baseUrl = "https://demoqa.com/"
reportsDir ="./target/report"
