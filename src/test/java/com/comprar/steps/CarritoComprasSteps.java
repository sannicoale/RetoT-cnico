package com.comprar.steps;

import com.Pruebas.pruebas1.pageobjects.ComprarinPage;

import net.thucydides.core.annotations.Step;

public class CarritoComprasSteps {

	ComprarinPage comprarinPage;
	
	@Step
    public void  Supermercado() {
		comprarinPage.Open();
		comprarinPage.seleccionprodu();
		comprarinPage.agregar();
		
	}

}

