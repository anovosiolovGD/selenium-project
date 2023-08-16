Narrative:
As a user
I want to create a new account
So that in account sidebar will be shown my firstname and Sign out button

Scenario: User creates new account

Given the user is on the homepage
When accept button appears, user clicks it
When user clicks on header account button
When account sidebar appears, user clicks Create Account button
When user input email - "testtestteswiiaasdpolke2333@mail.org"
When input firstname - "test"
When input lastname - "test"
When input password - "Testtest1"
When confirm password - Testtest1
When input zipcode - "99950"
When input birthdate - "August" , "7"
When user accept conditions
When clicks Create Account button
When user opens account sidebar
Then in the account sidebar user sees firstname - "test" and Sign Out button