package pac1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class New1Test {
	
	 WebDriver driver;
	 
	 
  @Test(priority = 0)
  public void fTest() {	  	   
	    
	  Assert.assertTrue(true);
	  
		
  }

@Test
public void gllllTest() {	  
	  
	  
	  	  
	 Assert.assertEquals("jj", "jj8");	
	
}



@Test
public void gllllyTest() {	  
	  
	  
	throw new SkipException("i m skipping this tc");
	
}



@Test
public void gllllyyTest() {	  
	  
	  
	throw new SkipException("i m skipping this tc");
	
}






}



