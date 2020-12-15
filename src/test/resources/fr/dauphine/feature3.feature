Feature: Feature3
  As a virus, I want to voler des maladies à virus.


  Scenario: Vol maladie
    Given La creation virus et lui affecter la maladie "mard"
    When creation virusDeux deux fois mechant et vol maladie
    Then maladie "mard" est bien chez virusDeux 
