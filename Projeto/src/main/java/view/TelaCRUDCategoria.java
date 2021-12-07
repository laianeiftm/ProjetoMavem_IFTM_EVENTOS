package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;

import control.CategoriaControle;
import model.Categoria;
import model.Inscricao;

import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCRUDCategoria extends JInternalFrame {
	private Categoria objeto;
	private CategoriaControle controle = new CategoriaControle();

	private JTextField textField_2;
	private JTextField textTipo;
	private JTextField textID;

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

	public void limparTela() {
		objeto = null;
		textID.setText("");
		textTipo.setText("");
	}

	/**
	 * Create the frame.
	 */
	public TelaCRUDCategoria() {
		setBounds(100, 100, 625, 300);

		JPanel PainelCampos = new JPanel();
		getContentPane().add(PainelCampos, BorderLayout.WEST);

		JPanel lbltipos = new JPanel();
		PainelCampos.add(lbltipos);

		JButton btnFechar_1 = new JButton("Fechar");
		btnFechar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				dispose();
			}
		});
		btnFechar_1.setForeground(Color.RED);

		JLabel lblCodInscricao = new JLabel("Tipo: ");

		textTipo = new JTextField();
		textTipo.setColumns(10);

		JButton btninserir_1 = new JButton("Inserir");
		btninserir_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				objeto = new Categoria(null, textTipo.getText());
				controle.inserir(objeto);
				JOptionPane.showMessageDialog(null, "Categoria cadastrada com sucesso");

			}
		});

		JButton btnExcluir_1 = new JButton("Excluir");
		btnExcluir_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (objeto != null) {
					controle.excluir(objeto);

					JOptionPane.showMessageDialog(null, "Categoria excluída com sucesso.");
				} else {
					JOptionPane.showMessageDialog(null, "Não há Categoria  a ser excluída.");
				}
				limparTela();

			}
		});

		JButton btnConsultar_1 = new JButton("Consultar");
		btnConsultar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Integer valor = Integer.parseInt(textID.getText());
				objeto = controle.buscarPorId(valor);
				if (objeto != null) {
					textID.setText(String.valueOf(objeto.getCodCategoria()));
					textTipo.setText(objeto.getTipo());
				} else {
					JOptionPane.showMessageDialog(null, "Não existe Categoria com esse código");
					textID.setText("");

				}
			}
		});

		JButton btnAlterar_1 = new JButton("Alterar");
		btnAlterar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (objeto != null) {
					objeto.setTipo(textTipo.getText());
					controle.alterar(objeto);
					JOptionPane.showMessageDialog(null, "Categoria alterada com sucesso.");
				} else {
					JOptionPane.showMessageDialog(null, "Não há Categoriaa a ser modificada.");
					limparTela();
				}

			}
		});

		JLabel lblTitulo_1 = new JLabel("Categoria");
		lblTitulo_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo_1.setFont(new Font("Consolas", Font.BOLD, 16));

		JLabel lblIdcategoria = new JLabel("ID");

		textID = new JTextField();
		textID.setColumns(10);
		GroupLayout gl_lbltipos = new GroupLayout(lbltipos);
		gl_lbltipos.setHorizontalGroup(gl_lbltipos.createParallelGroup(Alignment.LEADING).addGroup(gl_lbltipos
				.createSequentialGroup().addContainerGap()
				.addGroup(gl_lbltipos.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnFechar_1, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_lbltipos.createSequentialGroup()
								.addGroup(gl_lbltipos.createParallelGroup(Alignment.LEADING)
										.addComponent(lblCodInscricao, GroupLayout.PREFERRED_SIZE, 79,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(lblIdcategoria, GroupLayout.PREFERRED_SIZE, 79,
												GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(gl_lbltipos.createParallelGroup(Alignment.LEADING)
										.addComponent(textTipo, GroupLayout.PREFERRED_SIZE, 299,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(textID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
								.addGroup(gl_lbltipos.createParallelGroup(Alignment.LEADING, false)
										.addComponent(btninserir_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(btnExcluir_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(btnConsultar_1, GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
										.addComponent(btnAlterar_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE))))
				.addGap(62))
				.addGroup(gl_lbltipos.createSequentialGroup()
						.addComponent(lblTitulo_1, GroupLayout.PREFERRED_SIZE, 600, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(63, Short.MAX_VALUE)));
		gl_lbltipos.setVerticalGroup(gl_lbltipos.createParallelGroup(Alignment.LEADING).addGroup(gl_lbltipos
				.createSequentialGroup().addContainerGap()
				.addComponent(lblTitulo_1, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
				.addGroup(gl_lbltipos
						.createParallelGroup(
								Alignment.LEADING)
						.addGroup(gl_lbltipos.createSequentialGroup().addGap(5)
								.addGroup(gl_lbltipos.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblCodInscricao).addComponent(btninserir_1))
								.addGap(18)
								.addGroup(gl_lbltipos.createParallelGroup(Alignment.BASELINE).addComponent(btnAlterar_1)
										.addComponent(lblIdcategoria).addComponent(textID, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGap(18).addComponent(btnExcluir_1).addGap(18).addComponent(btnConsultar_1)
								.addGap(18).addComponent(btnFechar_1))
						.addGroup(gl_lbltipos.createSequentialGroup().addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(textTipo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)))
				.addContainerGap(49, Short.MAX_VALUE)));
		lbltipos.setLayout(gl_lbltipos);

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
