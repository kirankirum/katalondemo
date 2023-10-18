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

WebUI.navigateToUrl('https://www.naukri.com/registration/')

WebUI.setText(findTestObject('Page_Register on Naukri.com Apply to Millions of Jobs Online/input_Full name_name'), 'Kiran')

WebUI.setText(findTestObject('Page_Register on Naukri.com Apply to Millions of Jobs Online/input_Email ID_email'), 'kirankishu124@gmail.com')

WebUI.setText(findTestObject('Page_Register on Naukri.com Apply to Millions of Jobs Online/input_Mobile number_mobile'), 
    '8317482527')

WebUI.setEncryptedText(findTestObject('Page_Register on Naukri.com Apply to Millions of Jobs Online/input_Password_password'), 
    'C2WQ3vqOQ82bhfFklBBukA==')

WebUI.click(findTestObject('Page_Register on Naukri.com Apply to Millions of Jobs Online/i_Minimum 6 characters required_showPass resman-icon resman-icon-eye-closed resman-pos-right'))

WebUI.click(findTestObject('Page_Register on Naukri.com Apply to Millions of Jobs Online/div_Im experienced  I have work experience (excluding internships)'))

WebUI.click(findTestObject('Page_Register on Naukri.com Apply to Millions of Jobs Online/span_An account with this email address already exists. Login'))

