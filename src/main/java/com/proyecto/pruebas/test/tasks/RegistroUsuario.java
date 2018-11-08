package com.proyecto.pruebas.test.tasks;

import static com.proyecto.pruebas.test.userinterfaces.RegistroUsuario.BOTON_REGISTRAR;
import static com.proyecto.pruebas.test.userinterfaces.RegistroUsuario.BOTON_REGISTRARSE;
import static com.proyecto.pruebas.test.userinterfaces.RegistroUsuario.CONFIRMAR_CONTRASENA;
import static com.proyecto.pruebas.test.userinterfaces.RegistroUsuario.CONTRASENA;
import static com.proyecto.pruebas.test.userinterfaces.RegistroUsuario.USUARIO;

import java.util.List;

import com.proyecto.pruebas.test.models.DatosUsuario;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class RegistroUsuario implements Task {

	private List<DatosUsuario> datos;

	public RegistroUsuario(List<DatosUsuario> datos) {
		this.datos = datos;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(BOTON_REGISTRAR));
		actor.attemptsTo(Enter.theValue(datos.get(0).getUsuario().trim()).into(USUARIO));
		actor.attemptsTo(Enter.theValue(datos.get(0).getContrasena().trim()).into(CONTRASENA));
		actor.attemptsTo(Enter.theValue(datos.get(0).getConfirmarcontrasena().trim()).into(CONFIRMAR_CONTRASENA));
		actor.attemptsTo(Click.on(BOTON_REGISTRARSE));

	}

	public static RegistroUsuario enRegistro(List<DatosUsuario> datos) {
		// TODO Auto-generated method stub
		return Tasks.instrumented(RegistroUsuario.class, datos);
	}

}
