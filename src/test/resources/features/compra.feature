#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@ComprarProducto
Feature: Comprar producto
  ingresar al  supermercado virtual,seleccionar producto y agregar al carro de compras.

  @CasoExitoso 
  Scenario: Agregar producto al carro de compras
    Given Ingresar  a la URL del supermercado
    And Aceptar o Negar mensaje
    When selecciono el producto 
    And  y selecciono comprar
    Then Verificar que el producto este en el carrito de compras

  @Step
  Scenario: Crear usuario
    public void thenPetShouldBeAvailable() {
        for (Pet pet : pets) {
            expect().that().statusCode(200)
                    .and().body("name", equalTo(pet.getName())).when()
                    .get("https://gorest.co.in//v2/pet/{id}",pet.getId());
        }
    }

    
