Feature: Login

Scenario Outline: Successful login with valid creadientials
Given User Launch the chrome browser
When User open the URL
And User enter email and password
And User click on login
And User click on logout link
Then close browser

