@smoke
  Feature: F06_homeSliders | guest user will be able to open sliders in home page
    #SC1
    Scenario: first slider is clickable on home page
      When guest user click on first slider
      Then relative product for first slider is displayed
    #SC2
    Scenario: second slider is clickable on home page
      When guest user click on second slider
      Then relative product for second slider is displayed
