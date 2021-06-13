Feature: opencart page test

  Scenario Outline: Register the users
    Given that leider enters the user registry
    When he enter the registration data
      | firstNameUser   | lastNameUser   | emailUser   | telephoneUser   | passwordUser   | passwordConfirm   |
      | <firstNameUser> | <lastNameUser> | <emailUser> | <telephoneUser> | <passwordUser> | <passwordConfirm> |
    Then Check the message on the screen
      |successfulMessage|
      |<successfulMessage>|
    Examples:
      | firstNameUser | lastNameUser | emailUser       | telephoneUser | passwordUser | passwordConfirm | successfulMessage |
      | leider        | tanos        | leider311@mail.com | 777777        | 12345        | 12345           |  Congratulations! Your new account has been successfully created!|
      | Arturo       | tanos        | leider111@mail.com | 777777        | 12345        | 12345           |  Congratulations! Your new account has been successfully created! |
