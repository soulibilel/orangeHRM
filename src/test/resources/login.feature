# Author : bilel souli
Feature: Orange Login

  Background: 
    Given administrateur sur la page authentification

  Scenario: connexion correct
    When entre le nom coorect "Admin" et le mot passe correct  "admin123"
    Then adimibistrateur deriger vers la page accueil  contient message "Dashboard"

  Scenario: connexion incorrect
    When entre le nom incoorect "Admn" et le mot passe incorrect  "adminadmin"
    Then adimibistrateur reste sur la page authentification avec un message derreur "Invalid credentials"