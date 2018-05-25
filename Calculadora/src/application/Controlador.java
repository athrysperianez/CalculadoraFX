package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextField;

public class Controlador {
	
	@FXML
	private TextField num1;
	
	@FXML
	private TextField num2;
	
	@FXML
	private MenuButton menu;
	
	@FXML
	private TextField result;
	
	public void Sumar(ActionEvent event) {
		this.result.setText(Integer.toString(Integer.parseInt(this.num1.getText()) + Integer.parseInt(this.num2.getText())));
	}
	
	public void Restar(ActionEvent event) {
		this.result.setText(Integer.toString(Integer.parseInt(this.num1.getText()) - Integer.parseInt(this.num2.getText())));
	}
	
	public void Dividir(ActionEvent event) {
		this.result.setText(Integer.toString(Integer.parseInt(this.num1.getText()) / Integer.parseInt(this.num2.getText())));
	}
	
	public void Multiplicar(ActionEvent event) {
		this.result.setText(Integer.toString(Integer.parseInt(this.num1.getText()) * Integer.parseInt(this.num2.getText())));
	}
 
}
