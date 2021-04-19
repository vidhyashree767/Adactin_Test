package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.helper.FileReaderManager;
import com.adactin.helper.Page_Object_Manager;
import com.adactin.runner.Test_Runner;
import com.adactin_pom.Book_A_Hotel;
import com.adactin_pom.Booking_Confirmation;
import com.adactin_pom.Check_Button;
import com.adactin_pom.Login_Page;
import com.adactin_pom.Logout;
import com.adactin_pom.Search_Hotel;
import com.base_class.Base_Classse;
import com.base_class.Base_Classse;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Test;

public class Step_Definition extends Base_Classse {
	
	public static WebDriver driver =  Test_Runner.driver;
			//public static Login_Page login=new Login_Page(driver);
		//	public static Search_Hotel search = new Search_Hotel(driver);
		//	public static Check_Button check = new Check_Button(driver);
		//	public static Book_A_Hotel Book = new Book_A_Hotel(driver);
		//	public static Booking_Confirmation Confirm = new Booking_Confirmation(driver);
		//	public static Logout logout= new Logout(driver);
	
	
	public static Page_Object_Manager pom=new Page_Object_Manager(driver);
			
	@Given("^user Launch The Url$")
	public void user_Launch_The_Url() throws Throwable {
String url = FileReaderManager.getIstance().getIstanceCR().getUrl();
get(url);
	    	}

	@When("^user Enter Username In The Application$")
	public void user_Enter_Username_In_The_Application() throws Throwable {
		//inputvalue(login.getUsername(), "vidhyashree");
		
		
		inputvalue(pom.getInstanceLogin().getUsername(), "vidhyashree");
	}
	    

	@When("^user Enter Password In The Application$")
	public void user_Enter_Password_In_The_Application() throws Throwable {
		//inputvalue(login.getPassword(), "9TREO9");
		
		inputvalue(pom.getInstanceLogin().getPassword(), "9TREO9");
		
		
	    	}

	@Then("^user login Switch To Search Hotel Page$")
	public void user_login_Switch_To_Search_Hotel_Page() throws Throwable {
		//click(login.getLogin());
		
		click(pom.getInstanceLogin().getLogin());
	    	}

	@When("^user Select The Location In The Application$")
	public void user_Select_The_Location_In_The_Application() throws Throwable {
     //singledropdown(search.getLocation(), "Melbourne", "value");
		
		singledropdown(pom.getInstancesearch().getLocation(), "Melbourne", "value");
	}

	@When("^user Select The Hotel In The Application$")
	public void user_Select_The_Hotel_In_The_Application() throws Throwable {
		//singledropdown(search.getHotels(), "Hotel Creek", "value");
		singledropdown(pom.getInstancesearch().getHotels(), "Hotel Creek", "value");

	}

	@When("^user Select The Room Type  In The Application$")
	public void user_Select_The_Room_Type_In_The_Application() throws Throwable {
		//singledropdown(search.getRoom_Type(), "Standard", "value");
		singledropdown(pom.getInstancesearch().getRoom_Type(), "Standard", "value");
	}

	@When("^user Select The Number Of Rooms  In The Application$")
	public void user_Select_The_Number_Of_Rooms_In_The_Application() throws Throwable {
	//	singledropdown(search.getNumber_Of_Rooms(), "3", "value");
		singledropdown(pom.getInstancesearch().getNumber_Of_Rooms(), "3", "value");
	}

	@When("^user Select The Number of Adults In The Application$")
	public void user_Select_The_Number_of_Adults_In_The_Application() throws Throwable {
		//singledropdown(search.getAdult_Per_Room(), "2", "value");
		singledropdown(pom.getInstancesearch().getAdult_Per_Room(), "2", "value");
	}

	@When("^user Select The Number Of Children  In The Application$")
	public void user_Select_The_Number_Of_Children_In_The_Application() throws Throwable {
		//singledropdown(search.getChildren_per_room(), "1", "value");
		singledropdown(pom.getInstancesearch().getChildren_per_room(), "1", "value");
	}

	@Then("^user Search And Switch To  Book A Hotel$")
	public void user_Search_And_Switch_To_Book_A_Hotel() throws Throwable {
		//click(search.getSubmit());
		click(pom.getInstancesearch().getSubmit());
		Thread.sleep(2000);
	}

