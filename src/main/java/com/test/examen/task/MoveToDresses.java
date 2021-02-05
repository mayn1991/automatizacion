package com.test.examen.task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static com.test.examen.userinterfaces.ComprasPage.*;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class MoveToDresses implements Task {

	private String menu;

	public MoveToDresses(String menu) {
		this.menu=menu;
	}
	
	public <T extends Actor> void performAs(T actor) {
		WebElement wmenu = BrowseTheWeb.as(actor).getDriver().findElements(By.xpath("//a[@title='Dresses']")).get(1);
		wmenu.click();
	    WebElement submenu = BrowseTheWeb.as(actor).getDriver().findElements(By.xpath("//li//a[contains(text(),'"+menu+"')]")).get(2);
		submenu.click();	    
	}

	public static MoveToDresses escogerMenu(String menu) {
        return instrumented(MoveToDresses.class,menu);
    }
	
}
