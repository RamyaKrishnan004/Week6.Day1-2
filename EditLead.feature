Feature: EditLead functionality of Test Taps application

Scenario Outline: TC002- EditLead
#Given Open the Chrome Browser
#And Load the application url
#Given Enter the username as <username>
#And Enter the password as <password>
#When Click on Login button
#And Click on CRM/SFA link
#And Click on Leads Button
And Click on Find Lead
And Click on Phone from findby
Given Enter the phone number to Edit <phno>
When Click on Find Lead Button
And Click on Edit Button
And Update company name as <company>
When Click on update button
When Click on Submit Button in Edit

Examples:
|username|password|phno|company|
|'Demosalesmanager'|'crmsfa'|'12'|'Atos'|



