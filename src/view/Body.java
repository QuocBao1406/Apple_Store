package view;

import javax.swing.JPanel;

import view.pages.EmployeeManagerment;

import java.awt.CardLayout;
import java.awt.Color;

public class Body extends JPanel{
	private EmployeeManagerment employee;

	public Body() {
		setSize(1250, 820);
		setLayout(new CardLayout(0, 0));
		
		employee = new EmployeeManagerment();
		add(employee, "employee");
	}
}
