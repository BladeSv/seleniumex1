package by.htp.selenium.example;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumExample {

	private static final String CHROME = "webdriver.chrome.driver";
	private static final String CHROME_PATH="D:\\students\\Mitr\\chromedriver.exe";
	
	public static void main(String[] args) throws InterruptedException {
	System.setProperty(CHROME, CHROME_PATH)	;
	WebDriver driver =new ChromeDriver();
	driver.get("https://google.com");
	
	WebElement element=driver.findElement(By.name("q"));
	element.sendKeys("web driver 3 new features java htp tat 9");
	element.submit();
	Thread.sleep(1000);
	
	
	
	String title =driver.getTitle();
	//System.out.println(title);
	
	String sTitle[]=title.split(" ");
	for(String s: sTitle){
		if(s.equals("java")){
			System.out.println("All good, We have word-java  ");
			
		}
	}
	WebElement resultStats=driver.findElement(By.id("resultStats"));
String resultStr= resultStats.getText();
	//System.out.println(resultStr);
	String sResultStr[]=resultStr.split(" ");
	String StrResult="";
	for(String s: sResultStr){
		System.out.println(s);
		if(cheackInt(s)){
			StrResult=StrResult+s;
			
		}
	}
		int intResult=Integer.parseInt(StrResult);
		System.out.println(intResult);
		WebElement lastPage;
		int idPage=10;
		int listPage=0;
		lastPage=driver.findElement(By.xpath("//*[@id='nav']/tbody/tr/td["+(idPage+1)+"]/a"));
		while(lastPage != null){			
			lastPage=driver.findElement(By.xpath("//*[@id='nav']/tbody/tr/td["+(idPage+1)+"]/a"));
			if(lastPage==null){
				while((lastPage==null) && (idPage>=1)){
					idPage--;
					lastPage=driver.findElement(By.xpath("//*[@id='nav']/tbody/tr/td["+(idPage+1)+"]/a"));	
					
				}
				listPage=listPage+idPage;
				
			}
			lastPage.submit();
			idPage=idPage+10;
//		 lastPage=driver.findElement(By.xpath("//*[@id='nav']/tbody/tr/td[11]/a"));
//		//*[@id="nav"]/tbody/tr/td[11]/a
//		String lastPageS=lastPage.getText();
//		System.out.println(lastPageS);
//		intPage=intPage+
	}
	
		List<WebElement> listElement=lastPage.findElements(By.className("g"));
		int scorePage= idPage*10+listElement.size();
		
		System.out.println(scorePage);
		
		
	}
	 
	
	//driver.close();
	
	
		
		
	
	//List<WebElement> result = driver.findElements(By.id("resultStats"));
	
//	for(WebElement el:result){
//		
//		String tagName= el.getTagName();
//		//System.out.println(tagName);
//		WebElement a =el.findElement(By.xpath("a"));
//		String linName=a.getText();
//		System.out.println(linName);
//		
//		 element=driver.findElement(By.name("q"));
//		element.clear();
//		element.sendKeys("Java");
//	
//		driver.close();
//	}
//	


public static  boolean cheackInt(String str){
	try{
	Integer.parseInt(str);
	boolean i=true;
	return true;
	}
	catch(NumberFormatException e)
	{
		return false;	
		
}
}
}