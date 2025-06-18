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
import com.kms.katalon.core.testobject.ConditionType as ConditionType

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.website)

WebUI.scrollToElement(findTestObject('Forms/btn_forms'), 0)

WebUI.click(findTestObject('Forms/btn_forms'))

WebUI.doubleClick(findTestObject('Forms/btn_Practice'))

WebUI.scrollToElement(findTestObject('Forms/input_first name'), 0)

WebUI.click(findTestObject('Forms/input_first name'))

WebUI.setText(findTestObject('Forms/input_first name'), 'Rhimba')

WebUI.click(findTestObject('Forms/input_lastname'))

WebUI.setText(findTestObject('Forms/input_lastname'), 'Aulia')

String timestamp = System.currentTimeMillis().toString()

int randomNumber = new Random().nextInt(1000) + 1

String emailUnik = ('Rhimba' + randomNumber) + '@gmail.com'

WebUI.click(findTestObject('Forms/input_email'))

WebUI.setText(findTestObject('Forms/input_email'), emailUnik)

println('Email yang digunakan: ' + emailUnik)

WebUI.click(findTestObject('Forms/input_mobile number'))

String nomorTeleponUnik = '08' + System.currentTimeMillis().toString().substring(5, 13)

println('Nomor telepon unik: ' + nomorTeleponUnik)

WebUI.setText(findTestObject('Forms/input_mobile number'), nomorTeleponUnik)

WebUI.click(findTestObject('Forms/verify forms/Page_DEMOQA/input_tanggal lahir form'))

WebUI.click(findTestObject('Forms/verify forms/Page_DEMOQA/bulan'))

WebUI.click(findTestObject('Forms/januari'))

WebUI.click(findTestObject('Forms/verify forms/Page_DEMOQA/tahun'))

WebUI.click(findTestObject('Forms/2006'))

WebUI.click(findTestObject('Forms/tanggal_7'))

WebUI.click(findTestObject('Forms/btn_gender'))

// Inisialisasi objek
TestObject inputSubject = new TestObject().addProperty('xpath', ConditionType.EQUALS, '//input[@id=\'subjectsInput\']')

// Klik dan isi
WebUI.click(inputSubject)

WebUI.sendKeys(inputSubject, 'Maths')

WebUI.delay(1 // kasih waktu muncul suggestion
    )

WebUI.sendKeys(inputSubject, Keys.chord(Keys.ENTER))

WebUI.scrollToElement(findTestObject('Forms/btn_hobbies'), 0)

WebUI.click(findTestObject('Forms/btn_hobbies'))

// Dapatkan direktori project sekarang
String projectDir = System.getProperty('user.dir')

// Gabungkan path relatif ke file foto
String filePath = projectDir + '//Data Files//Fotoku.jpg'

// Upload file
WebUI.uploadFile(findTestObject('Forms/input_upload foto'), filePath)

WebUI.click(findTestObject('Forms/input_alamat'))

WebUI.setText(findTestObject('Forms/input_alamat'), 'Jl.Merdeka Tunjungan 45 Soekarno ')

// Klik dropdown State
WebUI.click(findTestObject('Forms/dropdown_state'))

// Pilih NCR dari dropdown
WebUI.click(findTestObject('Forms/option_state_NCR'))

// Tunggu sedikit agar kota bisa dimuat
WebUI.delay(1)

// Klik dropdown City
WebUI.click(findTestObject('Forms/dropdown_city'))

// Pilih Delhi dari City
WebUI.click(findTestObject('Forms/option_city_Delhi'))

WebUI.click(findTestObject('Forms/btn_submit'))

WebUI.verifyElementVisible(findTestObject('Forms/label_result_title'))

// Verifikasi hasil
verifyResultField('Student Name', 'Rhimba Aulia')

verifyResultField('Student Email', emailUnik)

verifyResultField('Gender', 'Female')

WebUI.delay(5)

WebUI.closeBrowser()

def verifyResultField(String label, String expectedValue) {
    String xpath = "//tr[td[1][normalize-space()='$label']]/td[2]"

    TestObject field = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath)

    WebUI.verifyElementText(field, expectedValue)
}

