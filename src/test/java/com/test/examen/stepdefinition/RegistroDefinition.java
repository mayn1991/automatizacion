package com.test.examen.stepdefinition;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

import static com.test.examen.userinterfaces.HomePage.*;
import org.openqa.selenium.By;

import com.test.examen.task.RegistrarUsuario;
import com.test.examen.userinterfaces.HomePage;

import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.targets.Target;

public class RegistroDefinition {

	private HomePage homePage = new HomePage();
	private RegistrarUsuario registrarUsuario=new RegistrarUsuario();
	public static final Target BTN_SIGN_IN = Target.the("boton sign in ").located(By.className("login"));
	   
	  
	@Given("^que ingreso a la tienda virtual$")
	public void queIngresoALaTiendaVirtual() {
		  theActorCalled("Marco").wasAbleTo(Open.browserOn(homePage));
          getDriver().manage().window().maximize();
	}

	@Given("^hago click en el Sign in$")
	public void hagoClickEnElSignIn() {
		theActorInTheSpotlight().wasAbleTo(
			 Click.on(BTN_SIGN_IN)
        );
	}

	@When("^creo una nueva cuenta \"([^\"]*)\"$")
	public void creoUnaNuevaCuenta(String mail) {
		registrarUsuario.setMail(mail);
	}

	@When("^ingreso la informacion personal como su nombre \"([^\"]*)\"$")
	public void ingresoLaInformacionPersonalComoSuNombre(String nombre) {
		registrarUsuario.setNombre(nombre);;
	}
	
	@When("^ingreso su apellido \"([^\"]*)\"$")
	public void ingresoSuApellido(String apellido) {
		registrarUsuario.setApellido(apellido);
	}

	@When("^ingreso su contrasenia \"([^\"]*)\"$")
	public void ingresoSuContrasenia(String contrasenia) {
		registrarUsuario.setContrasenia(contrasenia);
	}
	
	@When("^ingreso su direccion \"([^\"]*)\"$")
	public void ingresoSuDireccion(String direccion) {
		registrarUsuario.setDireccion(direccion);
	}

	@When("^ingreso su ciudad \"([^\"]*)\"$")
	public void ingresoSuCiudad(String ciudad) {
		registrarUsuario.setCiudad(ciudad);
	}

	@When("^ingreso su estado \"([^\"]*)\"$")
	public void ingresoSuEstado(String estado) {
		registrarUsuario.setEstado(estado);
	}

	@When("^ingreso su codigo postal \"([^\"]*)\"$")
	public void ingresoSuCodigoPostal(String codigo) {
		registrarUsuario.setCodigo(codigo);
	}

	@When("^ingreso la ciudad \"([^\"]*)\"$")
	public void ingresoLaCiudad(String ciudad) {
		registrarUsuario.setCiudad(ciudad);
	}

	@When("^ingreso el pais \"([^\"]*)\"$")
	public void ingresoElPais(String pais) {
		registrarUsuario.setPais(pais);
	}

	@When("^ingreso su numero celular \"([^\"]*)\"$")
	public void ingresoSuNumeroCelular(String celular) {
		registrarUsuario.setCelular(celular);
	}

	@When("^ingreso su referencia \"([^\"]*)\"$")
	public void ingresoSuReferencia(String referencia) {
		registrarUsuario.setReferencia(referencia);
		theActorInTheSpotlight().wasAbleTo(
			RegistrarUsuario.informacionPersonal(registrarUsuario.getMail(),registrarUsuario.getNombre(),registrarUsuario.getApellido(),registrarUsuario.getContrasenia(),registrarUsuario.getDireccion(),
					registrarUsuario.getCiudad(),registrarUsuario.getEstado(),registrarUsuario.getCodigo(),registrarUsuario.getPais(),registrarUsuario.getCelular(),registrarUsuario.getReferencia())	
		);
	}

	@Then("^valido el registro de mi cuenta$")
	public void validoElRegistroDeMiCuenta() {
		 theActorInTheSpotlight().should(seeThat(the(TXT_WELCOME), isPresent()));
	}
}
