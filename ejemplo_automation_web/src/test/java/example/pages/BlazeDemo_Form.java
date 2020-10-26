package example.pages;

import Pages.WebComponent;
import example.pages.content.PurchaseFormData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BlazeDemo_Form extends WebComponent
{
     By titleForm = By.xpath("//body//h2");
     By monthCard = By.id("creditCardMonth");
     By yearCard = By.id("creditCardYear");
     By btnPurchaseFight = By.xpath("//input[@value='Purchase Flight']");

     public String getTitleForm()
     {
        return getDriver().findElement(titleForm).getText();
     }


     private void setMonthCard(String strMonthCard)
     {
         getDriver().findElement(monthCard).clear();
         getDriver().findElement(monthCard).sendKeys(strMonthCard);
     }
    private void setYearCard(String strYearCard)
    {
        getDriver().findElement(yearCard).clear();
        getDriver().findElement(yearCard).sendKeys(strYearCard);
    }

    private void clickPurchaseFight()
    {
        getDriver().findElement(btnPurchaseFight).click();

    }


    public void completeMonthAndYearCard(String strMonth, String strYear)
    {
        this.setMonthCard(strMonth);
        this.setYearCard(strYear);
        this.clickPurchaseFight();
    }

    public void completeForm(PurchaseFormData data) {

        findElement(By.xpath("//input[@id = 'inputName']")).sendKeys(data.get_name());
        findElement(By.xpath("//input[@id = 'address']")).sendKeys(data.get_address());
        findElement(By.xpath("//input[@id = 'city']")).sendKeys(data.get_city());
        findElement(By.xpath("//input[@id = 'state']")).sendKeys(data.get_state());
        findElement(By.xpath("//input[@id = 'zipCode']")).sendKeys(data.get_zip());
        findElement(By.xpath("//input[@id = 'creditCardNumber']")).sendKeys(data.get_cardNum());
        findElement(By.xpath("//input[@id = 'creditCardMonth']")).sendKeys(data.get_month());
        findElement(By.xpath("//input[@id = 'creditCardYear']")).sendKeys(data.get_year());
        findElement(By.xpath("//input[@id = 'nameOnCard']")).sendKeys(data.get_nameCard());

    }

    public void completeCardForm(PurchaseFormData data) {
         setMonthCard(data.get_month());
         setYearCard(data.get_year());
    }

    public void purchaseFlight() {
        findElement(By.xpath("//body//input[@value='Purchase Flight']")).click();
    }
}



