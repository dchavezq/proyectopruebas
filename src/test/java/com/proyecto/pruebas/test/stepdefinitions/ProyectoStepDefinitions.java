package com.proyecto.pruebas.test.stepdefinitions;

import java.util.List;

import org.openqa.selenium.WebDriver;

import com.proyecto.pruebas.test.models.DatosUsuario;
import com.proyecto.pruebas.test.tasks.AbrirNavegador;
import com.proyecto.pruebas.test.tasks.RegistroUsuario;

import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class ProyectoStepDefinitions {

	// inicializar la instanciacion del driver
	@Managed(driver = "chrome")
	private WebDriver herBrowser;
	//instanciar el actor privado pues solo el step definition utiliza, la responsabilidad de la clase sigue siendo simple
	//mantenemos alta cohesion y bajo acomplamiento, se concentra en su responsabilidad que es llevar al actor a ejecutar tareas
	//
	private Actor marcela = Actor.named("Analista de pruebas");

	//en screenplay no se hace uso directo del driver directamente, se hace uso del actor, necesitamos que el actor referencia al driver
	//metodo before que se ejecute antes que los demas
	@Before
	public void configuracionInicial() {
		marcela.can(BrowseTheWeb.with(herBrowser));

	}

	@Dado("^marcela requiere realizar una reserva de vuelo$")
	public void marcelaRequiereRealizarUnaReservaDeVuelo(List<DatosUsuario> datos) {
		//precondiciones
		marcela.wasAbleTo(AbrirNavegador.dePaginaVuelos());
		marcela.wasAbleTo(RegistroUsuario.enRegistro(datos));

	}

	@Cuando("^marcela registra la informacion necesaria para el vuelo$")
	public void marcelaRegistraLaInformacionNecesariaParaElVuelo() {
		//condiciones

	}

	@Entonces("^ella deberia poder verificar su vuelo exitosamente$")
	public void ellaDeberiaPoderVerificarSuVueloExitosamente() {
		//poscondiciones

	}

}
