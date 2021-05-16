Feature: Login and review

Scenario: Positive login case
Given User is on imdbpage
And User clicks on signin button
When User enters "so123@gmail.com" and "123456"
And User enters signin button
#And User re enters "123456" 
#And User enters captacha and click continue
Then User is logged in
When User clicks on Menu and selects Top Rated Movies
And sort by release date
And User scrolls down to the least rated movie and clicks on it
Then User is navigated to the movie page and release date is printed in console