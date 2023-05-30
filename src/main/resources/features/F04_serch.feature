@smoke
  Feature: search
    Scenario: user can search with name of product
      Given user click enter name of product on search bar
      Then search done successfully
    Scenario: user can search with sku
      Given user click enter sku of product on search bar
      Then search done by sku
