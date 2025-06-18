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

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.website)

WebUI.scrollToElement(findTestObject('Book Store Application/btn_Book Store Application'), 0)

WebUI.click(findTestObject('Book Store Application/btn_Book Store Application'))

WebUI.scrollToElement(findTestObject('Book Store Application/btn_login'), 0)

WebUI.click(findTestObject('Book Store Application/btn_login'))

WebUI.scrollToElement(findTestObject('Book Store Application/Create a New User/btn_New User'), 0)

WebUI.click(findTestObject('Book Store Application/Create a New User/btn_New User'))

WebUI.scrollToElement(findTestObject('Book Store Application/Create a New User/input_First Name'), 0)

WebUI.click(findTestObject('Book Store Application/Create a New User/input_First Name'))

WebUI.setText(findTestObject('Book Store Application/Create a New User/input_First Name'), 'Rhimba')

WebUI.click(findTestObject('Book Store Application/Create a New User/input_Last Name'))

WebUI.setText(findTestObject('Book Store Application/Create a New User/input_Last Name'), 'Aulia')

WebUI.click(findTestObject('Book Store Application/Create a New User/input_Username'))

WebUI.setText(findTestObject('Book Store Application/Create a New User/input_Username'), 'Rhimba Aulia')

WebUI.click(findTestObject('Book Store Application/Create a New User/input_Password'))

WebUI.setText(findTestObject('Book Store Application/Create a New User/input_Password'), 'Rhimba123!')

WebUI.scrollToElement(findTestObject('Book Store Application/Create a New User/btn_Register'), 5)

WebUI.delay(1)

WebUI.click(findTestObject('Book Store Application/Create a New User/btn_Register'))

WebUI.verifyTextPresent('Please verify reCaptcha to register!', false)

WebUI.delay(3)

WebUI.closeBrowser()

