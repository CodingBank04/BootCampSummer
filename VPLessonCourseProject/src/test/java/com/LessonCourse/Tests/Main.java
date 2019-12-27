package com.LessonCourse.Tests;

import common.Driver;
import common.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import utils.SeleniumUtil;

import java.io.IOException;

public class Main extends TestBase {
    MainPage mg=new MainPage();
    SeleniumUtil su=new SeleniumUtil();

    @Test
    public void verifThatUserTextAndClickSearchBox() throws IOException {
        mg.searchBox();
        WebElement element= Driver.driver.findElement(By.xpath("//span[@class='text-bold text-italic ng-binding']"));
        su.isDisplayed(element);
    }
    @Test
    public void verifyUserCanExpolerLessons() throws IOException, InterruptedException {
        mg.exploreLessons();

    }
    @Test
    public void addClaaToChart() throws IOException, InterruptedException {
        mg.addClassTooChart();



    }
    @Test
    public void mainPageClassIsClickable() throws IOException {
        mg.mainPageClassAreClickable();
    }
    @Test
    public void categoryButtons() throws IOException, InterruptedException {
        mg.categoryButtons();
    }
    @Test
    public void youTube() throws IOException, InterruptedException {
        mg.clickOnYouTube();
        Thread.sleep(5000);
       // String scheduleLesson= Driver.driver.findElement(By.xpath("//button[@aria-label='Schedule a Lesson']")).getText();
        //Assert.assertEquals(scheduleLesson,"Schedule a Lesson");

}
     @Test
    public void sendMessageInstructor() throws IOException, InterruptedException {
        mg.sendMessageInstructor();
     }
     @Test
    public void scheduLesson() throws IOException, InterruptedException {
        mg.scheduleLesson();
     }

}
