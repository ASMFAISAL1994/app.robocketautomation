package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class WebElement1 {
    WebDriver driver;
    public WebElement1(WebDriver driver){
        this.driver=driver;
        this.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    public void Login(String Email,String Password) throws InterruptedException {
        driver.findElement(By.xpath("//input[@name=\"username\"]")).click();
        driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys(Email);
        driver.findElement(By.xpath("//input[@id=\"password\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys(Password);
        Thread.sleep(1000);


    }

    public void LoginButton(){
        driver.findElement(By.xpath("//input[@name=\"login\"]")).click();
    }
     public void ContactMenuBar(){
         driver.findElement(By.xpath("//a[normalize-space()='Contacts']")).click();
     }
     public void ContactSegmentClick(){
         driver.findElement(By.xpath("//a[normalize-space()='Contact Segment']")).click();
     }
     public void CreateSegmentsClick(){
         driver.findElement(By.xpath("//button[normalize-space()='Create Segments']")).click();
     }
     public void SegmentNameAndDescription(String Segmentname,String Segmentdescription) throws InterruptedException {
         driver.findElement(By.xpath("//input[@name='groupName']")).click();
         Thread.sleep(1000);
         driver.findElement(By.xpath("//input[@name='groupName']")).sendKeys(Segmentname);
         Thread.sleep(1000);
         driver.findElement(By.xpath("//div[@class='ql-editor ql-blank']//p")).click();
         Thread.sleep(1000);
         driver.findElement(By.xpath("//div[@class='ql-editor ql-blank']//p")).sendKeys(Segmentdescription);

     }






}
