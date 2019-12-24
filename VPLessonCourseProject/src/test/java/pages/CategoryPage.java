package pages;

import common.Driver;
import common.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.SeleniumUtil;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class CategoryPage extends PageBase {
    SeleniumUtil su = new SeleniumUtil();

    private String pageUrl = "https://lessoncourse.com/home";
    private By loginButtonOnMainPag = By.id("btn-login");
    private By userNameLC = By.name("username");
    private By passwordLC = By.name("password");
    private By loginButtonLC = By.cssSelector("#login-form > div.p-32 > form > button > span");
    private By invalidPassword = By.xpath("/html/body/md-toast/div[1]/div");
    public By youtubueButton = By.xpath("//*[@id=\"player_uid_378232334_1\"]/div[4]/button");

    private By logOutMenu=By.xpath("//*[@aria-label='User Menu']");
    private By logOutButton=By.xpath("//*[@aria-label='Logout']");


    public static WebDriver driver() {
        WebDriver driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return driver;
    }

    public void goToPage() {
        Driver.getDriver().get(pageUrl);
    }

    public void goToMainPageClickLogin() {
        Driver.driver.findElement(loginButtonOnMainPag).click();
    }

    public void enterUsername(String userName) {
        su.sendKeys(userNameLC, userName);
    }

    public void enterPassword(String password) {
        su.sendKeys(passwordLC, password);
    }

    public void clickLoginButton() {
        su.click(loginButtonLC);
    }

    public String getErrorMessageText() {
        return su.getText(invalidPassword);
    }


    public void login(String userName, String password) {
        goToPage();
        goToMainPageClickLogin();
        enterUsername(userName);
        enterPassword(password);
        clickLoginButton();
    }

    public void mouseOverTestsAndClick() {
        Actions myActions = new Actions(driver());
        WebElement mouseOver = driver().findElement(By.cssSelector("#toolbar > div.boxit.pt-4.layout-align-end-center.layout-row.flex > div > div"));
        myActions.moveToElement(mouseOver).perform();
        driver().findElement(By.xpath("//*[@id=\"toolbar\"]/div[2]/div/div/div[1]/div/div/div/div[1]/a[4]/div[1]")).click();
    }

    public void mouseOverAcademicsAndMath() throws InterruptedException {
        goToPage();
        Actions myActions = new Actions(driver());
        WebElement mouseOverCategories = driver().findElement(By.cssSelector("#toolbar > div.boxit.pt-4.layout-align-end-center.layout-row.flex > div > div"));
        myActions.moveToElement(mouseOverCategories).perform();
        WebElement mouseOverAcademics = driver().findElement(By.xpath("//*[@id=\"toolbar\"]/div[2]/div/div/div[1]/div/div/div/div[1]/a[5]/div[1]"));
        Thread.sleep(3000);
        myActions.moveToElement(mouseOverAcademics).perform();
        Thread.sleep(3000);
        WebElement mouseOverMath = driver().findElement(By.xpath("//*[@id=\"toolbar\"]/div[2]/div/div/div[1]/div/div/div/div[2]/a[1]/div[1]"));
        Thread.sleep(3000);
        myActions.moveToElement(mouseOverMath).click().perform();
        Thread.sleep(3000);
        WebElement mouseOverMathTeacher = driver().findElement(By.xpath("//*[@id=\"listRes\"]/md-grid-list/md-grid-tile[1]/figure/div/div/div/ng-transclude/a/div/div[2]/div[2]/span[2]"));
        Thread.sleep(3000);
        myActions.moveToElement(mouseOverMathTeacher).click().perform();
        Thread.sleep(3000);


    }
    public void mouseOverMathClassLogOut() throws InterruptedException, IOException {


        su.goToPage("loginPagelink");
        enterUsername("vpeker@na.edu");
        enterPassword("123456_point");
        clickLoginButton();

        su.myActionClickPerform(logOutMenu);
        Thread.sleep(3000);
        su.myActionClickBuildPerform(logOutButton);
        Thread.sleep(50000);
        /*
        driver().findElement(By.xpath("//*[@aria-label='User Menu']")).sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(3000);
        driver().findElement(By.xpath("//*[@aria-label='Logout']")).sendKeys(Keys.ENTER);
        Thread.sleep(4000);

         */
        /*Actions myActions = new Actions(driver());
        WebElement mouseOverToolBar = su.findElement(By.xpath("//*[@aria-label='User Menu']"));
        Thread.sleep(3000);
        myActions.moveToElement(mouseOverToolBar).click().perform();
        Thread.sleep(4000);
        WebElement logOut=su.findElement(By.xpath("//*[@aria-label='Logout']"));
        Thread.sleep(3000);
        myActions.moveToElement(logOut).click().build().perform();
        Thread.sleep(5000);

         */






    }



    public void youTubeElement() throws IOException, InterruptedException {
        su.goToPage("youtubeLink");
        Thread.sleep(2000);
        //return Driver.getDriver().findElement(By.xpath("//*[@id=\"inst-home\"]/div[2]/div/div[1]/div/div[1]/div/div[2]/div[3]/div/div/embed-video/iframe"));
        //WebElement Element = seleniumUtil.findElement(By.xpath("//*[@id=\"player_uid_548896127_1\"]/div[4]/div"));
        //  driver().switchTo().frame(youtubeFrame);
        Thread.sleep(2000);
        su.findElement(By.xpath("//*[@id=\"player_uid_548896127_1\"]/div[4]/button")).click();
        Thread.sleep(3000);
    }

    public void dropDownMenuFromLangPage() throws InterruptedException {
        goToPage();
        By myLangLocator=By.xpath("//span[@class='md-select-icon']");
        By mylanlENG=By.xpath("(//*[@translate='LANG_EN'])[1]");
        By mylanTR=By.xpath("(//*[@translate='LANG_TR'])[1]");
        su.myActionClickBuildPerform(myLangLocator);
        su.myActionPerform(mylanlENG);
        su.myActionClickBuildPerform(mylanTR);




    }
}
