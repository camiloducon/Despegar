package com.ferias.steps;

import com.ferias.pages.InicioDespegarPage;

import net.thucydides.core.annotations.Step;

public class CrearHojaDeVidaSteps {


	InicioDespegarPage inicioDespegarPage;
	
	@Step
	public void ingresarUrl() {
		inicioDespegarPage.open();
	}

	@Step
	public void ingresarEnPaquetes() {
		inicioDespegarPage.ingresarBusquedaPaquetes();
	}

}
