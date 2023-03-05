package clinicaoftal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JanelaBuscarConsulta extends JFrame {

	private JPanel contentPane;
	private JTextField txtData;
	private JTextField txtHorario;
	private JTable tbConsulta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaBuscarConsulta frame = new JanelaBuscarConsulta();
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
	public JanelaBuscarConsulta() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JPanel pnlTitulo = new JPanel();
		pnlTitulo.setBounds(15, 5, 454, 29);
		
		JLabel lblData = new JLabel("Data:");
		lblData.setBounds(15, 55, 27, 14);
		
		txtData = new JTextField();
		txtData.setBounds(46, 52, 72, 20);
		txtData.setColumns(10);
		
		JLabel lblHorario = new JLabel("Horário:");
		lblHorario.setBounds(15, 81, 39, 14);
		
		txtHorario = new JTextField();
		txtHorario.setBounds(56, 83, 40, 20);
		txtHorario.setColumns(10);
		
		JLabel lblBuscarConsulta = new JLabel("Buscar Consulta");
		lblBuscarConsulta.setFont(new Font("Verdana", Font.BOLD, 12));
		pnlTitulo.add(lblBuscarConsulta);
		contentPane.setLayout(null);
		contentPane.add(lblData);
		contentPane.add(txtData);
		contentPane.add(lblHorario);
		contentPane.add(txtHorario);
		contentPane.add(pnlTitulo);
		
		JPanel pnlBotoes = new JPanel();
		pnlBotoes.setBounds(10, 222, 464, 28);
		contentPane.add(pnlBotoes);
		
		JButton btnSalvar = new JButton("Buscar ");
		pnlBotoes.add(btnSalvar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		pnlBotoes.add(btnCancelar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(15, 117, 459, 94);
		contentPane.add(scrollPane);
		
		tbConsulta = new JTable();
		tbConsulta.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
			},
			new String[] {
				"New column", "New column"
			}
		));
		scrollPane.setViewportView(tbConsulta);
	}
}
