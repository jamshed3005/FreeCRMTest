Feature: New Customer creation

Scenario: Add new Creation

Given user is already login page
When title of the page is Guru
Then user enters username and password
|username | password|
| mngr246165 | uqUrepe |
Then user clicks on new customer tab
Then user enters customer details
| customer     | Gender|       DOB         |  Add | city | state |   pin |   mobile |  emailid | password |
| jamshed khan | male | 30-05-1994        | phase1   | Pune | Maharastra | 411057 | 9513124430 | jamshed@gmail.com | Google145 |
| rahul sharma | male | 12-12-1994        | phase2   | Delhi| Punjab | 122065| 9876543231 | rahul@testdomain.com| Google145 |

Then user clicks submit button 