package clinicaoftal;

import java.time.LocalDate;
import java.util.Date;

public class Demais extends Funcionario{
	
	private float salBase;
	private String cargo;
	static private int qtdLimCons = 10; //5) correção
	static private int gratificacao = 50;
	
	public Demais(String n, String c, String r, String ec, Endereco e, LocalDate d, String s, LocalDate dtAdm, int nroCt, String u, String se, float sal, String cg) {
		super(n, c, r, ec, e, d, s, dtAdm, nroCt, u, se);
		setSalBase(sal);
		setCargo(cg);
		
	}
	
	public Demais() {
		
	}

	public String exibeDados() { //1 correção
	    return 	"Nome: "+getNome()+"\n" +
	    		"CPF: "+getCpf()+"\n" + 
	    		"RG: "+getRg()+"\n" + 
	    		"Estado Civil: "+getEstadoCivil() + "\n" +
	    		"Endereço: "+getEndereco() + "\n" +
	    		"Data de Nascimento: "+getDataNasc() + "\n" +
	    		"Nro. Cart. de Trabalho: "+getNroCarTrab() + "\n" +
	    		"Salário Base: "+getSalBase() + "\n" +
	    		"Cargo: "+getCargo() + "\n" +
	    		"Limite de Consutlas: "+getQtdLimCons();
	}
	
	/* public double calculaSalario() { // se exceder, ganhar 5% a mais
		if (Consulta.getNroConsultas() > getQtdLimCons()) {
			return getSalBase() * 0.05 + getSalBase();
		}else {
			return getSalBase();
		}
	} */
	
	public double calculaSalario() {
		if (Consulta.getNroConsultas() > qtdLimCons) {
			return getSalBase() + getGratificacao();
		}else {
			return salBase;
		}
		
	}

	public float getSalBase() {
		return salBase;
	}

	public void setSalBase(float salBase) {
		this.salBase = salBase;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public int getQtdLimCons() {
		return qtdLimCons;
	}

	public void setQtdLimCons(int qtdLimCons) {
		this.qtdLimCons = qtdLimCons;
	}

	public static int getGratificacao() {
		return gratificacao;
	}

	public static void setGratificacao(int gratificacao) {
		Demais.gratificacao = gratificacao;
	}
	
}
