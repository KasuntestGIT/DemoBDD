Feature: Test smoke
  Scenario Outline: Test login application with valid credentials
    Given open browser
    When Enter valid "username" and "password"
    Then User can login
    Examples:
      |username  |password  |
      |kasunaratthanage@gmail.com|DATHA13|
      |kasunaratthanage@gmail.com|DATHA14|
