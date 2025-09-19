package user;

import org.testng.annotations.*;

public class UserScript
{

    @Test
    public void userCreate(){
        System.out.println("User Create Succassful");
    }

    @Test
    public void userModify(){
        System.out.println("User Modify Successful");
    }

    @Test
    public void userDelete(){
        System.out.println("User Delete Successful");
    }


    @BeforeSuite
    public void beforeSuiteDemo(){
        System.out.println("Users @BeforeSuite Example");
    }

    @AfterSuite
    public void afterSuiteDemo(){
        System.out.println("Users @AfterSuite Example");
    }

    @BeforeTest
    public void beforeTestDemo(){
        System.out.println("Users @BeforeTest Example");
    }

    @AfterTest
    public void afterTestDemo(){
        System.out.println("Users @AfterTest Example");
    }

    @BeforeClass
    public void beforeClassDemo(){
        System.out.println("Users @BeforeClass Example");
    }

    @AfterClass
    public void afterClassDemo(){
        System.out.println("Users @AfterClass Example");
    }

    @BeforeMethod
    public void beforeMethodDemo(){
        System.out.println("Users @BeforeMethod Example");
    }

    @AfterMethod
    public void afterMethodDemo(){
        System.out.println("Users @AfterMethod Example");
    }

}
