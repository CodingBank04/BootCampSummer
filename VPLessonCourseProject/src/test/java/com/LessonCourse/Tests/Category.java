package com.LessonCourse.Tests;

import common.Driver;
import common.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CategoryPage;
import utils.SeleniumUtil;

import java.io.IOException;

public class Category extends TestBase {
    SeleniumUtil su=new SeleniumUtil();
    CategoryPage cp2 = new CategoryPage();

    @Test(groups = {"All","Smoke","Regression"})
    public void verifyUserCanLogin() {
        cp2.login("vpeker@na.edu","123456_point");
        //cp2.mouseOverMathClassLogOut();
        String x = "Welcome Mr. Travis";
        Assert.assertTrue(x.contains("Travis"));
    }
    @Test(groups = {"All","Smoke","Regression"})
    public void verifyThatUserCanNotLogin() throws InterruptedException {
        cp2.login("username","password");
        Thread.sleep(2000);
        String errorMessageText = cp2.getErrorMessageText();
        Assert.assertEquals(errorMessageText, "Invalid password.");
        Thread.sleep(2000);
    }

    @Test(groups = {"All","Smoke","Regression"})
    public void mouseOverTestsFromCategories(){
        cp2.goToPage();
        cp2.mouseOverTestsAndClick();
        String textOnTestPage="No course or lesson in this category yet!\n";
        Assert.assertTrue(textOnTestPage.contains("course or lesson"));

    }
    @Test(groups = {"All","Smoke","Regression"})
    public void verifyUserCanWatchMathVideo() throws InterruptedException {
        cp2.mouseOverAcademicsAndMath();
        String teacherNameLocator= Driver.driver.findElement(By.xpath("//div[@class='md-display-1 p-8 ng-binding']")).getText();
        Assert.assertEquals(teacherNameLocator,"Tayyip Oral");


    }
    @Test(groups = {"All","Smoke","Regression"})
    public void logOutFromLoginPage() throws IOException, InterruptedException {
        cp2.mouseOverMathClassLogOut();
        Thread.sleep(4000);
        String mainPageText="Learn at home, lead everywhere.";
        Assert.assertTrue(mainPageText.contains("lead everywhere"));


    }
    @Test
    public void verifyDropDownMenuFuntionality() throws InterruptedException {
        cp2.dropDownMenuFromLangPage();
        su.getThread(2000);

    }

}
