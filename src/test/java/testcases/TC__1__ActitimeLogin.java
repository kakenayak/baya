package testcases;

	import java.io.IOException;

	import org.testng.annotations.Test;
	import generics.BaseTest;
import pages_Pom.ActitimeLoginPage;
	public class TC__1__ActitimeLogin extends BaseTest {
	
		@Test
		public void login() throws IOException, InterruptedException
		{
	   ActitimeLoginPage loginPage=new ActitimeLoginPage(driver);
			loginPage.loginMethod();
		}
		
		
}
