@tag
Feature: Add Course module

  Background: Loggedin with valid credentials
    Given admin opens the "http://integratedtoolingsystems.in/1swishzz_staging/admin" in the "chrome" browser
    And enters the username "admin@admin.com" and password "123456"
    When click on the login button
    Then then admin views the dashboard with "Welcome Admin" message

  @tag1
  Scenario: Display the Courses List
    When admin clicks on courses list option
    Then browser navigates to courses list page
    When admin clicks on the add course button
    Then browser naviagtes to add course page
    Given following course details
      | Category    | Java                |
      | Course Name | Core Java           |
      | Course URL  | www.oracle.com/java |
    And admin close the browser
