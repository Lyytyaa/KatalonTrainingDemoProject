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

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_Username_username'), 'Admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_OrangeHRM/input_Password_password'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/button_Login'))

WebUI.verifyTextPresent('Time at Work', false)

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/span_Admin'))

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/h5_System Users'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/span_PIM'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/h5_Employee Information'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/span_Leave'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/h5_Leave List'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/span_Time'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/h6_Select Employee'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/span_Recruitment'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/h5_Candidates'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/a_My Info'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/h6_24242423 Collings'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/span_Performance'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/h5_Employee Reviews'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/a_Dashboard'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/p_Time at Work'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/span_Directory'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/h5_Directory'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/span_Maintenance'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/button_Cancel'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/span_Buzz'))

