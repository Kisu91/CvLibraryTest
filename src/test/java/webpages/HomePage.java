package webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends Driver
{
    public HomePage(WebDriver driver)
    {
        this.driver = driver;
    }

    public WebElement accept_all_cookies()
    {
        return driver.findElement(By.xpath("//span[text()='Accept All']"));
    }
    public WebElement more_search_options()
    {
        return driver.findElement(By.xpath("//div[@class='hp-search-more']/button[@id='toggle-hp-search']"));
    }
    public WebElement keywords_job_title()
    {
        return driver.findElement(By.xpath("//div[@class='hps-jobtitle hps-transition']"));
    }
    public WebElement location()
    {
        return driver.findElement(By.xpath("//input[@id='location']"));
    }
    public WebElement salary_min()
    {
        return driver.findElement(By.xpath("//input[@id='salarymin']"));
    }
    public WebElement salary_max()
    {
        return driver.findElement(By.xpath("//input[@id='salarymax']"));
    }

    public WebElement find_jobs()
    {
        return driver.findElement(By.xpath("//input[@value='Find Jobs']"));
    }
}
