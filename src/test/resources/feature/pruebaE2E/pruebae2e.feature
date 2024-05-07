Feature: Ejercicio Práctico E2E
  I am a buyer, I add two products to the shopping cart and complete the purchase


  Scenario Outline: E2E Test
    Given the "customer" enters in the marketplace with their valid credentials <username> y <password>
    When add two products to the shopping cart and complete the purchase
    Then the customer will see the confirmation of their purchase <message>
    Examples:
      | username   | password       | message |
      | "standard_user" | "secret_sauce" |  "Thank you for your order!"  |
