package test.groovy.Implicit

import geb.Browser

Browser.drive {

//click on elements display menu
    $("div[class='category-cards']").children().first().click()
//click on elements  TextBox display menu
    $("[id='item-1']").first().click()
//fill form

//display first item for see the rest of the radios
    $("[title='Toggle']").click()
//click on the first radio
    $("[for='tree-node-desktop']").find("span").first().click()

}