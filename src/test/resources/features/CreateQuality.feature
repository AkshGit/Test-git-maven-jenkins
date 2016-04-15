Feature: Create New Quality
  As a user
  I want to log in as super admin
  So that I can create new Quality
  
  
@CreateQuality
  Scenario: Creating new Quality with all the valid data

    Given   I am on Create New Quality page
    When    I enter all the valid data
    Then    Quality should be added to Quality Library