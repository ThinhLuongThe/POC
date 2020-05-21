package browserkeyword

import internal.GlobalVariable

public class Environment {
	private String EnvironmentUrl;
	private String CorporateBanksUrl = "operations/88c40ac6-1136-4e8f-94fb-a1aee76b3910/corporate/corporates-banks"

	public static Environment init() {
		new Environment()
	}

	private Environment() {
		EnvironmentUrl  = GlobalVariable.baseUrl
	}

	public String getBasePage(){
		return EnvironmentUrl;
	}

	public String getCorporateBankPage() {
		return EnvironmentUrl + CorporateBanksUrl
	}
}
