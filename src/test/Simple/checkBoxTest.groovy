package test.Simple

import geb.Browser
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.firefox.FirefoxDriver

def browser = new Browser(driver : new FirefoxDriver())
            //new Browser(driver : new ChromeDriver())
            //new Browser(driver : new SafariDriver())
            //new Browser(driver : new EdgeDriver()))
            //new Browser(driver : new InternetExplorerDriver())

browser.go("https://demoqa.com/")

//click on elements display menu
browser.$("div[class='category-cards']").children().first().click()
//click on elements  TextBox display menu
browser.$("[id='item-1']").first().click()
//fill form

//display first item for see the rest of the radios
browser.$("[title='Toggle']").click()
//click on the first radio
browser.$("[for='tree-node-desktop']").find("span").first().click()

//browser.quit()
