package webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JobList extends Driver
{
    public JobList(WebDriver driver)
    {
        this.driver = driver;
    }
    public WebElement job_list()
    {
        return driver.findElement(By.xpath("//a[@title='Software Tester']"));
    }
}
