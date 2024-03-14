Feature: Log in functionality

  @tc1
  Scenario Outline: Loggin into the app using valid credentials
    Given User launches Chrome browser
    When User navigates to URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    Then User is on log in page and title is "OrangeHRM"
    And USer enters username as "<username>" and password as "<password>"
    Then User clicks log in
    And User should be logged in and able to see "Dashboard"
    Then close browser

  
    Examples: 
    
      | username | password |
      | Admin    | admin123 |
      | adminxyz | jojo123  |
		##	| gogototo |  123345	|