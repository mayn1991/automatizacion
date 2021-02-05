package com.test.examen.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://automationpractice.com/index.php")
public class HomePage extends PageObject {
	public static final Target TXT_MAIL=Target.the("texto mail").located(By.id("email_create"));
	public static final Target BTN_CREATE=Target.the("boton create").located(By.id("SubmitCreate"));
	public static final Target BTN_TITLE = Target.the("boton title").located(By.id("id_gender1"));
	public static final Target TXT_VISIBLE_CREATE=Target.the("texto visible").located(By.className("page-heading"));
	public static final Target TXT_FIRST_NAME=Target.the("texto first name").located(By.id("customer_firstname"));
	public static final Target TXT_LAST_NAME=Target.the("texto last name").located(By.id("customer_lastname"));
	public static final Target TXT_CONTRASENIA=Target.the("texto contraseña").located(By.id("passwd"));
	public static final Target TXT_DIRECCION=Target.the("texto direccion").located(By.id("address1"));
	public static final Target TXT_CIUDAD=Target.the("texto ciudad").located(By.id("city"));
	public static final Target TXT_ESTADO=Target.the("texto estado").located(By.id("id_state"));
	public static final Target TXT_CODIGO=Target.the("texto codigo").located(By.id("postcode"));
	public static final Target TXT_PAIS=Target.the("texto pais").located(By.id("id_country"));
	public static final Target TXT_CELULAR=Target.the("texto celular").located(By.id("phone_mobile"));
	public static final Target TXT_REFERENCIA=Target.the("texto referencia").located(By.id("alias"));
	public static final Target BTN_REGISTRAR=Target.the("boton registrar").located(By.id("submitAccount"));
	public static final Target TXT_WELCOME=Target.the("texto bienvenida").located(By.className("info-account"));

}
