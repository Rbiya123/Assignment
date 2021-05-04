

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
		
		WebElement firstname=driver.findElement(By.xpath("//input[@name='firstname']"));
		firstname.sendKeys("abcd");

		WebElement lastname=driver.findElement(By.xpath("//input[@name='lastname']"));
		lastname.sendKeys("xyz");
		
		WebElement reg_email=driver.findElement(By.xpath("//input[@name='reg_email__']"));
		reg_email.sendKeys("abcd@gmail.com");
		
		
		WebElement confirmation_email=driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		confirmation_email.sendKeys("abcd@gmail.com");
		
		
		
		
		WebElement reg_passwd=driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		reg_passwd.sendKeys("abc123");
	
	
		WebElement ele=driver.findElement(By.id("day"));
		Select s = new Select(ele);
		s.selectByValue("19");
		
		
		
		
		WebElement ele1=driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select s1 = new Select(ele1);
		s1.selectByValue("10");
		
		WebElement ele2=driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select s2 = new Select(ele2);
		s2.selectByValue("1996");
		//s2.selectByVisibleText("2000");
		
		

		WebElement FemaleRadiobtn=driver.findElement(By.xpath("//label[text()='Female']"));
		FemaleRadiobtn.click();
		
		

		WebElement MaleRadiobtn=driver.findElement(By.xpath("//label[text()='Male']"));
		MaleRadiobtn.click();
		
		

		WebElement Custom=driver.findElement(By.xpath("//label[text()='Custom']"));
				Custom.click();
		
		
				
		WebElement preferred_pronoun=driver.findElement(By.xpath("//select[@name='preferred_pronoun']"));
		Select s3 = new Select(preferred_pronoun);		
		s3.selectByVisibleText("She: \"Wish her a happy birthday!\"");
		
		

		WebElement 	custom_gender=driver.findElement(By.xpath("//input[@class='_8esa']"));
		custom_gender.sendKeys("female");
		
		
		
		WebElement 	signupbtn=driver.findElement(By.xpath("//button[@name='websubmit']"));
		//signupbtn.click();
		
		//driver.close();

		
	
				
				
	}

}

