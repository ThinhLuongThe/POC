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
import com.kms.katalon.core.configuration.RunConfiguration

import internal.GlobalVariable

public class AutomationStructureManager {
	
	private final String dirProject = RunConfiguration.getProjectDir()
	
	private final String pathDocument = "/Document"
	
	private final String pathInvoiceDocument = "/DownloadInvoices";
	
	private String fullPathToDownloadInvoiceDocument;
		
	private static AutomationStructureManager instance;
	
	private AutomationStructureManager()
	{
		// do nothing
	}
	
	public static AutomationStructureManager  getInstance()
	{
		if (instance == null)
		{
			instance = new AutomationStructureManager();
		}
		return instance;
	}
	
	public void initProjectStructure()
	{
		createDownloadInvoiceDocumentFolder()
	}
	
	public String getFullPathToDownloadInvoiceDocument()
	{
		return fullPathToDownloadInvoiceDocument;
	}
	
	private void createDownloadInvoiceDocumentFolder()
	{
		String path = dirProject + pathDocument + pathInvoiceDocument;
		new File(dirProject + pathDocument + pathInvoiceDocument).mkdirs()
		fullPathToDownloadInvoiceDocument = path;
	}	
}