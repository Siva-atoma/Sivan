package Own_Project;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Alert;


public class Master {
	public static void main( String[] args)throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");

		WebDriver click = new ChromeDriver();
		click.manage().window().maximize();
		click.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		click.get("https://siva-atoma.github.io/sivanpro.github.io/");
		System.out.println("Automation Entered the Page");
		WebElement Name = click.findElement(By.name("user_name"));
		Name.sendKeys("Siva");
		System.out.println("the Name is:"+Name.getAttribute("value"));
		WebElement Org = click.findElement(By.name("organization"));
		Org.sendKeys("TATA Consultancy Services");
		System.out.println("the  Organization name is:"+Org.getAttribute("value"));
		WebElement Position = click.findElement(By.name("position"));
		Position.sendKeys("System Engineer");
		System.out.println("the  Position is:"+Position.getAttribute("value"));
		WebElement mail  = click.findElement(By.name("user_email"));
		mail.sendKeys("m.sivanwork@gmail.com");
		System.out.println("the  Position given is:"+mail.getAttribute("value"));
		click.findElement(By.xpath("//button[text()='Submit']")).click();
		System.out.println("Submit buton was Click and moved into next page");
		Thread.sleep(5000);
		 File veen = ((TakesScreenshot)click).getScreenshotAs(OutputType.FILE);
	        File dest= new File("C:\\Users\\HP\\Pictures\\Screenshots/ri8.png");
	        FileHandler.copy(veen, dest);
	          System.out.println("Full-page screenshot saved!");
	          
	          	WebElement nam = click.findElement(By.id("name"));
		nam.sendKeys("Siva Rama Krishnan");
		System.out.println("the Name in 2nd page:"+nam.getAttribute("value"));
		WebElement Comp = click.findElement(By.id("company"));
		Comp.sendKeys("Meta");
		System.out.println("the Company in 2nd page:"+Comp.getAttribute("value"));
		WebElement Exp = click.findElement(By.id("experience"));
		Exp.sendKeys("3");
		System.out.println("the Experience is :"+Exp.getAttribute("value"));
		WebElement Gender = click.findElement(By.name("gender"));
		Gender.click();
		System.out.println("Gender Male is Selected: " + Gender.isSelected());
		WebElement Date = click.findElement(By.id("dob"));
		Date.sendKeys("02-15-1999");
		System.out.println("Dob is Entered " +Date.getAttribute("value"));
		WebElement Drop = click.findElement(By.id("skills"));
		 Select skills = new Select(Drop);
		 skills.selectByVisibleText("Manual");
		 skills.selectByVisibleText("Automation");
		 skills.selectByVisibleText("Selenium");
		 skills.selectByVisibleText("Functional Testing");
		 skills.selectByVisibleText("API");
		 skills.selectByVisibleText("SQL");
		 System.out.println("Dropdown Selected: " + Drop.getText());
		  click.findElement(By.className("SubmitBtn")).click();
	
	        Thread.sleep(2000);

	        Alert alert = click.switchTo().alert();
	        System.out.println("Alert says: " + alert.getText());
	        alert.accept();
         
          WebElement Hover = click.findElement(By.xpath("//button[@class='tooltip-button']"));
          Actions querty  = new Actions(click);
          querty.moveToElement(Hover).perform();
          System.out.println("Hover button has been activated");
		String Filepath = "C:\\Users\\HP\\Documents\\Resume\\SivanCv.pdf";
		WebElement FileUpload = click.findElement(By.xpath("//input[@id='fileInput']"));
		FileUpload.sendKeys(Filepath);
		 System.out.println("File has been Uploaded");
		Thread.sleep(1000);
		WebElement Nextpage = click.findElement(By.className("resume-link"));
		Nextpage.click();
        System.out.println("Moved into the Resume Page");
		WebElement download = click.findElement(By.xpath("//a[@class='download-btn']"));
		Thread.sleep(2000);
		download.click(); 
	     System.out.println("Resume has been downloaded");
		   JavascriptExecutor js = (JavascriptExecutor) click;
		   js.executeScript("window.scrollBy(0, 50)");
		   Thread.sleep(1000);
		   js.executeScript("window.scrollBy(0, 100)");
		   Thread.sleep(1000);
		   js.executeScript("window.scrollBy(0, 150)");
		   Thread.sleep(1000);
		   js.executeScript("window.scrollBy(0, 200)");
		   Thread.sleep(1000);
		   js.executeScript("window.scrollBy(0, 250)");
		   Thread.sleep(1000);
		   js.executeScript("window.scrollBy(0, 300)");
		   Thread.sleep(1000);
		   js.executeScript("window.scrollBy(0, 350)");
		   Thread.sleep(1000);
		   js.executeScript("window.scrollBy(0, 400)");
		   Thread.sleep(1000);
		   js.executeScript("window.scrollBy(0, 450)");
		   Thread.sleep(1000);
		   js.executeScript("window.scrollBy(0, 500)");
		   System.out.println("Moved into bottom of page ");
		click.navigate().back();
		click.navigate().refresh();
		Thread.sleep(1000);
		 System.out.println("Moved into the Home Page and refreshed");
		WebElement Clickme = click.findElement(By.xpath("//button[@onclick=\"alert('Thank you for visiting My page ')\"]"));
		Clickme.click();
		Thread.sleep(3000);
		click.switchTo().alert()	;
		alert.accept();
		System.out.println("final alert has been clicked and accepeted ");
		Thread.sleep(1000);
		click.quit();




	}

}
