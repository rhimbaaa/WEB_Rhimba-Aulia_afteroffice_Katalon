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

WebUI.scrollToElement(findTestObject('Elements/btn_elements'), 0)

WebUI.click(findTestObject('Elements/btn_elements'))

WebUI.click(findTestObject('Elements/Text Box/btn_Text Box'))

WebUI.scrollToElement(findTestObject('Elements/Text Box/input_full name'), 0)

WebUI.click(findTestObject('Elements/Text Box/input_full name'))

WebUI.setText(findTestObject('Elements/Text Box/input_full name'), 'Rhimba Aulia')

WebUI.click(findTestObject('Elements/Text Box/input_email'))

WebUI.setText(findTestObject('Elements/Text Box/input_email'), 'Rhimbaaaaaaa@gmail.com')

WebUI.click(findTestObject('Elements/Text Box/input_alamat'))

WebUI.setText(findTestObject('Elements/Text Box/input_alamat'), 'Jl. Tunjungan Surabaya 234')

WebUI.click(findTestObject('Elements/Text Box/input_permanent_adress'))

WebUI.setText(findTestObject('Elements/Text Box/input_permanent_adress'), 'Perumahan Citra Harmoni Surabaya, Jawa Timur 243 ')

WebUI.click(findTestObject('Elements/Text Box/btn_submit'))

WebUI.closeBrowser()

