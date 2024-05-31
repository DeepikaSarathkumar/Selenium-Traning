Feature: To validate the login functionality of facebook application

Background:
Given To launch the chrome browser and maximize window

Scenario: To validate login with valid username and invalid password

When To launch the url of the facebook application
And To pass valid username in email field
And To pass invalid password in password field
And To click the login button
And To check whether navigate to the homepage or not
Then To close the browser

Scenario Outline: To validate the positive and negative combinations of login functionality

When User has to hit the facebook url
And User has to pass the data "<emaildatas>" in email field
And User has to pass the data "<passworddatas>" in password field
And User has to click login button
Then User has to close the browser

Examples:
|emaildatas                                 |passworddatas|
|deepika@gmail.com                          |12345|
|deepa@gmail.com                            |deepika|
|abc@gmail.com                              |00112233|
|inmakes@gmail.com                          |selenium|
|frameworks@gmail.com                       |cucumber|
|manualtesting@gmail.com                    |6262622|
|apitesting@gmail.com                       |abcdfef|





	