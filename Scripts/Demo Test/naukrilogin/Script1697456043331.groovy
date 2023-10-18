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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.naukri.com/')

WebUI.click(findTestObject('Object Repository/Page_Jobs - Recruitment - Job Search - Empl_e20c83/a_Register'))

WebUI.setText(findTestObject('Object Repository/Page_Register on Naukri.com Apply to Millio_3a6e3e/input_Full name_name'), 
    'Kiran')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Register on Naukri.com Apply to Millio_3a6e3e/input_Password_password'), 
    'C2WQ3vqOQ81ufrwyymNsrA==')

WebUI.click(findTestObject('Object Repository/Page_Register on Naukri.com Apply to Millio_3a6e3e/i_Minimum 6 characters required_showPass re_2d3fba'))

WebUI.setText(findTestObject('Object Repository/Page_Register on Naukri.com Apply to Millio_3a6e3e/input_Mobile number_mobile'), 
    '8317482527')

WebUI.click(findTestObject('Object Repository/Page_Register on Naukri.com Apply to Millio_3a6e3e/div_Im experienced  I have work experience _7f637a'))

WebUI.click(findTestObject('Object Repository/Page_Register on Naukri.com Apply to Millio_3a6e3e/button_Upload Resume'))

WebUI.click(findTestObject('Object Repository/Page_Register on Naukri.com Apply to Millio_3a6e3e/button_Register now'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Register on Naukri.com Apply to Millio_3a6e3e/span_An account with this email address alr_fda757'), 
    'An account with this email address already exists. Login')

WebUI.closeBrowser()

