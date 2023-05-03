package com.example.demo.testing.selenium;
import org.openqa.selenium.Alert;
//
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class App
{
    public static void main( String[] args ) throws InterruptedException
    {
      WebDriverManager.edgedriver().setup();
      WebDriver driver = new EdgeDriver();
      String url="https://demo.guru99.com/test/delete_customer.php";
     

      driver.get(url);

      driver.manage().window().maximize();

//      driver.switchTo().frame(0);
      driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("401",Keys.ENTER);
      Alert alert=driver.switchTo().alert();
      alert.dismiss();
      driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).clear();
      driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("402",Keys.ENTER);
      alert.accept();
      String str=alert.getText();
      System.out.print(str);

     
    }
}

