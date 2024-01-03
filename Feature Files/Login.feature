Feature: Payment to the user

Scenario Outline: Payment Functionality
Given user is on Home Page and entered url as "http://demo.cyclos.org/ui/home"
When user enter username as "<username>" and password as "<password>"
And click on payments to user
And user entered payment details
Then clicks on confirm 

Examples:
| username | password |
| demo | 1234 |
