package com.test.examen.task;
import static com.test.examen.userinterfaces.HomePage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

import org.openqa.selenium.Keys;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.Wait;

public class RegistrarUsuario  implements Task {

    private String mail;
    private String nombre;
    private String contrasenia;
    private String apellido;
    private String direccion;
    private String ciudad;
    private String estado;
    private String codigo;
    private String pais;
    private String celular;
    private String referencia;
    

    
    public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public <T extends Actor> void performAs(T actor) {
    	
    	actor.attemptsTo(
    		  Enter.theValue(mail).into(TXT_MAIL),
    		  Click.on(BTN_CREATE)
    	);
    	Wait.until(the(TXT_VISIBLE_CREATE), isPresent()).forNoLongerThan(5);
         
    	actor.attemptsTo(
    		  Click.on(BTN_TITLE),
   			  Enter.theValue(nombre).into(TXT_FIRST_NAME),
   			  Enter.theValue(apellido).into(TXT_LAST_NAME),
   			  Enter.theValue(contrasenia).into(TXT_CONTRASENIA),
   			  Enter.theValue(direccion).into(TXT_DIRECCION),
   			  Enter.theValue(ciudad).into(TXT_CIUDAD),
   			  SelectFromOptions.byVisibleText("Idaho").from(TXT_ESTADO),
   			  Enter.theValue(codigo).into(TXT_CODIGO),
   			  SelectFromOptions.byVisibleText("United States").from(TXT_PAIS),
   			  Enter.theValue("990271108").into(TXT_CELULAR),
   			  Enter.theValue("al costado").into(TXT_REFERENCIA),
   			  Click.on(BTN_REGISTRAR)
    	);
    	
    }
	
	public RegistrarUsuario() {
		
	}
	public RegistrarUsuario(String mail, String nombre,String apellido,String contrasenia,String direccion,String ciudad,
			String estado,String codigo, String pais,String celular, String referencia) {
		this.mail=mail;
		this.nombre=nombre;
		this.apellido=apellido;
		this.contrasenia=contrasenia;
		this.direccion=direccion;
		this.ciudad=ciudad;
		this.estado=estado;
		this.codigo=codigo;
		this.pais=pais;
		this.celular=celular;
		this.referencia=referencia;
	}
	
	public static RegistrarUsuario informacionPersonal(String mail,String nombre,String apellido,String contrasenia,String direccion,String ciudad,String estado,String codigo, String pais,String celular, String referencia) {
        return instrumented(RegistrarUsuario.class,mail,nombre,apellido,contrasenia,direccion,ciudad,estado,codigo, pais,celular, referencia);
    }

	
}
