package test.groovy

import geb.Browser
import geb.spock.GebSpec
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.firefox.FirefoxDriver

class MyGebTest extends GebSpec {

    def "interac with the nav"() {
        def browser = new Browser(driver: new FirefoxDriver())
        given:
        def expected ="Elements"
        browser.go("https://demoqa.com/")

        when:
        //click on elements display menu
        browser.$("div[class='category-cards']").children().first().click()

        then:

        assert browser.$("div[class='main-header']").text() == expected
    }
}