package pages_sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static org.junit.Assert.*;


public class AgePage {
    @FindBy(how = How.ID, using = "name") // By.id("name")
    private WebElement nameInput; // WebElement nameInput = driver.findElement(By.id("name"));
    @FindBy(how = How.NAME, using = "age") // By.name("age")
    private WebElement ageInput;
    @FindBy(how = How.ID, using = "submit")
    private WebElement submitButton;
    @FindBy(how = How.CLASS_NAME, using = "error") // By.className("error)
    private WebElement errorText;


    public String getPageUrl() {
        return "https://kristinek.github.io/site/examples/age";
    }

    public void enterName(String name) {
        nameInput.clear();
        nameInput.sendKeys(name);
    }

    public void enterAge(int age) {
        enterAge(String.valueOf(age));
    }

    public void enterAge(String age) {
        ageInput.clear();
        ageInput.sendKeys(age);
    }

    public void clickSubmit() {
        submitButton.click();
    }

    public void enterNameAgeAndClickSubmit(String name, int age) {
        enterNameAgeAndClickSubmit(name, String.valueOf(age));
    }

    public void enterNameAgeAndClickSubmit() {
        enterName("admib");
        enterAge("pass");
        submitButton.click();
    }

    public void enterNameAgeAndClickSubmit(String name, String age) {
        enterName(name);
        enterAge(age);
        submitButton.click();
    }

    public void checkErrorMessage(String errorMessage) {
        assertEquals(errorText.getText(), errorMessage);
        assertTrue(errorText.isDisplayed());
    }

    public void checkThatFormIsClean() {
        assertEquals(nameInput.getAttribute("value"), "Enter name here");
        assertEquals(ageInput.getAttribute("value"), "");
        assertFalse(errorText.isDisplayed());
    }
}
