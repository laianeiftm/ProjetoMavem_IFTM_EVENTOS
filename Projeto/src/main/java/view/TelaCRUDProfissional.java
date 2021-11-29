package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCRUDProfissional extends JInternalFrame {
	private JTextField textLinklattes;
	private JTextField textMiniCurriculo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCRUDProfissional frame = new TelaCRUDProfissional();
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
	public TelaCRUDProfissional() {
		setBounds(100, 100, 617, 300);
		
		JPanel PainelCampos = new JPanel();
		getContentPane().add(PainelCampos, BorderLayout.CENTER);
		
		JLabel lblLinklates = new JLabel("Link Lattes: ");
		
		textLinklattes = new JTextField();
		textLinklattes.setColumns(10);
		
		JLabel lblMiniCurriculo = new JLabel("Mini Curriculo: ");
		
		textMiniCurriculo = new JTextField();
		textMiniCurriculo.setColumns(10);
		
		JButton btninserir = new JButton("Inserir");
		
		JButton btnAlterar = new JButton("Alterar");
		
		JButton btnExcluir = new JButton("Excluir");
		
		JButton btnConsultar = new JButton("Consultar");
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose ();
			}
		});
		btnFechar.setForeground(Color.RED);
		
		JLabel lblTitulo = new JLabel("Profissional");
		lblTitulo.setFont(new Font("Consolas", Font.BOLD, 16));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_PainelCampos = new GroupLayout(PainelCampos);
		gl_PainelCampos.setHorizontalGroup(
			gl_PainelCampos.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_PainelCampos.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_PainelCampos.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnFechar, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_PainelCampos.createSequentialGroup()
							.addGroup(gl_PainelCampos.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_PainelCampos.createSequentialGroup()
									.addComponent(lblLinklates, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(textLinklattes, GroupLayout.PREFERRED_SIZE, 299, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_PainelCampos.createSequentialGroup()
									.addComponent(lblMiniCurriculo, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textMiniCurriculo, GroupLayout.PREFERRED_SIZE, 299, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
							.addGroup(gl_PainelCampos.createParallelGroup(Alignment.LEADING, false)
								.addComponent(btninserir, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnExcluir, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnConsultar, GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
								.addComponent(btnAlterar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
					.addGap(62))
				.addGroup(Alignment.LEADING, gl_PainelCampos.createSequentialGroup()
					.addComponent(lblTitulo, GroupLayout.PREFERRED_SIZE, 607, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(20, Short.MAX_VALUE))
		);
		gl_PainelCampos.setVerticalGroup(
			gl_PainelCampos.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_PainelCampos.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblTitulo)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_PainelCampos.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblLinklates)
						.addComponent(textLinklattes, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btninserir))
					.addGap(18)
					.addGroup(gl_PainelCampos.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_PainelCampos.createSequentialGroup()
							.addGroup(gl_PainelCampos.createParallelGroup(Alignment.BASELINE)
								.addComponent(textMiniCurriculo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnAlterar))
							.addGap(18)
							.addComponent(btnExcluir)
							.addGap(18)
							.addComponent(btnConsultar)
							.addGap(18)
							.addComponent(btnFechar))
						.addGroup(gl_PainelCampos.createSequentialGroup()
							.addGap(3)
							.addComponent(lblMiniCurriculo)))
					.addContainerGap(48, Short.MAX_VALUE))
		);
		PainelCampos.setLayout(gl_PainelCampos);

	}
}
