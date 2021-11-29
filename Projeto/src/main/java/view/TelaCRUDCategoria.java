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
		GroupLayout gl_PainelCampos = new GroupLayout(PainelCampos);
		gl_PainelCampos.setHorizontalGroup(
			gl_PainelCampos.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_PainelCampos.createSequentialGroup()
					.addGroup(gl_PainelCampos.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_PainelCampos.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_PainelCampos.createParallelGroup(Alignment.TRAILING)
								.addComponent(btnFechar, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_PainelCampos.createSequentialGroup()
									.addComponent(lblTipo, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 299, GroupLayout.PREFERRED_SIZE)
									.addGap(2147483256)
									.addGroup(gl_PainelCampos.createParallelGroup(Alignment.LEADING, false)
										.addComponent(btninserir, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(btnExcluir, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(btnConsultar, GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
										.addComponent(btnAlterar)))))
						.addComponent(lblTitulo, GroupLayout.PREFERRED_SIZE, 600, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(62, Short.MAX_VALUE))
		);
		gl_PainelCampos.setVerticalGroup(
			gl_PainelCampos.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_PainelCampos.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblTitulo, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
					.addGap(5)
					.addGroup(gl_PainelCampos.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_PainelCampos.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblTipo)
							.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_PainelCampos.createSequentialGroup()
							.addComponent(btninserir)
							.addGap(18)
							.addComponent(btnAlterar)
							.addGap(18)
							.addComponent(btnExcluir)
							.addGap(18)
							.addComponent(btnConsultar)
							.addGap(18)
							.addComponent(btnFechar)))
					.addContainerGap(49, Short.MAX_VALUE))
		);
		PainelCampos.setLayout(gl_PainelCampos);

	}

}