	@When("^user Select The Radio Button In The $")
	public void user_Select_The_Radio_Button_In_The_Application() throws Throwable {
		//click(check.getRadio_Btn());
		click(pom.getInstanceCheck().getRadio_Btn());
	}
	@Then("^user Continue and Switch To Book A Hotel$")
	public void user_Continue_and_Switch_To_Book_A_Hotel() throws Throwable {
		//click(check.getContinuee());
		click(pom.getInstanceCheck().getContinuee());
	}

	@When("^user Enter The First Name In The Application$")
	public void user_Enter_The_First_Name_In_The_Application() throws Throwable {

	//inputvalue(Book.getFirst_Name(),"vidhya");
		inputvalue(pom.getInstancebook().getFirst_Name(), "vidhya");
	}

	@When("^user Enter The Last Name In The Application$")
	public void user_Enter_The_Last_Name_In_The_Application() throws Throwable {
		//inputvalue(Book.getLast_Name(), "shree");
		inputvalue(pom.getInstancebook().getLast_Name(), "shree");

}
	

	@When("^user Enter The Billing  Address In The Application$")
	public void user_Enter_The_Billing_Address_In_The_Application() throws Throwable {
		//inputvalue(Book.getAddress(), "25 Nurses Walk, The Rocks NSW 2000, Australia" );
		inputvalue(pom.getInstancebook().getAddress(), "25 Nurses Walk, The Rocks NSW 2000, Australia");

	}

	@When("^user Enter The Credit Card Number  In The Application$")
	public void user_Enter_The_Credit_Card_Number_In_The_Application() throws Throwable {
   // inputvalue(Book.getCredit(), "1234567890123456");
		String credit_Num = FileReaderManager.getIstance().getIstanceCR().getCredit_Num();
		inputvalue(pom.getInstancebook().getCredit(),credit_Num );
    
	}

	@When("^user Select The Credit Card Type In The Application$")
	public void user_Select_The_Credit_Card_Type_In_The_Application() throws Throwable {
		//singledropdown(Book.getCredit_Type(), "VISA", "value");
		String credit_type = FileReaderManager.getIstance().getIstanceCR().getCredit_Type();
		singledropdown(pom.getInstancebook().getCredit_Type(), credit_type, "value");

	}

	@When("^user Select The Expiry Month In The Application$")
	public void user_Select_The_Expiry_Month_In_The_Application() throws Throwable {
		//singledropdown(Book.getExpiry_Month(), "3", "value");
		Thread.sleep(3000);

		String expiry_month = FileReaderManager.getIstance().getIstanceCR().getExpiry_month();
		singledropdown(pom.getInstancebook().getExpiry_Month(), expiry_month,"value");

	}

	@When("^user Select The Expiry Year In The Application$")
	public void user_Select_The_Expiry_Year_In_The_Application() throws Throwable {
//singledropdown(Book.getExpiry_Year()	, "2022", "value");
		String expiry_year = FileReaderManager.getIstance().getIstanceCR().getExpiry_Year();
		singledropdown(pom.getInstancebook().getExpiry_Year(), expiry_year, "value");
	}

	@When("^user Enter The Credit Card Number Cvv In The Application$")
	public void user_Enter_The_Credit_Card_Number_Cvv_In_The_Application() throws Throwable {
		//inputvalue(Book.getCreditcard_Number(), "321");
		String credit_cvv1 = FileReaderManager.getIstance().getIstanceCR().getCvv();

		inputvalue(pom.getInstancebook().getCreditcard_Number(), credit_cvv1);

}

	@Then("^User Click Book Now and Switch to Booking Confirmation$")
	public void user_Click_Book_Now_and_Switch_to_Booking_Confirmation() throws Throwable {
		//click(Book.getBook_Btn());
		click(pom.getInstancebook().getBook_Btn());
		Thread.sleep(3000);

	}

	@Then("^user click My Itinerary And Navigates To Booked Itinerary$")
	public void user_click_My_Itinerary_And_Navigates_To_Booked_Itinerary() throws Throwable {
		Thread.sleep(3000);

	//click(Confirm.getItinerary());
		click(pom.getInstanceconfirm().getItinerary());
	Thread.sleep(3000);


	}

//	@Then("^user Logout From The Application$")
	//public void user_Logout_From_The_Application() throws Throwable {
		//click(logout.getLogout());
	//	click(pom.getInstanceLogout().getLogout());
//	}




}