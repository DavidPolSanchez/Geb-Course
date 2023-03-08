package test

import geb.Browser
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.ie.InternetExplorerDriver
import org.openqa.selenium.edge.EdgeDriver
import org.openqa.selenium.safari.SafariDriver
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.*

def browser = new Browser(driver : new ChromeDriver())
            //new Browser(driver : new FirefoxDriver())
            //new Browser(driver : new SafariDriver())
            //new Browser(driver : new EdgeDriver()))
            //new Browser(driver : new InternetExplorerDriver())

browser.go("http://udemy.com")
