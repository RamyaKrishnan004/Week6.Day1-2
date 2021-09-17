Feature: CreateLead functionality for Test Taps application
#Background:
#Given Open the chrome browser
#And Load the application 'http://leaftaps.com/opentaps/'

Scenario Outline: TC001- CreateLead
#Given Open the Chrome Browser
#And Load the application url
#Given Enter the username as <username>
#And Enter the password as <password>
#When Click on Login button
#When Click on CRMSFA link
#And Click on Leads Button
When Click on Create Lead Button
Given Enter the companyName as <company>
And Enter the firstName as <fname>
And Enter the lastName as <lname>
And Enter the phonenumber as <phno>
When Click on Submit button

Examples:
|username|password|company|fname|lname|phno|
|'Demosalesmanager'|'crmsfa'|'Atos'|'Ramya'|'Krishnan'|'12'|
