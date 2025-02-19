Feature: Interact with the LuloX Chatbot
  As a user
  I want to interact with the LuloX chatbot
  To get help or information

  Scenario: Interact with the chatbot
    Given The User opens the LuloX page
    When He clicks on the chat icon
    And He interacts with the chat by sending a message
    Then He should see a response from the chatbot