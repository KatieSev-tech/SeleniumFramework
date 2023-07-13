package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class ArrayDropdownHomeWork extends BaseTest{

    @Test

    public void jobTitleDropdown () {
        driver.get("https://test.my-fork.com/register");
        WebElement jobTitleDropdownElement;
        jobTitleDropdownElement = driver.findElement(By.id("//select[@id='job-title']"));
        Select jobTDropdownElement = new Select(jobTitleDropdownElement);
        List<WebElement> options = new ArrayList<>();
        options = jobTDropdownElement.getOptions();
        for (int i = 0; i < options.size(); i++) {
        System.out.println(options.get(i).getText());
        }
    }
}
