package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class AddEmployeePage extends CommonMethods {
    //create object repository
    // keep all the elements of this screen here



    @FindBy(id="firstName")
    public WebElement firstnameLocator;

    @FindBy(id="middlename")
    public WebElement middlenameLocator;

    @FindBy(id="lastname")
    public WebElement lastnameLocator;

    @FindBy(id="btnSave")
    public WebElement saveButton;

    public AddEmployeePage() {
        PageFactory.initElements(driver, this);
    }

}
