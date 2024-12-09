package view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Sidebar extends JPanel{
	
	public Sidebar() {
		setBackground(new Color(70, 146, 249));
		setSize(300, 820);
		setLayout(null);
		
		JLabel lb_store_managerment = new JLabel("QUẢN LÝ CỬA HÀNG");
		lb_store_managerment.setForeground(new Color(255, 255, 255));
		lb_store_managerment.setHorizontalAlignment(SwingConstants.CENTER);
		lb_store_managerment.setFont(new Font("Tahoma", Font.BOLD, 25));
		lb_store_managerment.setBackground(new Color(153, 251, 249));
		lb_store_managerment.setOpaque(true);
		lb_store_managerment.setBounds(0, 264, 300, 61);
		add(lb_store_managerment);
		
		JLabel lb_employee_manager = new JLabel("QUẢN LÝ NHÂN VIÊN");
		lb_employee_manager.setOpaque(true);
		lb_employee_manager.setHorizontalAlignment(SwingConstants.CENTER);
		lb_employee_manager.setForeground(Color.WHITE);
		lb_employee_manager.setFont(new Font("Tahoma", Font.BOLD, 25));
		lb_employee_manager.setBackground(new Color(153, 251, 249));
		lb_employee_manager.setBounds(0, 335, 300, 61);
		add(lb_employee_manager);
		
		JLabel lb_store_managerment_2 = new JLabel("QUẢN LÝ SẢN PHẨM");
		lb_store_managerment_2.setOpaque(true);
		lb_store_managerment_2.setHorizontalAlignment(SwingConstants.CENTER);
		lb_store_managerment_2.setForeground(Color.WHITE);
		lb_store_managerment_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		lb_store_managerment_2.setBackground(new Color(153, 251, 249));
		lb_store_managerment_2.setBounds(0, 406, 300, 61);
		add(lb_store_managerment_2);
		
		JLabel lb_customer = new JLabel("KHÁCH HÀNG");
		lb_customer.setOpaque(true);
		lb_customer.setHorizontalAlignment(SwingConstants.CENTER);
		lb_customer.setForeground(Color.WHITE);
		lb_customer.setFont(new Font("Tahoma", Font.BOLD, 25));
		lb_customer.setBackground(new Color(153, 251, 249));
		lb_customer.setBounds(0, 477, 300, 61);
		add(lb_customer);
		
		JLabel lb_income = new JLabel("DOANH THU");
		lb_income.setOpaque(true);
		lb_income.setHorizontalAlignment(SwingConstants.CENTER);
		lb_income.setForeground(Color.WHITE);
		lb_income.setFont(new Font("Tahoma", Font.BOLD, 25));
		lb_income.setBackground(new Color(153, 251, 249));
		lb_income.setBounds(0, 548, 300, 61);
		add(lb_income);
		
		JLabel lb_store_managerment_5 = new JLabel("THỐNG KÊ");
		lb_store_managerment_5.setOpaque(true);
		lb_store_managerment_5.setHorizontalAlignment(SwingConstants.CENTER);
		lb_store_managerment_5.setForeground(Color.WHITE);
		lb_store_managerment_5.setFont(new Font("Tahoma", Font.BOLD, 25));
		lb_store_managerment_5.setBackground(new Color(153, 251, 249));
		lb_store_managerment_5.setBounds(0, 619, 300, 61);
		add(lb_store_managerment_5);
		
	}
}
