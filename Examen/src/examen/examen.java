package examen;



import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;



public class examen {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					examen window = new examen();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public examen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 582, 640);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		
		panel_1.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(6, 65, 558, 104);
		panel_3.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblDireccion = new JLabel("Direccion:");
		lblDireccion.setBounds(6, 66, 104, 16);
		panel_3.add(lblDireccion);
		
		JLabel lblDocumento = new JLabel("Documento:");
		lblDocumento.setBounds(6, 22, 85, 16);
		panel_3.add(lblDocumento);
		
		textField = new JTextField();
		textField.setText("1234567");
		textField.setBounds(106, 61, 130, 26);
		panel_3.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(106, 17, 130, 26);
		panel_3.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setBounds(279, 66, 104, 16);
		panel_3.add(lblTelefono);
		
		JLabel lblNombres = new JLabel("Nombres:");
		lblNombres.setBounds(279, 22, 104, 16);
		panel_3.add(lblNombres);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(395, 17, 130, 26);
		panel_3.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(395, 61, 130, 26);
		panel_3.add(textField_3);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(62, 0, 438, 39);
		panel_2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Factura ArrayList y Poo");
		lblNewLabel.setBounds(153, 6, 144, 16);
		panel_2.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(6, 478, 558, 114);
		panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panel_1.add(panel);
		panel.setLayout(null);
		
		JLabel lblSubtotal = new JLabel("Subtotal:");
		lblSubtotal.setBounds(6, 6, 77, 16);
		panel.add(lblSubtotal);
		
		JLabel lblDescuento = new JLabel("% Descuento:");
		lblDescuento.setBounds(6, 34, 86, 16);
		panel.add(lblDescuento);
		
		JLabel lblIva = new JLabel("IVA 19%:");
		lblIva.setBounds(6, 62, 86, 16);
		panel.add(lblIva);
		
		JLabel lblTotalFactura = new JLabel("Total Factura:");
		lblTotalFactura.setBounds(6, 90, 86, 16);
		panel.add(lblTotalFactura);
		
		textField_4 = new JTextField();
		textField_4.setBounds(104, 29, 38, 26);
		textField_4.setText("5%");
		textField_4.setColumns(10);
		panel.add(textField_4);
		
		JLabel lblDocumento_3_1 = new JLabel("1253.0");
		lblDocumento_3_1.setBounds(104, 62, 86, 16);
		panel.add(lblDocumento_3_1);
		
		JLabel lblDocumento_3_2 = new JLabel("7524.0");
		lblDocumento_3_2.setBounds(104, 90, 77, 16);
		panel.add(lblDocumento_3_2);
		
		JLabel lblDocumento_3_3 = new JLabel("Valor Desconectado");
		lblDocumento_3_3.setBounds(219, 34, 144, 16);
		panel.add(lblDocumento_3_3);
		
		JLabel lblDocumento_3_4 = new JLabel("330.0");
		lblDocumento_3_4.setBounds(369, 34, 38, 16);
		panel.add(lblDocumento_3_4);
		
		JButton btnNewButton_3 = new JButton("Finalizar Factura");
		btnNewButton_3.setBounds(383, 77, 156, 29);
		panel.add(btnNewButton_3);
		JTable table = new JTable(4, 4);
		
				JScrollPane scrollPane = new JScrollPane(table);
				scrollPane.setBounds(0, 0, 0, 0);
				panel.add(scrollPane);
				
				JLabel lblDocumento_4 = new JLabel("6600.0");
				lblDocumento_4.setBounds(96, 6, 85, 16);
				panel.add(lblDocumento_4);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(6, 197, 558, 88);
		panel_4.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panel_1.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblN = new JLabel("N*Factura:");
		lblN.setBounds(16, 35, 75, 16);
		panel_4.add(lblN);
		
		JLabel lblDocumento_2 = new JLabel("1");
		lblDocumento_2.setBounds(109, 35, 24, 16);
		panel_4.add(lblDocumento_2);
		
		JLabel lblFecha = new JLabel("Fecha:");
		lblFecha.setBounds(221, 35, 88, 16);
		panel_4.add(lblFecha);
		
		JLabel lblDocumento_3 = new JLabel("25/03/2025");
		lblDocumento_3.setBounds(321, 35, 144, 16);
		panel_4.add(lblDocumento_3);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(6, 285, 558, 57);
		panel_5.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panel_1.add(panel_5);
		panel_5.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBounds(6, 6, 59, 51);
		panel_5.add(btnNewButton);
		btnNewButton.setIcon(new ImageIcon(examen.class.getResource("/examen/imagenn.png")));
		
		JLabel lblDireccion_1 = new JLabel("Ver listado de facturas:");
		lblDireccion_1.setBounds(70, 16, 152, 16);
		panel_5.add(lblDireccion_1);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon(examen.class.getResource("/examen/mas-2.png")));
		btnNewButton_1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_1.setBounds(234, 6, 68, 46);
		panel_5.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setIcon(new ImageIcon(examen.class.getResource("/examen/equis-2.png")));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_2.setBounds(390, 6, 59, 46);
		panel_5.add(btnNewButton_2);
		
		JLabel lblAadir = new JLabel("Añadir");
		lblAadir.setBounds(304, 16, 48, 16);
		panel_5.add(lblAadir);
		
		JLabel lblEliminar = new JLabel("Eliminar");
		lblEliminar.setBounds(450, 16, 67, 16);
		panel_5.add(lblEliminar);
		
		JLabel lblDocumento_1 = new JLabel("Documento:");
		lblDocumento_1.setBounds(6, 61, 144, 16);
		panel_1.add(lblDocumento_1);
		
		JLabel lblDatosDelCliente = new JLabel("Datos del cliente");
		lblDatosDelCliente.setBounds(6, 51, 144, 16);
		panel_1.add(lblDatosDelCliente);
		
		JLabel lblDatosDeFactura = new JLabel("Datos de factura");
		lblDatosDeFactura.setBounds(16, 183, 144, 16);
		panel_1.add(lblDatosDeFactura);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(6, 354, 538, 102);
		panel_1.add(panel_6);
		panel_6.setLayout(null);
		
		JLabel lblProductos = new JLabel("Productos:");
		lblProductos.setBounds(6, 6, 85, 16);
		panel_6.add(lblProductos);
		
		JLabel lblAgua = new JLabel("Agua");
		lblAgua.setBounds(6, 34, 85, 16);
		panel_6.add(lblAgua);
		
		JLabel lblCereal = new JLabel("Cereal");
		lblCereal.setBounds(6, 53, 85, 16);
		panel_6.add(lblCereal);
		
		JLabel lblLeche = new JLabel("Leche");
		lblLeche.setBounds(6, 69, 85, 16);
		panel_6.add(lblLeche);
		
		JLabel lblCantidad = new JLabel("Cantidad");
		lblCantidad.setBounds(139, 6, 85, 16);
		panel_6.add(lblCantidad);
		
		JLabel lblDocumento_5 = new JLabel("2");
		lblDocumento_5.setBounds(139, 34, 32, 16);
		panel_6.add(lblDocumento_5);
		
		JLabel lblDocumento_6 = new JLabel("5");
		lblDocumento_6.setBounds(139, 53, 32, 16);
		panel_6.add(lblDocumento_6);
		
		JLabel lblDocumento_7 = new JLabel("2");
		lblDocumento_7.setBounds(139, 69, 32, 16);
		panel_6.add(lblDocumento_7);
		
		JLabel lblValor = new JLabel("Valor");
		lblValor.setBounds(261, 6, 85, 16);
		panel_6.add(lblValor);
		
		JLabel lblSubTotal = new JLabel("Sub Total");
		lblSubTotal.setBounds(396, 6, 85, 16);
		panel_6.add(lblSubTotal);
		
		JLabel lblDocumento_10 = new JLabel("500");
		lblDocumento_10.setBounds(261, 34, 85, 16);
		panel_6.add(lblDocumento_10);
		
		JLabel lblDocumento_11 = new JLabel("1000");
		lblDocumento_11.setBounds(261, 53, 85, 16);
		panel_6.add(lblDocumento_11);
		
		JLabel lblDocumento_12 = new JLabel("300");
		lblDocumento_12.setBounds(261, 69, 85, 16);
		panel_6.add(lblDocumento_12);
		
		JLabel lblDocumento_13 = new JLabel("1000.0");
		lblDocumento_13.setBounds(396, 34, 85, 16);
		panel_6.add(lblDocumento_13);
		
		JLabel lblDocumento_14 = new JLabel("5000.0");
		lblDocumento_14.setBounds(396, 53, 85, 16);
		panel_6.add(lblDocumento_14);
		
		JLabel lblDocumento_15 = new JLabel("600.0");
		lblDocumento_15.setBounds(396, 69, 85, 16);
		panel_6.add(lblDocumento_15);
		
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Columna 1");
		model.addColumn("Columna 2");
		model.addColumn("Columna 3");
		model.addColumn("Columna 4");
	}
}
