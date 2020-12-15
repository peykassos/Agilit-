Feature: Feature2
  As a virus, I want to affecter maladie à virus.
  

  Scenario: Affectation maladie 
    Given La creation du virus et "5" maladies
    When affecter "5" les maladies au virus
	Then avoir "5" dans la liste des maladies du virus
	
  Scenario: Affectation virus
    Given La creation du virus "vayrous" et maladie
    When affecter la maldie au virus
    Then avoir "vayrous" comme virus de la maladie
    