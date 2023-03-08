package test.Simple

import geb.Browser
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.ie.InternetExplorerDriver
import org.openqa.selenium.edge.EdgeDriver
import org.openqa.selenium.safari.SafariDriver
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.*

import groovy.util.logging.Log4j

def browser = new Browser(driver : new ChromeDriver())
            //new Browser(driver : new FirefoxDriver())
            //new Browser(driver : new SafariDriver())
            //new Browser(driver : new EdgeDriver()))
            //new Browser(driver : new InternetExplorerDriver())

browser.go("https://demoqa.com/")

//click on elements display menu
browser.$("div[class='category-cards']").children().first().click()
//click on elements  TextBox display menu
browser.$("[id='item-2']").first().click()
//click on impressive
sleep(5000)
browser.$("[for='yesRadio']").click()

browser.quit()
