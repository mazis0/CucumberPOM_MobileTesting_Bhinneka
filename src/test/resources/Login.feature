@Login
Feature: Login
    @Negative
  Scenario Outline: Login with invalid email
    Given The User open the apps and click next all step on user guide
    And User click Akun Saya on ButtonMenu
    And User enter wrong email as "<email>"
    And Enter password as "<password>"
    When User click on masuk button
    Then Error Message "<Err>" should be displayed

    Examples:
      | email                    | password | Err                           |
      | yourwrongemail@gmail.com | Az!s1234 | Login error! Kata sandi salah |

      @Negative
  Scenario Outline: Login with invalid password
    Given The User open the apps and click next all step on user guide
    And User click Akun Saya on ButtonMenu
    And User enter email as "<email>"
    And Enter wrong password as "<password>"
    When User click on masuk button
    Then Error Message "<Err>" should be displayed

    Examples:
      | email                     | password      | Err                           |
      | muhammadajis445@gmail.com | wrongpassword | Login error! Kata sandi salah |

  @Positive
  Scenario Outline: Login with valid email and password
    Given The User open the apps and click next all step on user guide
    And User click Akun Saya on ButtonMenu
    And User enter email as "<email>"
    And Enter password as "<password>"
    When User click on masuk button
    Then The label "<email>"  should be displayed

    Examples:
      | email                     | password |
      | muhammadajis445@gmail.com | Az!s1234 |
