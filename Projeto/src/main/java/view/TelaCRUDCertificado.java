package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.SwingConstants;

import model.Inscricao;
import model.Certificado;

import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

import control.InscricaoControle;
import control.CertificadoControle;

import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCRUDCertificado extends JInternalFrame {
	private JTextField textMiniCurriculo;
	private Certificado objeto; 
	private CertificadoControle controle = new CertificadoControle ();
	private JTextField textLinklattes;
	private JTextField textIDCertificado;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCRUDCertificado frame = new TelaCRUDCertificado();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void limparTela() {
		    objeto = null;
	        textMiniCurriculo.setText("");
	        textIDCertificado.setText("");
	        textLinklattes.setText("");
	}
	/**
	 * Create the frame.
	 */
	public TelaCRUDCertificado() {
		setBounds(100, 100, 617, 300);
		
		JPanel PainelCampos = new JPanel();
		getContentPane().add(PainelCampos, BorderLayout.NORTH);
		
		JLabel lblMiniCurriculo = new JLabel("Data da Emissão: ");
		
		textMiniCurriculo = new JTextField();
		textMiniCurriculo.setColumns(10);
		
		JButton btninserir = new JButton("Inserir");
		btninserir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				objeto = new Certificado(null, textLinklattes.getText(), textMiniCurriculo.getText());
				controle.inserir(objeto);
				JOptionPane.showMessageDialog(null, "Certificado cadastrado com sucesso");
				   limparTela ();
			}
		});
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (objeto!=null) {
					objeto.settexto(textLinklattes.getText());
					objeto.setdtEmissao(textMiniCurriculo.getText());
					controle.alterar(objeto);
					JOptionPane.showMessageDialog(null, "Certificado alterado com sucesso.");
				}else {
					JOptionPane.showMessageDialog(null, "Não há Certificado a ser modificado.");
					limparTela();
				}
	
			}
		});
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (objeto!=null) {
					controle.excluir(objeto);
			     
					JOptionPane.showMessageDialog(null, "Profisional excluído com sucesso.");
			}else {
					JOptionPane.showMessageDialog(null, "Não há Certificado a ser excluído.");
				}
				   limparTela ();
		
			}
		});
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Integer valor = Integer.parseInt(textIDCertificado.getText());
	            objeto =  controle.buscarPorId(valor);
	            if (objeto!=null) {					
	            	textIDCertificado.setText(String.valueOf(objeto.getCodCertificado()));
	            	textMiniCurriculo.setText(objeto.gettexto());
	            	textLinklattes.setText(objeto.getdtEmissao());
	            	}else {
	            		JOptionPane.showMessageDialog(null, "Não existe Certificado com esse código");
	            		textIDCertificado.setText("");
	            	}
	            limparTela ();
			}
		});
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				dispose ();
			}
		});
		btnFechar.setForeground(Color.RED);
		
		JLabel lblTitulo = new JLabel("Certificado");
		lblTitulo.setFont(new Font("Consolas", Font.BOLD, 16));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblLinklates = new JLabel("Texto: ");
		
		textLinklattes = new JTextField();
		textLinklattes.setColumns(10);
		
		JLabel lblIdCertificado = new JLabel("ID");
		
		textIDCertificado = new JTextField();
		textIDCertificado.setColumns(10);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limparTela();
			}
		});
		btnLimpar.setForeground(Color.RED);
		GroupLayout gl_PainelCampos = new GroupLayout(PainelCampos);
		gl_PainelCampos.setHorizontalGroup(
			gl_PainelCampos.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_PainelCampos.createSequentialGroup()
					.addGroup(gl_PainelCampos.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_PainelCampos.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_PainelCampos.createParallelGroup(Alignment.TRAILING, false)
								.addGroup(gl_PainelCampos.createSequentialGroup()
									.addComponent(btnLimpar, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(btnFechar, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_PainelCampos.createSequentialGroup()
									.addGroup(gl_PainelCampos.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_PainelCampos.createSequentialGroup()
											.addComponent(lblMiniCurriculo, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(textMiniCurriculo, GroupLayout.PREFERRED_SIZE, 299, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_PainelCampos.createSequentialGroup()
											.addComponent(lblLinklates, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
											.addGap(18)
											.addComponent(textLinklattes, GroupLayout.PREFERRED_SIZE, 299, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_PainelCampos.createSequentialGroup()
											.addComponent(lblIdCertificado, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(textIDCertificado, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_PainelCampos.createParallelGroup(Alignment.LEADING, false)
										.addComponent(btninserir, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(btnExcluir, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(btnConsultar, GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
										.addComponent(btnAlterar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
						.addComponent(lblTitulo, GroupLayout.PREFERRED_SIZE, 607, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_PainelCampos.setVerticalGroup(
			gl_PainelCampos.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_PainelCampos.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblTitulo)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_PainelCampos.createParallelGroup(Alignment.TRAILING)
						.addComponent(btninserir)
						.addGroup(gl_PainelCampos.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblIdCertificado)
							.addComponent(textIDCertificado, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(18)
					.addGroup(gl_PainelCampos.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_PainelCampos.createParallelGroup(Alignment.BASELINE)
							.addComponent(textMiniCurriculo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnAlterar))
						.addGroup(gl_PainelCampos.createSequentialGroup()
							.addGap(3)
							.addComponent(lblMiniCurriculo)))
					.addGap(18)
					.addGroup(gl_PainelCampos.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnExcluir)
						.addGroup(gl_PainelCampos.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_PainelCampos.createSequentialGroup()
								.addGap(3)
								.addComponent(lblLinklates))
							.addComponent(textLinklattes, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(18)
					.addComponent(btnConsultar)
					.addGap(18)
					.addGroup(gl_PainelCampos.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnFechar)
						.addComponent(btnLimpar)))
		);
		PainelCampos.setLayout(gl_PainelCampos);

	}
}
