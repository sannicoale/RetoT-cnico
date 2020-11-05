package com.Pruebas.pruebas1.definition;

import com.comprar.steps.CarritoComprasSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CarroComprasdefinition {
	
	@Steps
	CarritoComprasSteps  comprarSteps;
	
@Given("^Ingresar  a la URL del supermercado$")
public void ingresar_a_la_URL_del_supermercado() {
	comprarSteps.Supermercado();
}

@Given("^Aceptar o Negar mensaje$")
public void aceptar_o_Negar_mensaje() {
}

@When("^selecciono el producto$")
public void selecciono_el_producto() {
   
}

@When("^y selecciono comprar$")
public void y_selecciono_comprar() {
    
}

@Then("^Verificar que el producto este en el carrito de compras$")
public void verificar_que_el_producto_este_en_el_carrito_de_compras() {
	
}
}


