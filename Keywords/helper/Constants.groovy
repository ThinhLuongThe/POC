package helper

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class Constants {

	public static class TestData {
		public static final String AR_MAIN_TEXT = " الرئيسية "

		public static final String AR_APPLICATIONS_TEXT = " تطبيقات "

		public static final String AR_CALLUS_TEXT = " اتصل بنا "

		public static final String SUBSCRIBE_THIS_CARD_TEXT = "إشترك باستعمال هذه البطاقة"

		public static final String AR_TERMSANDCONDITIONS_TEXT = " الشروط والأحكام "

		public static final String AR_PrivacyPolicy_TEXT = " سياسة الخصوصية "

		public static final String AR_Btn_Shahid_PLus = "جرب SHAHID PLUS"

		public static final String AR_EXPERIED_SUBSCRIPTION = "اشتراكك فعال حتى ٢٦ يونيو ٢٠١٩"

		public static final String LINK_FOOTER_MAIN =  "https://shahid-qc-pyco-web.shahid.net/ar/home"

		public static final String LINK_FOOTER_CALL_US =  "https://shahid-qc-pyco-web.shahid.net/ar/contact-us"

		public static final String LINK_FOOTER_APPLICATIONS =  "https://shahid-qc-pyco-web.shahid.net/ar/applications"

		public static final String LINK_FOOTER_TERMS_AND_CONDITIONS =  "https://shahid-qc-pyco-web.shahid.net/ar/terms-and-conditions"

		public static final String LINK_FOOTER_PRIVACY_POLICY =  "http://www.mbc.net/ar/privacy.html"

		public static final String LINK_SUBCRTIPION_PAYMENT_METHOD = "https://shahid-qc-pyco-web.shahid.net/ar/widgets/payment-methods"

		public static final String CHECK_OUT_SAND_BOX_URL = "https://3ds2-sandbox.ckotech.co/interceptor"

		public static final String EMPTY_TEXT = ""

		public static final String SOFT_ASSERTION_BROWSER_KEYWORK = "SOFT"

		public static final String BROWSER_KEYWORK = "BrowserKeyword"

		public static final String LINK_3DS = "https://3ds2-sandbox.ckotech.co/"

		public static final String PASSWORD_3DS = "Checkout1!"
	}

	public static class Attribute {
		public static final String HREF = "href"

		public static final String VALUE = "value"
	}

	public static class Platform {
		public static final String iOS = "iOS"
	}

	public static class Flow {
		public static final String SUBSCRIPTION = "SUBSCRIPTION"
	}

	public static class SelectorType {
		public static final String XPATH = "xpath"
	}

	public static class Pages {
		public static final String HOMEPAGE = "home"

		public static final String LOGINPAGE = "login"
	}

	public static class Social {
		public static final String FACEBOOK = "Facebook"

		public static final String GOOGLE = "Google"
	}
}
