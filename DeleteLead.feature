Feature: DeleteLead functionality  for Test Taps application

Scenario: TC004- DeleteLead
#Given Open the Chrome Browser
#And Load the application url
#Given Enter the username as <username>
#And Enter the password as <password>
#When Click on Login button
#And Click on CRM/SFA link
#And Click on Leads Button
And Click on Find Lead 
And Click on Phone from findby
Given Enter the phone number as to Edit <phno>
When Click on Find Lead Button
When Delete the Lead and search
Then Search for deleted Lead ID

