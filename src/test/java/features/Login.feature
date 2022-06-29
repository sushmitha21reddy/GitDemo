Feature: Application Login


Scenario: home page default login
Given user is on landing page 
When user login into application by giving user name and password 
Then home page is populated
And Crads are displayed  


