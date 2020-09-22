package com.ferias.stepsDefinitions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ferias.steps.CrearHojaDeVidaSteps;
import com.ferias.utils.DataDrivenExcel;
import com.ferias.utils.Excel;

import cucumber.api.DataTable;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.thucydides.core.annotations.Steps;

public class CrearHojaDeVidaStepsDefinition {

	DataDrivenExcel dataDriverExcel = new DataDrivenExcel();
	List<Map<String, String>> processExcel;
	Map<String, String> data = new HashMap<String, String>();

	@Steps
	CrearHojaDeVidaSteps crearHojaDeVidaSteps;

	@Dado("^que ingreso en el aplicativo despegar(\\d+)$")
	public void queMeIngresoEnElAplicativoDespegar(int fila, DataTable datosExcel) {
		processExcel = datosExcel.asMaps(String.class, String.class);
		Excel excel = new Excel(processExcel.get(0).get("Ruta Excel"), processExcel.get(0).get("Pestaña"), true, fila);
		data = dataDriverExcel.leerExcel(excel);
		crearHojaDeVidaSteps.ingresarUrl();
	}

	@Cuando("^ingreso por la opcion paquetes$")
	public void ingresoPorLaOpcionPaquetes() {
		crearHojaDeVidaSteps.ingresarEnPaquetes();
	}

	@Y("^realizo el respectivo uso de los filtros$")
	public void realizoElRespectivoUsoDeLosFiltros() {

	}

	@Entonces("^puedo ver la informacion de los paquetes disponibles$")
	public void puedoVerLaInformacionDeLosPaquetesDisponibles() {

	}

	@Y("^entonces puedo imprimir las diferentes ofertas$")
	public void entoncesPuedoImprimirLasDiferentesOfertas() {

	}

}
