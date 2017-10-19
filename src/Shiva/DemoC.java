package Shiva;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoC {
	@Test
	public void deleteuser()
	{
		Reporter.log("deleteuser");
	}
	
	@Test(priority=-1)
	public void registeruser()
	{
		Reporter.log("Registeruser");
	}

}
