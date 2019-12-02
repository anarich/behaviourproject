#----------------------------------
# Empty Cucumber .feature file
#----------------------------------
    

   Feature: JCPenney Search 
Scenario: Search 
Given I am in JCPenney Page
When I type cookware
And submit the page
Then I see the search Result 
   
