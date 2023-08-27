#Author : bilel souli
Feature: menu de page Home page

  Background: 
    Given utilisateur est bien connecte avec nom correct "Admin" et mdp coorect "admin123" et rederiger vers la page home page

  Scenario Outline: click sur le menu choisie et affiche la page concerner
    When utilisateur click sur "<menu>"
    Then la page menu choisisee est affichee

    Examples: 
      | menu  |
      | PIM   |
      | Admin |
      | Time  |
