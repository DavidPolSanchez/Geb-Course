package test.groovy

import geb.Browser
import geb.spock.GebSpec
import org.openqa.selenium.chrome.ChromeDriver

class MyGebTest extends GebSpec {

    def "Search for a product on Amazon"() {
        def browser = new Browser(driver: new ChromeDriver())
        given:
        x=x

        when:
        browser.$("input#twotabsearchtextbox").value("Geb Book").submit()

        then:
        1 == 1
    }
}