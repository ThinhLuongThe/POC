package helper

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.util.KeywordUtil
import internal.GlobalVariable

public class FileHelper {
	private File file;
	private FileWriter fileWritter;
	private BufferedReader bufferReader;
	private BufferedWriter bufferWriter;
	private FileReader fileReader;
	List<String> lines;
	private String filePath;
	private static FileHelper instance;

	public FileHelper(String filePath) {
		lines = new ArrayList<>();
		this.filePath = filePath;
		file = new File(filePath);
		fileReader = new FileReader(file);
		bufferReader = new BufferedReader(fileReader);
	}

	static FileHelper getInstance(String filePath) {
		if (instance == null) {
			return new FileHelper(filePath)
		}
		return instance;
	}

	public List<String> readFile() {
		String line= "";
		while ((line = getDataFromLine()) != null) {
			lines.add(line);
		}
		
		if (isEmptyFile())
		{
			throw new Exception("file are empty")
		}
		fileReader.close();
		bufferReader.close();
		return lines;
	}

	public void removeUsedCode() {
		lines.remove(0);
	}

	public void updateToFile() {
		fileWritter = new FileWriter(file);
		bufferWriter = new BufferedWriter(fileWritter);
		for (String str : lines) {
			bufferWriter.write(str + System.lineSeparator())
		}
		bufferWriter.close();
		fileWritter.close();
	}
	
	
	private String getDataFromLine() {
		return  bufferReader.readLine();
	}
	
	private boolean isEmptyFile()
	{
		if(lines.size() == 0 || lines.get(0) == null)
		{
			return true
		}
		return false;
	}
}
