package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.LayoutStyle.ComponentPlacement;

public class TelaCRUDCategoria extends JInternalFrame {
	private JTextField textField_2;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCRUDCategoria frame = new TelaCRUDCategoria();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaCRUDCategoria() {
		setBounds(100, 100, 625, 300);
		
		JPanel PainelCampos = new JPanel();
		getContentPane().add(PainelCampos, BorderLayout.WEST);
		
		JPanel PainelCampos_1 = new JPanel();
		PainelCampos.add(PainelCampos_1);
		
		JButton btnFechar_1 = new JButton("Fechar");
		btnFechar_1.setForeground(Color.RED);
		
		JLabel lblCodInscricao = new JLabel("Cod Inscri\u00E7\u00E3o: ");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblDataInscricao = new JLabel("Data Inscri\u00E7\u00E3o:");
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JLabel lblValorPago = new JLabel("Valor Pago:");
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		JButton btninserir_1 = new JButton("Inserir");
		
		JButton btnExcluir_1 = new JButton("Excluir");
		
		JButton btnConsultar_1 = new JButton("Consultar");
		
		JButton btnAlterar_1 = new JButton("Alterar");
		
		JLabel lblTitulo_1 = new JLabel("Inscri\u00E7\u00E3o");
		lblTitulo_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo_1.setFont(new Font("Consolas", Font.BOLD, 16));
		GroupLayout gl_PainelCampos_1 = new GroupLayout(PainelCampos_1);
		gl_PainelCampos_1.setHorizontalGroup(
			gl_PainelCampos_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 620, Short.MAX_VALUE)
				.addGroup(gl_PainelCampos_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_PainelCampos_1.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnFechar_1, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_PainelCampos_1.createSequentialGroup()
							.addGroup(gl_PainelCampos_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_PainelCampos_1.createSequentialGroup()
									.addComponent(lblCodInscricao, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(textField, GroupLayout.PREFERRED_SIZE, 299, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_PainelCampos_1.createSequentialGroup()
									.addComponent(lblDataInscricao, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 299, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_PainelCampos_1.createSequentialGroup()
									.addComponent(lblValorPago, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 299, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
							.addGroup(gl_PainelCampos_1.createParallelGroup(Alignment.LEADING, false)
								.addComponent(btninserir_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnExcluir_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnConsultar_1, GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
								.addComponent(btnAlterar_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
					.addGap(62))
				.addGroup(gl_PainelCampos_1.createSequentialGroup()
					.addComponent(lblTitulo_1, GroupLayout.PREFERRED_SIZE, 600, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(20, Short.MAX_VALUE))
		);
		gl_PainelCampos_1.setVerticalGroup(
			gl_PainelCampos_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 271, Short.MAX_VALUE)
				.addGroup(gl_PainelCampos_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblTitulo_1, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
					.addGap(5)
					.addGroup(gl_PainelCampos_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCodInscricao)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btninserir_1))
					.addGap(18)
					.addGroup(gl_PainelCampos_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_PainelCampos_1.createSequentialGroup()
							.addGroup(gl_PainelCampos_1.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnAlterar_1))
							.addGap(18)
							.addComponent(btnExcluir_1)
							.addGap(18)
							.addComponent(btnConsultar_1)
							.addGap(18)
							.addComponent(btnFechar_1))
						.addGroup(gl_PainelCampos_1.createSequentialGroup()
							.addGap(3)
							.addComponent(lblDataInscricao)
							.addGap(18)
							.addGroup(gl_PainelCampos_1.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblValorPago)
								.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(49, Short.MAX_VALUE))
		);
		PainelCampos_1.setLayout(gl_PainelCampos_1);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.setForeground(Color.RED);
		
		JLabel lblTipo = new JLabel("Tipo:");
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		JButton btninserir = new JButton("Inserir");
		
		JButton btnExcluir = new JButton("Excluir");
		
		JButton btnConsultar = new JButton("Consultar");
		
		JButton btnAlterar = new JButton("Alterar");
		
		JLabel lblTitulo = new JLabel("Categoria");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Consolas", Font.BOLD, 16));
		

	}

}
