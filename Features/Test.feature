Feature: Testing

Scenario: Validate if at least one quest is present
  Given User Launch Chrome browser
  When User opens url "https://nbl.one"
  Then Validate one quest is present
  Then close browser

Scenario: Try booking the skylift
  Given User Launch Chrome browser
  When User opens url "https://nby.la/rdJuXp"
  Then try to book the skylift
  Then close browser

Scenario: Scrape all cards for title, price and link
  Given User Launch Chrome browser
  When User opens url "https://nbl.one/listings"
  Then Scrape all cards title price link
  Then close browser