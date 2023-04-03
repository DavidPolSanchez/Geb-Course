package test.Simple

import geb.Browser
import org.openqa.selenium.chrome.ChromeDriver

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
