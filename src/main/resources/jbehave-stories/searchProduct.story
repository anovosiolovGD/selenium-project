Scenario: User searches for a product
Given the user is on the homepage
When accept button appears, user pushes it
When user clicks on header search button
When the user searches for "slim fit"
When clicks search button
Then the search results page is displayed and the user sees "11" of search results for "slim fit"