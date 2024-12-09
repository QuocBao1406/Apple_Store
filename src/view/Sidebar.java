package view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

public class Sidebar extends JPanel{
	
	private JLabel lb_store_managerment;
	private JLabel lb_employee_management;
	private JLabel lb_product_managerment;
	private JLabel lb_customer;
	private JLabel lb_revenue;
	private JLabel lb_statistical;
	private JLabel lb_logo;

	public Sidebar() {
		setForeground(new Color(62, 185, 244));
		setBackground(new Color(79, 207, 244));
		setSize(300, 820);
		setLayout(null);
		
		lb_store_managerment = new JLabel("QUẢN LÝ CỬA HÀNG");
		lb_store_managerment.setIcon(new ImageIcon(Sidebar.class.getResource("/images/icons/image_store.png")));
		lb_store_managerment.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lb_store_managerment.setBackground(new Color(65, 182, 244));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lb_store_managerment.setBackground(new Color(189, 227, 253));
			}
		});
		lb_store_managerment.setForeground(new Color(255, 255, 255));
		lb_store_managerment.setHorizontalAlignment(SwingConstants.CENTER);
		lb_store_managerment.setFont(new Font("Tahoma", Font.BOLD, 22));
		lb_store_managerment.setBackground(new Color(189, 227, 253));
		lb_store_managerment.setOpaque(true);
		lb_store_managerment.setBounds(0, 232, 300, 61);
		add(lb_store_managerment);
		
		lb_employee_management = new JLabel("QUẢN LÝ NHÂN VIÊN");
		lb_employee_management.setIcon(new ImageIcon(Sidebar.class.getResource("/images/icons/image_employee.png")));
		lb_employee_management.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lb_employee_management.setBackground(new Color(65, 182, 244));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lb_employee_management.setBackground(new Color(189, 227, 253));
			}
		});
		lb_employee_management.setOpaque(true);
		lb_employee_management.setHorizontalAlignment(SwingConstants.CENTER);
		lb_employee_management.setForeground(Color.WHITE);
		lb_employee_management.setFont(new Font("Tahoma", Font.BOLD, 22));
		lb_employee_management.setBackground(new Color(189, 227, 253));
		lb_employee_management.setBounds(0, 303, 300, 61);
		add(lb_employee_management);
		
		lb_product_managerment = new JLabel("QUẢN LÝ SẢN PHẨM");
		lb_product_managerment.setIcon(new ImageIcon(Sidebar.class.getResource("/images/icons/image_product.png")));
		lb_product_managerment.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lb_product_managerment.setBackground(new Color(65, 182, 244));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lb_product_managerment.setBackground(new Color(189, 227, 253));
			}
		});
		lb_product_managerment.setOpaque(true);
		lb_product_managerment.setHorizontalAlignment(SwingConstants.CENTER);
		lb_product_managerment.setForeground(Color.WHITE);
		lb_product_managerment.setFont(new Font("Tahoma", Font.BOLD, 22));
		lb_product_managerment.setBackground(new Color(189, 227, 253));
		lb_product_managerment.setBounds(0, 374, 300, 61);
		add(lb_product_managerment);
		
		lb_customer = new JLabel("KHÁCH HÀNG");
		lb_customer.setIcon(new ImageIcon(Sidebar.class.getResource("/images/icons/image_customer.png")));
		lb_customer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lb_customer.setBackground(new Color(65, 182, 244));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lb_customer.setBackground(new Color(189, 227, 253));
			}
		});
		lb_customer.setOpaque(true);
		lb_customer.setHorizontalAlignment(SwingConstants.CENTER);
		lb_customer.setForeground(Color.WHITE);
		lb_customer.setFont(new Font("Tahoma", Font.BOLD, 22));
		lb_customer.setBackground(new Color(189, 227, 253));
		lb_customer.setBounds(0, 445, 300, 61);
		add(lb_customer);
		
		lb_revenue = new JLabel("DOANH THU");
		lb_revenue.setIcon(new ImageIcon(Sidebar.class.getResource("/images/icons/image_revenue.png")));
		lb_revenue.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lb_revenue.setBackground(new Color(65, 182, 244));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lb_revenue.setBackground(new Color(189, 227, 253));
			}
		});
		lb_revenue.setOpaque(true);
		lb_revenue.setHorizontalAlignment(SwingConstants.CENTER);
		lb_revenue.setForeground(Color.WHITE);
		lb_revenue.setFont(new Font("Tahoma", Font.BOLD, 22));
		lb_revenue.setBackground(new Color(189, 227, 253));
		lb_revenue.setBounds(0, 516, 300, 61);
		add(lb_revenue);
		
		lb_statistical = new JLabel("THỐNG KÊ");
		lb_statistical.setIcon(new ImageIcon(Sidebar.class.getResource("/images/icons/image_statistical.png")));
		lb_statistical.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lb_statistical.setBackground(new Color(65, 182, 244));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lb_statistical.setBackground(new Color(189, 227, 253));
			}
		});
		lb_statistical.setOpaque(true);
		lb_statistical.setHorizontalAlignment(SwingConstants.CENTER);
		lb_statistical.setForeground(Color.WHITE);
		lb_statistical.setFont(new Font("Tahoma", Font.BOLD, 22));
		lb_statistical.setBackground(new Color(189, 227, 253));
		lb_statistical.setBounds(0, 587, 300, 61);
		add(lb_statistical);
		
		lb_logo = new JLabel("");
		lb_logo.setIcon(new ImageIcon(Sidebar.class.getResource("/images/icons/logo.png")));
		lb_logo.setBounds(50, 22, 200, 200);
		add(lb_logo);
		
	}
}
