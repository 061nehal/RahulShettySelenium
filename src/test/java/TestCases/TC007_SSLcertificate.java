package TestCases;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class TC007_SSLcertificate {
	
	@Test
	public void sslCertificate() throws MalformedURLException {
		
		DesiredCapabilities dc=DesiredCapabilities.chrome();
		dc.setBrowserName("chrome");
		dc.setPlatform(Platform.WINDOWS);
		dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		//RemoteWebDriver rc=new RemoteWebDriver(new URL(null), dc);
		
		ChromeOptions c=new ChromeOptions();
		c.merge(dc);
	}

}
