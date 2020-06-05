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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://mattermost-5171.herokuapp.com/login')

for (int i = 0; i < 4; i++) {
    WebUI.setText(findTestObject('Page_Mattermost/input_username'), username)

    WebUI.setEncryptedText(findTestObject('Page_Mattermost/input_password'), password)

    WebUI.click(findTestObject('Object Repository/Page_Mattermost/span_Sign in'))

    loginSucceed = findTestObject('Object Repository/Page_Town Square - hotpink Mattermost/btn_hambergerMenu')

    WebUI.click(findTestObject('Page_Town Square - hotpink Mattermost/btn_hambergerMenu'))

    WebUI.click(findTestObject('Object Repository/Page_Town Square - hotpink Mattermost/button_Logout (1)'))
}

