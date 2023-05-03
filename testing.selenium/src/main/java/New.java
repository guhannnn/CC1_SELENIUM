import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
public class New {
    public static void main(String[] args) throws InterruptedException {
        
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(5000);
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(5000);
        assert driver.getTitle().equals("Swag Labs");
        driver.findElement(By.cssSelector(".inventory_item button")).click();
        WebElement cartBadge = driver.findElement(By.className("shopping_cart_badge"));
        assert cartBadge.getText().equals("1");
        Thread.sleep(5000);
        driver.findElement(By.className("shopping_cart_link")).click();
        assert driver.findElement(By.cssSelector(".cart_list")).isDisplayed();
        Thread.sleep(5000);
        driver.findElement(By.cssSelector(".checkout_button")).click();
        assert driver.findElement(By.cssSelector(".checkout_info_container")).isDisplayed();
        Thread.sleep(5000);
        driver.findElement(By.id("first-name")).sendKeys("guhan");
        driver.findElement(By.id("last-name")).sendKeys("p");
        driver.findElement(By.id("postal-code")).sendKeys("625689");
        Thread.sleep(5000);
        driver.findElement(By.cssSelector(".cart_button")).click();
        Thread.sleep(5000);
        assert driver.findElement(By.cssSelector(".checkout_complete_container")).isDisplayed();
        WebElement productName = driver.findElement(By.cssSelector(".inventory_item_name"));
        WebElement productPrice = driver.findElement(By.cssSelector(".inventory_item_price"));
        System.out.println("Product Name: " + productName.getText());
        System.out.println("Product Price: " + productPrice.getText());
        assert driver.getTitle().equals("Swag Labs");
        assert driver.getCurrentUrl().equals("https://www.saucedemo.com");
        driver.quit();
        
        
    }
}


