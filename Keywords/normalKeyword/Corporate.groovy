package normalKeyword

public class Corporate {
	Random rand = new Random()
	int range = 1000
	String foo = 'Foo'
	String txtIntCorporateID
	String txtDUNSNumber
	String txtLegalentityIdentifier
	String txtUKCompanyNumber
	String txtACRA_UEN
	String txtName
	String txaSummaryDescription
	String selScale
	String selRating
	String selSectorClassification
	String selIndustryGroup
	String txtPrivateName
	String txtPrivateNameContact
	String txtPrivateEmailContact
	String txtCompanyRegistrationNumber
	String txtBusinessAddress_Add1
	String txtBusinessAddress_Add2
	String txtBusinessAddress_City
	String txtBusinessAddress_Region
	String txtBusinessAddress_PostalCode
	String txtBusinessAddress_Country
	
	
	public Corporate (int range){
		txtIntCorporateID = foo+rand.nextInt(range)
		txtDUNSNumber = foo+rand.nextInt(range)
		txtLegalentityIdentifier = foo+rand.nextInt(range)
		txtUKCompanyNumber = foo+rand.nextInt(range)
		txtACRA_UEN = foo+rand.nextInt(range)
		txtName = foo+rand.nextInt(range)
		txaSummaryDescription = foo+rand.nextInt(range)
		selScale
		selRating
		selSectorClassification
		selIndustryGroup
		txtPrivateName = foo+rand.nextInt(range)
		txtPrivateNameContact = foo+rand.nextInt(range)
		txtPrivateEmailContact = 'soul1@mailinator.com'
		txtCompanyRegistrationNumber = rand.nextInt(range)
		txtBusinessAddress_Add1 = foo+rand.nextInt(range)
		txtBusinessAddress_Add2 = foo+rand.nextInt(range)
		txtBusinessAddress_City = foo+rand.nextInt(range)
		txtBusinessAddress_Region = foo+rand.nextInt(range)
		txtBusinessAddress_PostalCode = foo+rand.nextInt(range)
		txtBusinessAddress_Country
	}
}
