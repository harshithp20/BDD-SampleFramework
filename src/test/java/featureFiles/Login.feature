#Author: Chaitra 

Feature: Login To Vtiger Application

  Scenario: Login to VTiger Application With Valid Credentials
    Given I want to launch the browser
    And I want to load the URL 
    When Login page is displyed enter username and password
    And Click On Login 
    Then Validate for home Page title 

