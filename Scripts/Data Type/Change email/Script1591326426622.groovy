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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Internal/Login succeed'), [('username') : '', ('password') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_ ab - AB Mattermost/svg'))

WebUI.click(findTestObject('Object Repository/Page_ ab - AB Mattermost/button_Account Settings'))

WebUI.click(findTestObject('Object Repository/Page_ ab - AB Mattermost/span_Edit'))

WebUI.setText(findTestObject('Page_ ab - AB Mattermost/input_New Email_primaryEmail'), email)

WebUI.setText(findTestObject('Page_ ab - AB Mattermost/input_Confirm Email_confirmEmail'), confirm_email)

WebUI.setEncryptedText(findTestObject('Page_ ab - AB Mattermost/input_Current Password_currentPassword'), password)

WebUI.click(findTestObject('Object Repository/Page_ ab - AB Mattermost/span_Save'))

WebUI.click(findTestObject('Object Repository/Page_ ab - AB Mattermost/span_'))

WebUI.closeBrowser()

