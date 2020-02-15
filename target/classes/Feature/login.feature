Feature: Free CRM Test

#Without Example Keyword


#Scenario: Free CRM Login test
#
#Given user is already in Test
#When user is verify the Title
#Then user is clicking on login
#Then user enter "mngr246165" and "uqUrepe"
#Then verify homepage title
#Then close the browser

Scenario Outline: Guru 99 Test

Given user is already in Test
When user is verify the Title
Then user is clicking on login
Then user enter "<username>" and "<password>"
Then verify homepage title
Then close the browser

Examples:
	| username | password |
	| mngr246165 | uqUrepe |
	| tom | test456 |