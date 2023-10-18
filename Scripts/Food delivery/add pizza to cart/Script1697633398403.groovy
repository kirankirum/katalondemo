import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Food delivery/swiggy search'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Delivery/Page_Order food online from Indias best foo_aa25ef/a_Search'))

WebUI.click(findTestObject('Object Repository/Delivery/Page_Order food online from Indias best foo_aa25ef/img_Popular Cuisines_styles_img__3HNZ4'))

WebUI.click(findTestObject('Object Repository/Delivery/Page_Order food online from Indias best foo_aa25ef/button_Dominos PizzaRestaurant'))

WebUI.click(findTestObject('Object Repository/Delivery/Page_Order food online from Indias best foo_aa25ef/div_Dominos Pizza4.425 MINS400 FOR TWOPizza_6f4937'))

WebUI.click(findTestObject('Object Repository/Delivery/Page_Order food online from Indias best foo_aa25ef/div_ADD'))

WebUI.click(findTestObject('Object Repository/Delivery/Page_Order food online from Indias best foo_aa25ef/span_View Cart'))

WebUI.closeBrowser()

