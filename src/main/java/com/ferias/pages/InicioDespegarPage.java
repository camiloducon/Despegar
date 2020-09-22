package com.ferias.pages;

import java.util.List;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("https://www.despegar.com.co/")
public class InicioDespegarPage extends PageObject{
	
	@FindBy(xpath = "//i[@class='tooltip-close dreck-3-icon-close incentive-close']")
	WebElementFacade btnCerrarNotificacion;
	
	@FindBy(xpath="//a[@class='shifu-3-button-circle PACKAGES paint-circle ']")
	WebElementFacade btnPaquetes;
	
	@FindBy(xpath = "//input[@class='input-tag sbox-main-focus sbox-destination sbox-secondary sbox-places-second places-inline']")
	WebElementFacade txtCiudadDestino;
	
	@FindBy(xpath= "//ul[@class='ac-group-items']/li")
	List<WebElementFacade> lstCiudadDestino;
	
	@FindBy(xpath = "//div[@class='input-container sbox-checkin-input-container']/input")
	WebElementFacade btnFechaIda;
	
	@FindBy(xpath = "/html/body/div[5]/div/div[5]/div[2]/div[4]/span[8]")
	WebElementFacade seleccionFecha;
	
	@FindBy(xpath = "/html/body/div[5]/div/div[5]/div[2]/div[4]/span[15]")
	WebElementFacade btnFechaVuelta;
	
	@FindBy(xpath= "sbox-3-btn -primary -md sbox-search")
	WebElementFacade btnRealizarBusqueda;
	
	
	public void ingresarBusquedaPaquetes() {
		if (btnCerrarNotificacion.isCurrentlyVisible()) {
			btnCerrarNotificacion.click();
		}
		btnPaquetes.click();
		txtCiudadDestino.sendKeys("Cartagena de Indias, Bolívar, Colombia");
		btnFechaIda.click();
		seleccionFecha.click();
		btnFechaVuelta.click();
		
		
	}
	

}
