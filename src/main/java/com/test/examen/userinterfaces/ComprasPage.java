package com.test.examen.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class ComprasPage {
	public static final Target TXT_MAIL=Target.the("texto mail").located(By.id("email"));
	public static final Target TXT_CONTRASENIA=Target.the("texto passwd").located(By.id("passwd"));
	public static final Target BTN_LOGIN=Target.the("boton login").located(By.id("SubmitLogin"));
	public static final Target TXT_BUSQUEDA=Target.the("texto busqueda").located(By.id("search_query_top"));
	public static final Target BTN_BUSQUEDA=Target.the("boton busqueda").locatedBy("//button[@class='btn btn-default button-search']");
	public static final Target BTN_PRODUCTO=Target.the("producto").locatedBy("//a[@class='product-name' and @title='Blouse']");
	public static final Target BTN_MENU=Target.the("menu").locatedBy("//a[@title='Dresses']");
	public static final Target BTN_SUB_MENU=Target.the("submenu").locatedBy("//li//a[text()='Dresses']//following-sibling::ul[@class='submenu-container clearfix first-in-line-xs']//a[@title='Evening Dresses']");
	public static final Target BTN_AGREGAR=Target.the("agregar boton").locatedBy("//button//span[contains(text(),'Add to cart')]");
	public static final Target BTN_ABRIR=Target.the("agregar boton").locatedBy("//a[contains(text(),'{0}')]");
	public static final Target BTN_CONTINUE=Target.the("boton continuar").locatedBy("//span[@class='continue btn btn-default button exclusive-medium']");
	public static final Target BTN_CHECKOUT=Target.the("boton checkout").locatedBy("//div[@class='shopping_cart']//a[@rel='nofollow']");
	public static final Target BTN_CHECKOUT_PROCEED=Target.the("boton proceed").locatedBy("//p[@class='cart_navigation clearfix']//a[@title='Proceed to checkout']");
	public static final Target BTN_DIRECCION=Target.the("boton proceed").locatedBy("//button[@name='processAddress']");
	public static final Target BTN_ENVIO=Target.the("boton proceed").locatedBy("//button[@name='processCarrier']");
	public static final Target CHK_ACUERDO=Target.the("boton proceed").locatedBy("//input[@type='checkbox' and @id='cgv']");
	public static final Target BTN_PAGO=Target.the("boton proceed").locatedBy("//button[@name='processCarrier']");
	public static final Target BTN_BANCO=Target.the("boton proceed").locatedBy("//a[@class='bankwire' and @title='Pay by bank wire']");
	public static final Target BTN_CONFIRM=Target.the("boton proceed").locatedBy("//button[@class='button btn btn-default button-medium']");
	public static final Target TXT_VERIFICACION=Target.the("verificar orden").locatedBy("//strong[@class='dark' and text()='Your order on My Store is complete.']");
	public static final Target BTN_ORDEN=Target.the("verificar orden").locatedBy("//a[@title='Orders']");
	
	
}
