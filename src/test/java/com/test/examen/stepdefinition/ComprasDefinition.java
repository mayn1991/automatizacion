package com.test.examen.stepdefinition;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;
import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.test.examen.task.AgregarCarroCompras;
import com.test.examen.task.MoveToDresses;
import com.test.examen.task.RegistrarUsuario;

import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.actions.Click;
import static com.test.examen.userinterfaces.ComprasPage.*;
import static com.test.examen.userinterfaces.HomePage.TXT_WELCOME;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class ComprasDefinition {


	@When("^ingreso el mail \"([^\"]*)\" y su contrasenia \"([^\"]*)\"$")
	public void ingresoElMailYSuContrasenia(String mail, String contrasenia) {
		theActorInTheSpotlight().wasAbleTo(
				Enter.theValue(mail).into(TXT_MAIL),
				Enter.theValue(contrasenia).into(TXT_CONTRASENIA),
				Click.on(BTN_LOGIN)
				);
	}

	@Then("^valido que ingreso el usuario$")
	public void validoQueIngresoElUsuario() {
		theActorInTheSpotlight().should(seeThat(the(TXT_WELCOME), isPresent()));
	}

	@When("^ingreso el producto \"([^\"]*)\"$")
	public void ingresoElProducto(String producto) {
		theActorInTheSpotlight().wasAbleTo(
				Enter.theValue(producto).into(TXT_BUSQUEDA),
				Click.on(BTN_BUSQUEDA)
				);		
	}

	@Then("^valido a buscado correctamente$")
	public void validoABuscadoCorrectamente() {
		theActorInTheSpotlight().should(seeThat(the(BTN_PRODUCTO), isPresent()));
	}

	@When("^seleccione vestido de verano$")
	public void seleccioneVestidoDeVerano() {
		theActorInTheSpotlight().wasAbleTo(
				MoveToDresses.escogerMenu("Summer Dresses")	
				);
	}

	@When("^agrego el producto \"([^\"]*)\"$")
	public void agregoElProducto(String producto) {
		theActorInTheSpotlight().wasAbleTo(
				AgregarCarroCompras.ingresarProducto(producto)	
				);
	}

	@When("^seleccione vestido de noche$")
	public void seleccioneVestidoDeNoche() {
		theActorInTheSpotlight().wasAbleTo(
				MoveToDresses.escogerMenu("Evening Dresses")	
				);
	}

	@When("^seleccione vestido casual$")
	public void seleccioneVestidoCasual() {		
		theActorInTheSpotlight().wasAbleTo(
				MoveToDresses.escogerMenu("Casual Dresses")	
				);
	}

	@When("^hacemos click checkout$")
	public void hacemosClickCheckout() throws InterruptedException {
		theActorInTheSpotlight().wasAbleTo(
				Click.on(BTN_CHECKOUT)	,
				Click.on(BTN_CHECKOUT_PROCEED)	
				);	

	}

	@When("^hacemos click para pasar a direccion$")
	public void hacemosClickParaPasarADireccion() {
		theActorInTheSpotlight().wasAbleTo(
				Click.on(BTN_DIRECCION)
				);	
	}

	@When("^hacemos click para pasar a envios$")
	public void hacemosClickParaPasarAEnvios() {
		theActorInTheSpotlight().wasAbleTo(
				Click.on(CHK_ACUERDO)				
				);		
	}

	@When("^hacemos click para pasar a pagos$")
	public void hacemosClickParaPasarAPagos() {
		theActorInTheSpotlight().wasAbleTo(
				Click.on(BTN_ENVIO)
				);		
	}

	@When("^hacemos click en pago por bancos$")
	public void hacemosClickEnPagoPorBancos() {
		theActorInTheSpotlight().wasAbleTo(
				Click.on(BTN_BANCO)
				);		
	}

	@When("^hacemos click en confirmar orden$")
	public void hacemosClickEnConfirmarOrden() {
		theActorInTheSpotlight().wasAbleTo(
				Click.on(BTN_CONFIRM)
				);	
	}

	@Then("^valido que se la orden esta completada$")
	public void validoQueSeLaOrdenEstaCompletada() throws FileNotFoundException, UnsupportedEncodingException {
		int size =Integer.parseInt(leerTxt("src//test//resources//archivo.txt"));
		escribir(String.valueOf(size+1));
		theActorInTheSpotlight().should(seeThat(the(TXT_VERIFICACION), isPresent()));
	}

	@When("^hacemos click en Order history and details$")
	public void hacemosClickEnOrderHistoryAndDetails() {
		theActorInTheSpotlight().wasAbleTo(
				Click.on(BTN_ORDEN)
				);			
	}

	@Then("^valido todos los registros realizados$")
	public void validoTodosLosRegistrosRealizados()  {
		List<WebElement> lwelement = getDriver().findElements(By.xpath("//tbody//tr"));
		assertEquals(String.valueOf(lwelement.size()), leerTxt("src//test//resources//archivo.txt"));		
	}

	public String leerTxt(String direccion){ 

		String texto = "";

		try{
			BufferedReader bf = new BufferedReader(new FileReader(direccion));
			String temp = "";
			String bfRead;
			while((bfRead = bf.readLine()) != null){ 
				temp = temp + bfRead; 
			}

			texto = temp;

		}catch(Exception e){ 
			System.err.println("No se encontro archivo");
		}

		return texto;

	}
	
	public void escribir(String texto) throws FileNotFoundException, UnsupportedEncodingException {
		PrintWriter escribir;
		File miarchivo=new File("src//test//resources//archivo.txt");
		escribir=new PrintWriter(miarchivo,"utf-8");
		escribir.print(texto);
		escribir.close();
	}
}
