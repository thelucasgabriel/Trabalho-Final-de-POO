package clinicaoftal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class JanelaCadastrarConsulta extends JFrame {

	private JPanel contentPane;
	private JTextField txtDataConsulta;
	private JTextField txtHorario;
	private JTextField txtValor;
	private JTextField txtNome;
	private JTextField txtDataExame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaCadastrarConsulta frame = new JanelaCadastrarConsulta();
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
	public JanelaCadastrarConsulta() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 817, 792);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JPanel pnlTitulo = new JPanel();
		pnlTitulo.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		JLabel lblTitulo = new JLabel("CADASTRO DA CONSULTA");
		lblTitulo.setFont(new Font("Verdana", Font.BOLD, 14));
		pnlTitulo.add(lblTitulo);
		
	JLabel lblMedico = new JLabel("Médico:");
		JComboBox cmbMedico = new JComboBox();
		
		DadosFuncionario medicos = new DadosFuncionario();
		for (Funcionario f : medicos.getVetFun()) {
			 if(f instanceof Medico){
				 cmbMedico.addItem((Medico)f);
			 }
		}
		
		
		JLabel lblDemais = new JLabel("Funcionário:");
		JComboBox cmbDemais = new JComboBox();
		
		DadosFuncionario funcionarios = new DadosFuncionario();
		for (Funcionario f : funcionarios.getVetFun()) {
			 if(f instanceof Demais){
				 cmbDemais.addItem((Demais)f);
			 }
	}
		
		JLabel lblPaciente = new JLabel("Paciente:");
		JComboBox cmbPaciente = new JComboBox();
		
		DadosPaciente pacientes = new DadosPaciente();
		for (Paciente p : pacientes.getVetPac()) {
			cmbPaciente.addItem(p);
		}
		
		
		JLabel lblDataConsulta = new JLabel("Data:");
		
		txtDataConsulta = new JTextField();
		txtDataConsulta.setColumns(10);
		
		JLabel lblHorario = new JLabel("Horário:");
		
		txtHorario = new JTextField();
		txtHorario.setColumns(10);
		
		JLabel lblMedicamentos = new JLabel("Medicamentos:");
		
		JTextArea jtaMedicamentos = new JTextArea();
		
		JLabel lblSintomas = new JLabel("Sintomas:");
		
		JTextArea jtaSintomas = new JTextArea();
		
		JLabel lblReceita = new JLabel("Receita:");
		
		JTextArea jtaReceita = new JTextArea();
		
		JLabel lblValor = new JLabel("Valor:");
		
		txtValor = new JTextField();
		txtValor.setColumns(10);
		
		JLabel lblExame = new JLabel("EXAME");
		
		JLabel lblNome = new JLabel("Nome:");
		
		txtNome = new JTextField();
		txtNome.setColumns(10);
		
		JLabel lblDataExame = new JLabel("Data:");
		
		txtDataExame = new JTextField();
		txtDataExame.setColumns(10);
		
		JPanel pnlBotoes = new JPanel();
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(pnlBotoes, GroupLayout.DEFAULT_SIZE, 781, Short.MAX_VALUE)
						.addComponent(pnlTitulo, GroupLayout.PREFERRED_SIZE, 781, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblDemais)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(cmbDemais, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblPaciente)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(cmbPaciente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblMedico)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(cmbMedico, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblDataConsulta)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtDataConsulta, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblHorario)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtHorario, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(lblReceita)
								.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jtaReceita, GroupLayout.PREFERRED_SIZE, 233, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(lblSintomas)
								.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jtaSintomas, GroupLayout.PREFERRED_SIZE, 233, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(lblMedicamentos)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(jtaMedicamentos, GroupLayout.PREFERRED_SIZE, 234, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblValor)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtValor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblExame)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNome)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtNome, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblDataExame)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtDataExame, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(pnlTitulo, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblMedico)
						.addComponent(cmbMedico, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPaciente)
						.addComponent(cmbPaciente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDemais)
						.addComponent(cmbDemais, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDataConsulta)
						.addComponent(txtDataConsulta, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblHorario)
						.addComponent(txtHorario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblMedicamentos)
						.addComponent(jtaMedicamentos, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(jtaSintomas, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblSintomas))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblReceita))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(19)
							.addComponent(jtaReceita, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblValor)
						.addComponent(txtValor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(32)
					.addComponent(lblExame)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNome)
						.addComponent(txtNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblDataExame)
						.addComponent(txtDataExame, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
					.addComponent(pnlBotoes, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Consulta c = new Consulta();
				c.setM((Medico) cmbMedico.getSelectedItem());
				c.setP((Paciente) cmbPaciente.getSelectedItem());
				c.setD((Demais) cmbPaciente.getSelectedItem());
				
				String dtC = txtDataConsulta.getText();
				//Configuração do formato de data
				DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				//Conversão de String para LocalDate
				LocalDate dataCons = LocalDate.parse(dtC, formato);
				c.setData(dataCons);
				
				String h = txtHorario.getText();
				// Configuração do horário
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
				//Conversão de String para LocalTime
				LocalTime horario = LocalTime.parse(h, formatter);
				c.setHorario(horario);
				//end.setComplemento(jtaComplemento.getText());
				c.setMedicamentosPac(jtaMedicamentos.getText());
				c.setSintomasPac(jtaSintomas.getText());
				c.setReceita(jtaReceita.getText());
				c.setValor(Integer.parseInt(txtValor.getText()));
				
				Exame ex = new Exame();
				ex.setNome(txtNome.getText());
				
				String dtE = txtDataConsulta.getText();
				//Conversão de String para LocalDate
				LocalDate dataEx = LocalDate.parse(dtE, formato);
				c.setData(dataEx);

			}	
				
		});
		pnlBotoes.add(btnSalvar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		pnlBotoes.add(btnCancelar);
		contentPane.setLayout(gl_contentPane);
	}
}
