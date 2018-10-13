

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MagentoTest {
	@Test
public void posCredentials() throws Exception 
{
		String url="http://www.magento.com";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
		Main m=new Main(driver);
		m.clickOnMyacc();
		Thread.sleep(3000);
		Login l1=new Login(driver);
		l1.typeEmail("sucheendra.abc@gmail.com");
		l1.typePwd("Welcome123");
		l1.clickOnLogin();
		Logout l2=new Logout(driver);
		l2.clickOnLogout();
		driver.quit();
	}

}
