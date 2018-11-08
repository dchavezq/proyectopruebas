package com.proyecto.pruebas.test.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

//ejecutamos un test con junit, ejecuta el test y genera el reporte en serenity
//cucumber options es para decirle que queremos ejecutar 

@RunWith(CucumberWithSerenity.class) 
@CucumberOptions(
		features = "src/test/resources/features/proyecto.feature",
		glue = "com.proyecto.pruebas.test.stepdefinitions",
		snippets = SnippetType.CAMELCASE
		)
public class ProyectoRunner {
	
	

}
