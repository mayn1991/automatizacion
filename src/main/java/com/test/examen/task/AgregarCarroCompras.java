package com.test.examen.task;

import static com.test.examen.userinterfaces.ComprasPage.*;
import static com.test.examen.userinterfaces.HomePage.TXT_VISIBLE_CREATE;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.Wait;

public class AgregarCarroCompras implements Task {

	private String nombre;
	
	public AgregarCarroCompras(String nombre) {
		this.nombre=nombre;
	}
	@Override
	public <T extends Actor> void performAs(T actor) {
		try {
			List<WebElement> lwelement = BrowseTheWeb.as(actor).getDriver().findElements(By.xpath("//a[contains(text(),'"+nombre+"')]"));
			lwelement.get(lwelement.size()-1).click();
		   
			Wait.until(the(BTN_AGREGAR), isPresent()).forNoLongerThan(20);
			actor.attemptsTo(
	    		  Click.on(BTN_AGREGAR)
	    	);
		
			Thread.sleep(5000);
			Wait.until(the(BTN_CONTINUE), isPresent()).forNoLongerThan(20);
			actor.attemptsTo(
		    		  Click.on(BTN_CONTINUE)	    		 
			);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
	}
	
	public static AgregarCarroCompras ingresarProducto(String nombre){
	     return instrumented(AgregarCarroCompras.class,nombre);	     
	}

}
