package base

import browserkeyword.BrowserKeyword
import browserkeyword.Environment
import browserkeyword.IBrowserKeywords
import interfacePageObject.ICorporateDetails
import interfacePageObject.ICreateBusinessAddressForm
import interfacePageObject.ICreateCorporateForm
import interfacePageObject.ILoginPage

public class BaseSteps {

	protected IBrowserKeywords browserkeyword = new BrowserKeyword();

	protected Environment environment  = Environment.init()

	protected  <T> Class getPageObjectImplementation(String classPathToProxy)
	throws Exception {
		// Use reflections to load the given class
		ClassLoader classLoader = BaseSteps.class.getClassLoader();
		Class impl = classLoader.loadClass(classPathToProxy);
		return impl;
	}



	protected  <T> T getPageObject(String classPathToProxy) throws Exception {
		T page = null;
		Class<T> pageClassToProxy = getPageObjectImplementation(classPathToProxy);
		page = pageClassToProxy.getDeclaredConstructor().newInstance();
		return page;
	}


	public ILoginPage getILoginPageObject(){
		return getPageObject('pageObject.LoginPage')
	}

	public ICreateCorporateForm getICorporateForm(){
		return getPageObject('pageObject.CreateCorporateForm')
	}
	
	public ICorporateDetails getICorporateDetails(){
		return getPageObject('pageObject.CorporateDetails')
	}

	public ICreateBusinessAddressForm getIBusinessAddressForm(){
		return getPageObject('pageObject.CreateBusinessAddressForm')
	}
}
