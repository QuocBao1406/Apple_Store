package view.pages;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class EmployeeManagerment extends JPanel{
	private JTextField tf_id;
	private JTextField tf_name;
	private JTextField tf_cccd;
	private JTextField tf_sex;
	private JTextField tf_birth;
	private JTextField tf_phone;
	private JTextField tf_position;
	private JTextField tf_wage;
	private JLabel lb_export_list;
	private JTextField tf_search;
	private JTable table;
	private JLabel lb_add;
	private JLabel lb_edit;
	private JLabel lb_delete;
	public EmployeeManagerment() {
		setForeground(new Color(0, 0, 0));
		setBackground(new Color(255, 255, 255));
		setSize(1250, 820);
		setLayout(null);
		
		JLabel logo_title = new JLabel("");
		logo_title.setIcon(new ImageIcon(EmployeeManagerment.class.getResource("/images/icons/logo_title.png")));
		logo_title.setBounds(398, 10, 449, 99);
		add(logo_title);
		
		JLabel lb_id = new JLabel("Mã nhân viên");
		lb_id.setFont(new Font("Tahoma", Font.BOLD, 25));
		lb_id.setBounds(59, 130, 171, 30);
		add(lb_id);
		
		tf_id = new JTextField();
		tf_id.setFont(new Font("Tahoma", Font.PLAIN, 25));
		tf_id.setBounds(254, 130, 250, 31);
		add(tf_id);
		tf_id.setColumns(10);
		
		JLabel lb_name = new JLabel("Tên nhân viên");
		lb_name.setFont(new Font("Tahoma", Font.BOLD, 25));
		lb_name.setBounds(59, 185, 185, 30);
		add(lb_name);
		
		tf_name = new JTextField();
		tf_name.setFont(new Font("Tahoma", Font.PLAIN, 25));
		tf_name.setColumns(10);
		tf_name.setBounds(254, 185, 250, 31);
		add(tf_name);
		
		JLabel lb_cccd = new JLabel("CCCD");
		lb_cccd.setFont(new Font("Tahoma", Font.BOLD, 25));
		lb_cccd.setBounds(59, 237, 171, 30);
		add(lb_cccd);
		
		tf_cccd = new JTextField();
		tf_cccd.setFont(new Font("Tahoma", Font.PLAIN, 25));
		tf_cccd.setColumns(10);
		tf_cccd.setBounds(254, 237, 250, 31);
		add(tf_cccd);
		
		JLabel lb_sex = new JLabel("Giới tính");
		lb_sex.setFont(new Font("Tahoma", Font.BOLD, 25));
		lb_sex.setBounds(59, 293, 171, 30);
		add(lb_sex);
		
		tf_sex = new JTextField();
		tf_sex.setFont(new Font("Tahoma", Font.PLAIN, 25));
		tf_sex.setColumns(10);
		tf_sex.setBounds(254, 293, 250, 31);
		add(tf_sex);
		
		JLabel lb_birth = new JLabel("Ngày sinh");
		lb_birth.setFont(new Font("Tahoma", Font.BOLD, 25));
		lb_birth.setBounds(538, 130, 171, 30);
		add(lb_birth);
		
		tf_birth = new JTextField();
		tf_birth.setFont(new Font("Tahoma", Font.PLAIN, 25));
		tf_birth.setColumns(10);
		tf_birth.setBounds(719, 130, 250, 31);
		add(tf_birth);
		
		JLabel lb_phone = new JLabel("Số điện thoại");
		lb_phone.setFont(new Font("Tahoma", Font.BOLD, 25));
		lb_phone.setBounds(538, 185, 171, 30);
		add(lb_phone);
		
		tf_phone = new JTextField();
		tf_phone.setFont(new Font("Tahoma", Font.PLAIN, 25));
		tf_phone.setColumns(10);
		tf_phone.setBounds(719, 185, 250, 31);
		add(tf_phone);
		
		JLabel lb_position = new JLabel("Chức vụ");
		lb_position.setFont(new Font("Tahoma", Font.BOLD, 25));
		lb_position.setBounds(538, 236, 171, 30);
		add(lb_position);
		
		tf_position = new JTextField();
		tf_position.setFont(new Font("Tahoma", Font.PLAIN, 25));
		tf_position.setColumns(10);
		tf_position.setBounds(719, 236, 250, 31);
		add(tf_position);
		
		JLabel lb_wage = new JLabel("Lương");
		lb_wage.setFont(new Font("Tahoma", Font.BOLD, 25));
		lb_wage.setBounds(538, 292, 171, 30);
		add(lb_wage);
		
		tf_wage = new JTextField();
		tf_wage.setFont(new Font("Tahoma", Font.PLAIN, 25));
		tf_wage.setColumns(10);
		tf_wage.setBounds(719, 292, 250, 31);
		add(tf_wage);
		
		lb_export_list = new JLabel("Xuất danh sách");
		lb_export_list.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lb_export_list.setBackground(new Color(214, 3, 3));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lb_export_list.setBackground(new Color(255, 30, 30));
			}
		});
		lb_export_list.setIcon(new ImageIcon(EmployeeManagerment.class.getResource("/images/icons/export.png")));
		lb_export_list.setHorizontalAlignment(SwingConstants.CENTER);
		lb_export_list.setBackground(new Color(255, 30, 30));
		lb_export_list.setOpaque(true);
		lb_export_list.setFont(new Font("Tahoma", Font.BOLD, 19));
		lb_export_list.setBounds(1005, 130, 214, 44);
		add(lb_export_list);
		
		lb_add = new JLabel("Thêm nhân viên");
		lb_add.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lb_add.setBackground(new Color(218, 207, 1));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lb_add.setBackground(new Color(255, 238, 26));
			}
		});
		lb_add.setIcon(new ImageIcon(EmployeeManagerment.class.getResource("/images/icons/add.png")));
		lb_add.setOpaque(true);
		lb_add.setHorizontalAlignment(SwingConstants.CENTER);
		lb_add.setFont(new Font("Tahoma", Font.BOLD, 20));
		lb_add.setBackground(new Color(255, 238, 26));
		lb_add.setBounds(1005, 191, 214, 44);
		add(lb_add);
		
		lb_edit = new JLabel("Sửa nhân viên");
		lb_edit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lb_edit.setBackground(new Color(0, 213, 48));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lb_edit.setBackground(new Color(38, 255, 77));
			}
		});
		lb_edit.setIcon(new ImageIcon(EmployeeManagerment.class.getResource("/images/icons/edit.png")));
		lb_edit.setOpaque(true);
		lb_edit.setHorizontalAlignment(SwingConstants.CENTER);
		lb_edit.setFont(new Font("Tahoma", Font.BOLD, 20));
		lb_edit.setBackground(new Color(38, 255, 77));
		lb_edit.setBounds(1005, 252, 214, 44);
		add(lb_edit);
		
		lb_delete = new JLabel("Xóa nhân viên");
		lb_delete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lb_delete.setBackground(new Color(0, 185, 238));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lb_delete.setBackground(new Color(36, 206, 255));
			}
		});
		lb_delete.setIcon(new ImageIcon(EmployeeManagerment.class.getResource("/images/icons/delete.png")));
		lb_delete.setOpaque(true);
		lb_delete.setHorizontalAlignment(SwingConstants.CENTER);
		lb_delete.setFont(new Font("Tahoma", Font.BOLD, 20));
		lb_delete.setBackground(new Color(36, 206, 255));
		lb_delete.setBounds(1005, 313, 214, 44);
		add(lb_delete);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(59, 402, 1150, 385);
		add(scrollPane);
		
		table = new JTable();
		table.setEnabled(false);
		table.setFont(new Font("Tahoma", Font.PLAIN, 15));
		table.setRowHeight(30);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
			},
			new String[] {
				"M\u00E3 nh\u00E2n vi\u00EAn", "T\u00EAn nh\u00E2n vi\u00EAn", "CCCD", "Gi\u1EDBi t\u00EDnh", "Ng\u00E0y sinh", "S\u1ED1 \u0111i\u1EC7n tho\u1EA1i", "Ch\u1EE9c v\u1EE5", "L\u01B0\u01A1ng"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(100);
		table.getColumnModel().getColumn(1).setPreferredWidth(200);
		table.getColumnModel().getColumn(1).setMinWidth(20);
		table.getColumnModel().getColumn(2).setPreferredWidth(150);
		table.getColumnModel().getColumn(3).setPreferredWidth(100);
		table.getColumnModel().getColumn(4).setPreferredWidth(150);
		table.getColumnModel().getColumn(5).setPreferredWidth(150);
		table.getColumnModel().getColumn(6).setPreferredWidth(150);
		table.getColumnModel().getColumn(7).setPreferredWidth(150);
		scrollPane.setViewportView(table);
		
		tf_search = new JTextField();
		tf_search.setBounds(59, 362, 250, 30);
		add(tf_search);
		tf_search.setColumns(10);
	}
}
