Feature: New Customer creation

@SmokeTest
Scenario: Add new Creation

Given user is already in login page
When title of the page is Guru99
Then user enter username and password
|username | password|
| mngr246165 | uqUrepe |
Then user click on new customer tab
Then user enter customer details
|customer anme| Gender| DOB|        Add| city|
| jamshed khan | male | 30-05-1994 | NA | Pune| Maharastra | 411057 | 9513124430 | jamshed@gmail.com | Google145 |
Then user enter submit button 



