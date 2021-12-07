package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;

import control.InscricaoControle;
import model.Inscricao;
import model.Profissional;

public class TelaCRUDInscricao extends JInternalFrame {
	private JTextField textCodInscricao;
	private JTextField textDataInscricao;
	private JTextField textValorPago;
	private Inscricao objeto; 
	private InscricaoControle controle = new InscricaoControle ();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCRUDInscricao frame = new TelaCRUDInscricao();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
public void limparTela () {
	  objeto = null;
	  textCodInscricao.setText("");
	  textDataInscricao.setText("");
	  textValorPago.setText("");
}
	/**
	 * Create the frame.
	 */
	public TelaCRUDInscricao() {
		setBounds(100, 100, 610, 300);
		
		JPanel PainelCampos = new JPanel();
		getContentPane().add(PainelCampos, BorderLayout.WEST);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				dispose ();
			}
		});
		btnFechar.setForeground(Color.RED);
		
		JLabel lblCodInscricao = new JLabel("Cod Inscri\u00E7\u00E3o: ");
		
		textCodInscricao = new JTextField();
		textCodInscricao.setColumns(10);
		
		JLabel lblDataInscricao = new JLabel("Data Inscri\u00E7\u00E3o:");
		
		textDataInscricao = new JTextField();
		textDataInscricao.setColumns(10);
		
		JButton btninserir = new JButton("Inserir");
		btninserir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				objeto = new Inscricao(null, textDataInscricao.getText(),textValorPago.getText());
				controle.inserir(objeto);
				JOptionPane.showMessageDialog(null, "Inscrição cadastrada com sucesso");
			
			}
		});
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (objeto!=null) {
					controle.excluir(objeto);
			     
					JOptionPane.showMessageDialog(null, "Inscrição excluída com sucesso.");
			}else {
					JOptionPane.showMessageDialog(null, "Não há Inscrição a ser excluída.");
				}
				   limparTela ();
		
				}
		});
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Integer valor = Integer.parseInt(textCodInscricao.getText());
	            objeto =  controle.buscarPorId(valor);
	            if (objeto!=null) {					
	            textCodInscricao.setText(String.valueOf(objeto.getCodInscricao()));
	            	textDataInscricao.setText(objeto.getDtIncricao());
	            	textValorPago.setText(objeto.getValorPago());
	            	}else {
	            		JOptionPane.showMessageDialog(null, "Não existe Inscrição com esse código");
	            		textCodInscricao.setText("");
	            	
			}}
		});
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
								if (objeto!=null) {
						objeto.setDtIncricao(textDataInscricao.getText());
						objeto.setValorPago(textValorPago.getText());
						controle.alterar(objeto);
						JOptionPane.showMessageDialog(null, "Inscrição alterada com sucesso.");
					}else {
						JOptionPane.showMessageDialog(null, "Não há Inscrição a ser modificada.");
						limparTela();
					}
		
				}
			});
		
		JLabel lblTitulo = new JLabel("Inscri\u00E7\u00E3o");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Consolas", Font.BOLD, 16));
		
		JLabel lblValorPago = new JLabel("Valor Pago:");
		
		textValorPago = new JTextField();
		textValorPago.setColumns(10);
		GroupLayout gl_PainelCampos = new GroupLayout(PainelCampos);
		gl_PainelCampos.setHorizontalGroup(
			gl_PainelCampos.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_PainelCampos.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_PainelCampos.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnFechar, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_PainelCampos.createSequentialGroup()
							.addGroup(gl_PainelCampos.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_PainelCampos.createSequentialGroup()
									.addComponent(lblCodInscricao, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(textCodInscricao, GroupLayout.PREFERRED_SIZE, 299, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_PainelCampos.createSequentialGroup()
									.addComponent(lblDataInscricao, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textDataInscricao, GroupLayout.PREFERRED_SIZE, 299, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_PainelCampos.createSequentialGroup()
									.addComponent(lblValorPago, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textValorPago, GroupLayout.PREFERRED_SIZE, 299, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
							.addGroup(gl_PainelCampos.createParallelGroup(Alignment.LEADING, false)
								.addComponent(btninserir, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnExcluir, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnConsultar, GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
								.addComponent(btnAlterar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
					.addGap(62))
				.addGroup(gl_PainelCampos.createSequentialGroup()
					.addComponent(lblTitulo, GroupLayout.PREFERRED_SIZE, 600, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(20, Short.MAX_VALUE))
		);
		gl_PainelCampos.setVerticalGroup(
			gl_PainelCampos.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_PainelCampos.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblTitulo, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
					.addGap(5)
					.addGroup(gl_PainelCampos.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCodInscricao)
						.addComponent(textCodInscricao, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btninserir))
					.addGap(18)
					.addGroup(gl_PainelCampos.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_PainelCampos.createSequentialGroup()
							.addGroup(gl_PainelCampos.createParallelGroup(Alignment.BASELINE)
								.addComponent(textDataInscricao, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnAlterar))
							.addGap(18)
							.addComponent(btnExcluir)
							.addGap(18)
							.addComponent(btnConsultar)
							.addGap(18)
							.addComponent(btnFechar))
						.addGroup(gl_PainelCampos.createSequentialGroup()
							.addGap(3)
							.addComponent(lblDataInscricao)
							.addGap(18)
							.addGroup(gl_PainelCampos.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblValorPago)
								.addComponent(textValorPago, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(60, Short.MAX_VALUE))
		);
		PainelCampos.setLayout(gl_PainelCampos);

	}

}
