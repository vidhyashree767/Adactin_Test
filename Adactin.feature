Feature:  Adactin  booking in the hotel
Scenario:
 
Given user Launch The Url
When user Enter Username In The Application
And user Enter Password In The Application
Then  user login Switch To Search Hotel Page

Scenario: 

When user Select The Location In The Application
And user Select The Hotel In The Application
And user Select The Room Type  In The Application
And user Select The Number Of Rooms  In The Application
And user Select The Number of Adults In The Application
And user Select The Number Of Children  In The Application
Then user Search And Switch To  Book A Hotel

 
 Scenario: 

When user Select The Radio Button In The Application
Then user Continue and Switch To Book A Hotel

Scenario:

When user Enter The First Name In The Application
And  user Enter The Last Name In The Application
And user Enter The Billing  Address In The Application
And user Enter The Credit Card Number  In The Application
And user Select The Credit Card Type In The Application
And user Select The Expiry Month In The Application
And user Select The Expiry Year In The Application
And user Enter The Credit Card Number Cvv In The Application
Then User Click Book Now and Switch to Booking Confirmation

Scenario:

Then user click My Itinerary And Navigates To Booked Itinerary	

Scenario:

Then user Logout From The Application






































