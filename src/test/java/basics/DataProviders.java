package basics;

import org.testng.annotations.DataProvider;

public class DataProviders {

	@DataProvider(name="amazon product search")
	public Object[][] seachProductNames()
	{
		return new Object [][] {{"shampoo"},{"bed lamp"},{"bedsheets"},{"notebook"}};
	}
	
	@DataProvider(name="Facebook Login Creds")
	public Object[][] facebookLoginCreds()
	{
		return new Object [][] {{"anagha","abc123"},{"arjun","xyz345"},{"anjali","rtr123"}};
	}
	@DataProvider(name="Form Validations")
	public Object[][] formFeilds()
	{
		return new Object [][] {{"Anagha","Koottathazhath","anagha123","kozhikode","kerala","673007"},{"Arjun","Gangadharan","arjun456","kochi","kerala","879009"}};
	}
}
