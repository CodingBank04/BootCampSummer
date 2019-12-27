package pages;

import common.Driver;
import common.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.SeleniumUtil;

import java.io.IOException;

public class MainPage extends PageBase {
    SeleniumUtil su = new SeleniumUtil();

    private By searchBox = By.xpath("(//div[@layout='row']/input)[1]");
    private By searchBoxClick = By.xpath("(//*[@aria-label='mdi-magnify'])[1]");

    private By exploreLesson = By.partialLinkText("Lessons");
    private By exploreLessonPageChange = By.xpath("//*[@aria-label='mdi-chevron-right']");
    private By exploreLessonPageChange1 = By.xpath("(//button[@class='m-5 md-background-bg md-button ng-scope md-teal-theme md-ink-ripple'])[1]");

    private By categories=By.xpath("//*[@id=\"toolbar\"]//button/span");
   private By coaching=By.xpath("(//div[@translate='CAT.COA.NAME'])[1]");
    private By therapy=By.xpath("(//div[@translate='CAT.TER.NAME'])[1]");
    private By personalDevelopment=By.xpath("(//div[@translate='CAT.PD.NAME'])[1]");
    private By tests=By.xpath("(//div[@translate='CAT.TEST.NAME'])[1]");
    private By academics=By.xpath("(//div[@translate='CAT.ACA.NAME'])[1]");
   private By language=By.xpath("(//div[@translate='CAT.LANG.NAME'])[1]");

    private By math=By.xpath("//div[@translate='CAT.ACA.MATH']");
    By clickTayyipOral=By.xpath("(//*[@translate='HOUR_RATE'])[1]");


    public void homePage() throws IOException {
        //Driver.getDriver().get("mainUrl");
        su.goToPage("mainUrl");
    }

    public void searchBox() throws IOException {
        homePage();
        su.sendKeys(searchBox, "Math");
        su.click(searchBoxClick);
    }

    public void exploreLessons() throws IOException, InterruptedException {
        homePage();
        su.myActionClickBuildPerform(exploreLesson);
        Thread.sleep(3000);
        for(int i=1 ; i<8; i++) {
            Thread.sleep(3000);
            su.myActionClickBuildPerform(exploreLessonPageChange1);
            Thread.sleep(3000);

        }

    }
    public void addClassTooChart() throws IOException, InterruptedException {
        homePage();
        Thread.sleep(3000);
        su.byActionPerform(By.xpath("(//div[@class='content pv-10 ph-16 layout-fill layout-column flex'])[1]"));
        Thread.sleep(3000);
       su.myActionClickBuildPerform(By.xpath("//*[@id=\"5dd0473a97612843aab58e25\"]/div[1]/button"));


    }
    public void mainPageClassAreClickable() throws IOException {

        homePage();
        By clickable=By.xpath("//*[@id=\"5dd0473a97612843aab58e25\"]/div[1]/button");
        su.isClickable(clickable,6);
    }

    public By []categoryButtons() throws IOException, InterruptedException {

        homePage();
        Thread.sleep(3000);
        By [] categoryButtons=new By[7];
        categoryButtons[0]=su.byActionPerform(categories);
        Thread.sleep(3000);
        categoryButtons[1]=su.byActionPerform(coaching);
        Thread.sleep(3000);
        categoryButtons[2]=su.byActionPerform(therapy);
        Thread.sleep(3000);
        categoryButtons[3]=su.byActionPerform(personalDevelopment);
        Thread.sleep(3000);
        categoryButtons[4]=su.byActionPerform(tests);
        Thread.sleep(3000);
        categoryButtons[5]=su.byActionPerform(academics);
        Thread.sleep(3000);
        categoryButtons[6]=su.byActionPerform(language);
        Thread.sleep(3000);
        return categoryButtons;



    }
    public void clickOnYouTube() throws IOException, InterruptedException {
        By clickAzamat=By.xpath("(//span[@translate='HOUR_RATE'])[1]");
        By element =By.xpath("//button[@aria-label='Play']");
       /* homePage();
        WebDriverWait wait= new WebDriverWait(Driver.driver,5);
        su.myPerform(categories);
        su.myPerform(academics);
        su.myActionClickBuildPerform(math);
        su.myActionClickBuildPerform(clickAzamat);*/
         su.goToPage("youtubeLink");
         Thread.sleep(5000);
         WebElement iframe=Driver.driver.findElement(By.xpath("//iframe[starts-with(@src, \"https://www.youtube.com/embed\")]"));
         su.switchToFrame(iframe);
         Thread.sleep(4000);
         su.myActionClickBuildPerform(element);
         Thread.sleep(5000);


    }
    public void sendMessageInstructor() throws IOException, InterruptedException {
          By clicksendAMessage=By.xpath("//*[@id=\"inst-home\"]/div[2]/div/div[2]/div[2]/div/header/div");
          By sendMessageBox=By.xpath("//*[@placeholder='Type and hit enter to send message']");
          By clickSend=By.xpath("//span[@translate='SEND']");
          CategoryPage cp=new CategoryPage();
          homePage();
          cp.login("vpeker@na.edu","123456_point");
          Thread.sleep(5000);
        su.myPerform(categories);
        su.myPerform(academics);
        su.myActionClickBuildPerform(math);
        Thread.sleep(3000);
        su.myActionClickBuildPerform(clickTayyipOral);
        Thread.sleep(3000);
        su.myActionClickBuildPerform(clicksendAMessage);
        Thread.sleep(3000);
        su.sendKeys(sendMessageBox,"Hello How are you sir. This is Test");
        Thread.sleep(5000);
        su.click(clickSend);
    }
    public void scheduleLesson() throws IOException, InterruptedException {
        By scheduleALesson=By.xpath("//span[@translate='INST.SCH_LES']");
        By professionalLesson=By.cssSelector("#dialogContent_319 > div.animate-slide-left.layout-column.flex > div.md-whiteframe-1dp.white-bg.layout-column.flex > div:nth-child(1)");
        By thirtyminutes=By.xpath("//*[@id=\"dialogContent_291\"]/div[2]/div[2]/div[1]/div[3]");
        By continue1=By.xpath("//*[@aria-label='Continue']");

        CategoryPage cp=new CategoryPage();
        homePage();
        cp.login("vpeker@na.edu","123456_point");
        Thread.sleep(5000);
        su.myPerform(categories);
        su.myPerform(academics);
        su.myActionClickBuildPerform(math);
        Thread.sleep(3000);
        su.myActionClickBuildPerform(clickTayyipOral);
        Thread.sleep(3000);
        su.myActionClickBuildPerform(scheduleALesson);
        Thread.sleep(2000);
        su.myActionClickBuildPerform(professionalLesson);
        Thread.sleep(2000);
        //su.myActionClickBuildPerform(thirtyminutes);
        Thread.sleep(2000);
        su.click(continue1);
    }
}