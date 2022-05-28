@smoke
  Feature: F07_folowUs | guest user could open followUs links

    Scenario: guest user open facebook link
      When guest user open facebook link
      Then Facebook is opened in new tab

    Scenario: guest user open twitter link
      When guest user open twitter link
      Then Twitter is opened in new tab

    Scenario: guest user open rss link
      When guest user open rss link
      Then RSS is opened in new tab

    Scenario: guest user open youtube link
      When guest user open youtube link
      Then Youtube is opened in new tab



