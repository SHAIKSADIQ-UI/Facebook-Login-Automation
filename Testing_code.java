package fb;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Login {
public static void main(String[] args)throws Throwable {
System.setProperty("webdriver.chrome.driver","C:\\proj\\chromedriver_win32\\c
hromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.facebook.com");
driver.manage().window().maximize();
driver.findElement(By.id("email")).sendKeys("shaiksadhik407@gmail.com");Thread.sleep(3000);
driver.findElement(By.id("pass")).sendKeys("Sadiq@123");
driver.findElement(By.name("login")).click();
try {
Thread.sleep(4000);
} catch (InterruptedException e) {
e.printStackTrace();
}
WebElement searchInput
=
driver.findElement(By.cssSelector("input[type='search']"));
searchInput.sendKeys("P L Ramesh");searchInput.submit();
try {
Thread.sleep(3000);
} catch (InterruptedException e) {
e.printStackTrace();
}
}
}