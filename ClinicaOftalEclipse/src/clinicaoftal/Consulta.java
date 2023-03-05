package clinicaoftal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class Consulta {
	
	// 6) correção - atributo plano removido
	private Medico m;
	private Paciente p;
	private Demais d; // corrigido - demais funcionários
	private LocalDate data;
	private LocalTime horario;
	private String medicamentosPac;
	private String sintomasPac; 
	private String receita;
	private double valor;
	private Exame e;
	static private int nroConsultas; // 8) correção
    private double valConsul; 
    private double valMedSal;
	
	
	public Consulta(Medico med, Paciente pac, Demais df, LocalDate d, LocalTime h, String medPac, String sPac, String r, double v, Exame ex){
		setM(med);
		setP(pac);
		setD(df);
		setData(d);
		setHorario(h);
		setMedicamentosPac(medPac);
		setSintomasPac(sPac);
		setReceita(r);
		setValor(v);
		setE(ex);
	}
	
	public Consulta(Paciente p, Medico m, LocalDate d, LocalTime h) {
		setP(p);
		setM(m);
		setData(d);
		setHorario(h);
	}
	
	public Consulta() {
		// TODO Auto-generated constructor stub
	}

	public void exibeDados() { //1) correção
		System.out.printf("Médico: "+getM()+"\n", 
				"Paciente: "+getP()+"\n", 
				"Funcionário: "+getD()+"\n", 
				"Data: " +getData()+"\n", 
				"Horário: " +getHorario()+"\n", 
				"Medicamentos Paciente: "+getMedicamentosPac()+"\n", 
				"Sintomas do Paciente: "+getSintomasPac()+"\n", 
				"Receita: "+getReceita()+"\n", 
				"Valor:"+getValor()+"\n", 
				"Exame:  "+getE());
	}
	
	public void efetuarConsulta(Consulta c) {
	    nroConsultas ++;
	    p.setUltConsulta(data);
	    if( p instanceof ComPlano) {
	        double valor = Operadora.getValConsulta() + m.getSalParcial();
	        m.addSalParcial(valor);
	    }else{
//	        double valor = Medico.getValConsulta() - (Medico.getValConsulta() * ((SemPlano)p).getValDesc()) + m.getSalParcial();
	        valConsul = Medico.getValConsulta() - (Medico.getValConsulta() * ((SemPlano)p).getValDesc());
	        valMedSal = valConsul + m.getSalParcial();		
	        m.addSalParcial(valMedSal);
//	        ((SemPlano)p).setValPagUltConsul(Medico.getValConsulta());
	        ((SemPlano)p).setValPagUltConsul(valConsul);
	    }
	}
	
	
	public void zeraConsultas() {
		nroConsultas = 0;
	}
	
	public Medico getM() {
		return m;
	}

	public void setM(Medico m) {
		this.m = m;
	}

	public Paciente getP() {
		return p;
	}

	public void setP(Paciente p) {
		this.p = p;
	}

	public Demais getD() {
		return d;
	}

	public void setD(Demais d) {
		this.d = d;
	}
	
	

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public int contaConsultas() {
		nroConsultas = nroConsultas++;	
		return nroConsultas;
	}
	
	public void anularConsultas() {
		nroConsultas = 0;
	}




	public LocalTime getHorario() {
		return horario;
	}

	public void setHorario(LocalTime horario) {
		this.horario = horario;
	}

	public String getMedicamentosPac() {
		return medicamentosPac;
	}

	public void setMedicamentosPac(String mp) {
		this.medicamentosPac = mp;
	}

	public String getSintomasPac() {
		return sintomasPac;
	}

	public void setSintomasPac(String sp) {
		this.sintomasPac = sp;
	}

	public String getReceita() {
		return receita;
	}

	public void setReceita(String receita) {
		this.receita = receita;
	}

	public Exame getE() {
		return e;
	}

	public void setE(Exame e) {
		this.e = e;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public static int getNroConsultas() {
		return nroConsultas;
	}

	public static void setNroConsultas(int nroConsultas) {
		Consulta.nroConsultas = nroConsultas;
	}	
}
