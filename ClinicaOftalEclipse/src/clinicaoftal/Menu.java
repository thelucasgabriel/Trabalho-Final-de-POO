package clinicaoftal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		setTitle("Menu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnOperadora = new JMenu("Operadora");
		menuBar.add(mnOperadora);
		
		JMenuItem mntmCadastrarOp = new JMenuItem("Cadastrar");
		mntmCadastrarOp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                JanelaCadastraOperadora janela = new JanelaCadastraOperadora();
                janela.setVisible(true);
				
			}
		});
		mnOperadora.add(mntmCadastrarOp);
		
		JMenuItem mntmBuscarOp = new JMenuItem("Buscar");
		mntmBuscarOp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                JanelaBuscarOperadora janela = new JanelaBuscarOperadora();
                janela.setVisible(true);
			}
		});
		
		JSeparator separator = new JSeparator();
		mnOperadora.add(separator);
		mnOperadora.add(mntmBuscarOp);
		
		JMenuItem mntmExcluirOp = new JMenuItem("Excluir");
		mntmExcluirOp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                JanelaExcluirOperadora janela = new JanelaExcluirOperadora();
                janela.setVisible(true);
                //dispose();
			}
		});
		
		JSeparator separator_1 = new JSeparator();
		mnOperadora.add(separator_1);
		mnOperadora.add(mntmExcluirOp);
		
		JMenu mnPaciente = new JMenu("Paciente");
		menuBar.add(mnPaciente);
		
		JMenu mnCadastrar = new JMenu("Cadastrar");
		mnPaciente.add(mnCadastrar);
		
		JMenuItem mntmComPlano = new JMenuItem("Com Plano");
		mntmComPlano.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JanelaCadastraPacienteComPlano janela = new JanelaCadastraPacienteComPlano();
                janela.setVisible(true);
			}
		});
		mnCadastrar.add(mntmComPlano);
		
		JMenuItem mntmSemPlano = new JMenuItem("Sem Plano");
		mntmSemPlano.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JanelaCadastraPacienteComPlano janela = new JanelaCadastraPacienteComPlano();
                janela.setVisible(true);
			}
		});
		mnCadastrar.add(mntmSemPlano);
		
		JMenuItem mntmBuscarPac = new JMenuItem("Buscar");
		mntmBuscarPac.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JanelaBuscarFuncionario janela = new JanelaBuscarFuncionario();
                janela.setVisible(true);
			}
		});
		
		JSeparator separator_4 = new JSeparator();
		mnPaciente.add(separator_4);
		mnPaciente.add(mntmBuscarPac);
		
		JMenuItem mntmExcluirPac = new JMenuItem("Excluir");
		mntmExcluirPac.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JanelaExcluirPaciente janela = new JanelaExcluirPaciente();
                janela.setVisible(true);
			}
		});
		
		JSeparator separator_6 = new JSeparator();
		mnPaciente.add(separator_6);
		mnPaciente.add(mntmExcluirPac);
		
		JMenu mnFuncionario = new JMenu("Funcionário");
		menuBar.add(mnFuncionario);
		
		JMenu mntmCadastrar = new JMenu("Cadastrar");
		mnFuncionario.add(mntmCadastrar);
		
		JMenuItem mntmMedico = new JMenuItem("Médico");
		mntmMedico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                JanelaCadastraMedico janela = new JanelaCadastraMedico();
                janela.setVisible(true);
			}
		});
		mntmCadastrar.add(mntmMedico);
		
		JMenuItem mntmDemais = new JMenuItem("Demais");
		mntmDemais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JanelaCadastraDemais janela = new JanelaCadastraDemais();
                janela.setVisible(true);
			}
		});
		
		JSeparator separator_5 = new JSeparator();
		mntmCadastrar.add(separator_5);
		mntmCadastrar.add(mntmDemais);
		
		JSeparator separator_2 = new JSeparator();
		mnFuncionario.add(separator_2);
		
		JMenuItem mntmBuscar = new JMenuItem("Buscar");
		mntmBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JanelaBuscarFuncionario janela = new JanelaBuscarFuncionario();
                janela.setVisible(true);
			}
		});
		mnFuncionario.add(mntmBuscar);
		
		JSeparator separator_3 = new JSeparator();
		mnFuncionario.add(separator_3);
		
		JMenuItem mntmExcluir = new JMenuItem("Excluir");
		mntmExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JanelaExcluirFuncionario janela = new JanelaExcluirFuncionario();
                janela.setVisible(true);
			}
		});
		mnFuncionario.add(mntmExcluir);
		
		JMenu mnConsulta = new JMenu("Consulta");
		menuBar.add(mnConsulta);
		
		JMenuItem mntmCadastrarConsulta = new JMenuItem("Cadastrar");
		mntmCadastrarConsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JanelaCadastrarConsulta janela = new JanelaCadastrarConsulta();
                janela.setVisible(true);
			}
		});
		mnConsulta.add(mntmCadastrarConsulta);
		
		JMenuItem mntmBuscarConsulta = new JMenuItem("Buscar");
		mntmBuscarConsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JanelaBuscarConsulta janela = new JanelaBuscarConsulta();
                janela.setVisible(true);
			}
		});
		
		JSeparator separator_7 = new JSeparator();
		mnConsulta.add(separator_7);
		mnConsulta.add(mntmBuscarConsulta);
		
		JMenuItem mntmExcluirConsulta = new JMenuItem("Excluir");
		mntmExcluirConsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JanelaExcluirConsulta janela = new JanelaExcluirConsulta();
                janela.setVisible(true);
			}
		});
		
		JSeparator separator_8 = new JSeparator();
		mnConsulta.add(separator_8);
		mnConsulta.add(mntmExcluirConsulta);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 404, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(180, Short.MAX_VALUE)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				int result = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "Confirmação", JOptionPane.YES_NO_OPTION);
                if (result == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
			}
		});
		panel.add(btnSair);
		contentPane.setLayout(gl_contentPane);
	}
}
