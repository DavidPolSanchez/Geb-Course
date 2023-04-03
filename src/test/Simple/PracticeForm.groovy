package test.Simple

import geb.Browser
import org.openqa.selenium.chrome.ChromeDriver

def browser = new Browser(driver : new ChromeDriver())
            //new Browser(driver : new FirefoxDriver())
            //new Browser(driver : new SafariDriver())
            //new Browser(driver : new EdgeDriver()))
            //new Browser(driver : new InternetExplorerDriver())

browser.go("https://demoqa.com/")
browser.getDriver().manage().window().maximize()

//click on elements display menu
    //browser.$("div[class='category-cards']").children().first().next().click()
browser.$(" div[class='category-cards'] > div:nth-child(2)").click()
//click on Forms
browser.$(" div:nth-child(2) > div > ul > li").first().click()
//fill form

//Name
//lastName
//Email
//gender
//Mobile
//Date Of Birth
//Subject
//Hobbies
//picture
browser.$("[id='uploadPicture']").value("C:\\Users\\David Pol\\WORKSPACE\\GITHUB\\Geb-Course\\logo.png")
//Current
//State And City

browser.quit()
