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
browser.$("ul[class='menu-list']").children().first().click()
//fill form
browser.$("[id='userName']").value "John Doe"
browser.$("[id='userEmail']").value "example@gmail.com"
browser.$("[id='currentAddress']").value "this is my current address"
browser.$("[id='permanentAddress']").value "this is my permanent address"

//click on submit button
browser.$("[id='submit']").click()

//browser.quit()
