package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.miginfocom.swing.MigLayout;

public class Main extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private Sidebar sidebar;
	private Body body;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(-5, 0, 1550, 820);
		setTitle("Apple Store");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		contentPane.setLayout(new MigLayout("fillx, filly", "0[300!]0[fill, 100%]0", "0[fill]0"));
		
		sidebar = new Sidebar();
		contentPane.add(sidebar, "width 300:300:300");
		
		body = new Body();
		contentPane.add(body, "width 1240:1240:1240");
		
		setContentPane(contentPane);
	}

}
