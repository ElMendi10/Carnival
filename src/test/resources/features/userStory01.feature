#Author: Yeison Mendieta
@general
Feature: Registor de ususrio
  Yo como usuario quiero poder crear mi usuario llenando todos los campos del formulario 

  @UserStory1
  Scenario Outline: Registra el usurio de manera exitosa
    Given el usuario abre la pagina web
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |

