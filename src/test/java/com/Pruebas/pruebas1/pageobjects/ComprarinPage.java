package com.Pruebas.pruebas1.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.wong.pe/especiales/cyberwong")
public class ComprarinPage extends PageObject{


	@FindBy(xpath="//*[@id=\'ResultItems_49940739\']/div/ul/li[3]/div[1]/div[2]/div[2]")
	public WebElementFacade seleccionprodu;
	
	@FindBy(xpath="//*[@id=\'ResultItems_49940739\']/div/ul/li[3]/div[1]/div[3]/div[5]/button/span[5]")
	public WebElementFacade agregar;
		
	@FindBy(xpath="//*[@id=\'footer\']/div[3]/div/div/div/div/div/div[1]")
	public WebElementFacade lblProductoagregadoalcarrito;
	
	public void Supermercado() {
		
		seleccionprodu.click();
		agregar.click();		
	}

	public void seleccionprodu() {
		
	}

	public void agregar() {
		
	}

	public void Open() {
		
	}
	
	}



