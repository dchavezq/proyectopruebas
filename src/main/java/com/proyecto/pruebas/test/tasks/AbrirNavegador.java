package com.proyecto.pruebas.test.tasks;

import com.proyecto.pruebas.test.userinterfaces.InicioSesionPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirNavegador implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(new InicioSesionPage()));

	}

	public static AbrirNavegador dePaginaVuelos() {

		return Tasks.instrumented(AbrirNavegador.class);
	}

}
