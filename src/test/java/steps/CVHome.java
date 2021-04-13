package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import webpages.HomePage;
import webpages.JobList;

public class CVHome
{
    WebDriver driver;
    HomePage hp;

    @Given("^User is on CV library home page$")
    public void user_is_on_cv_library_home_page() throws Throwable
    {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(" https://www.cv-library.co.uk/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
    }

    @When("^User provides more search options information$")
    public void user_provides_more_search_options_information() throws Throwable
    {
        HomePage hp = new HomePage(driver);
        hp.accept_all_cookies().click();
        Thread.sleep(2000);
        hp.more_search_options().click();
        hp.keywords_job_title().sendKeys("Software Tester");
        Thread.sleep(3000);
        hp.location().sendKeys("London");
        Thread.sleep(3000);
        hp.salary_max().sendKeys("50000");
        Thread.sleep(3000);
        hp.salary_min().sendKeys("35000");
        Thread.sleep(3000);
        hp.find_jobs().click();
        Thread.sleep(3000);
    }

    @Then("^all matching jobs are displayed $")
    public void all_matching_jobs_are_displayed() throws Throwable
    {
        JobList jb = new JobList(driver);
        jb.job_list().click();
    }

}
