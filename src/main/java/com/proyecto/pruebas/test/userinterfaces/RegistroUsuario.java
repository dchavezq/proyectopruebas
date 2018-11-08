package com.proyecto.pruebas.test.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class RegistroUsuario extends PageObject {

	public static final Target BOTON_REGISTRARSE = Target.the("Tipo de hora").located(By.linkText("REGISTER"));

	public static final Target USUARIO = Target.the("Tipo de hora").located(By.id("email"));

	public static final Target CONTRASENA = Target.the("Tipo de hora").located(By.name("password"));

	public static final Target CONFIRMAR_CONTRASENA = Target.the("Tipo de hora").located(By.name("confirmPassword"));
	
	public static final Target BOTON_REGISTRAR = Target.the("Tipo de hora").located(By.name("register"));
	
}
