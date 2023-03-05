package clinicaoftal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Medico extends Funcionario {
	private ArrayList<Operadora> OpAtendidas = new ArrayList<>();
	private String crm;
	private String especAtend;
	private static double valConsulta = 200f;
	private double salAcumulado;
	
	
	
	public Medico(String n, String c, String r, String ec, Endereco e, LocalDate d, String s, LocalDate dtAdm, int nroCt, String u, String se, ArrayList<Operadora>op, String reg, String ea) {
		super(n, c, r, ec, e, d, s, dtAdm, nroCt, u, se);
		setOpAtendidas(op);
		setCrm(reg);
		setEspecAtend(ea);
	}
		




	public Medico() {
		// TODO Auto-generated constructor stub
	}





	public String exibeDados() {
	    return 	"Nome: "+ getNome() +"\n" +
	    		"CPF: "+ getCpf() +"\n" +
	    		"Estado Civil: " + getEstadoCivil() +"\n" +
	    		"Endereço: " + getEndereco() +"\n" +
	    		"Data de Nascimento: "+ getDataNasc() +"\n" +
	    		"Operadora Atendida: "+ getOpAtendidas() +"\n" +
	    		"CRM: "+ getCrm()+"\n" +
	    		"Especialidade Atendida:"+ getEspecAtend() +"\n" +
	    		"Data de Admissão: "+ getDataAdm() +"\n" +
	    		"Carteira de Trabalho: "+ getNroCarTrab();
	           
	}
	
	public double calculaSalario() {
		return salAcumulado;
	}
	
	// salParcial
	public void addSalParcial(double v) {
		salAcumulado += v;
		}
	
	public double getSalParcial() {
		return salAcumulado;

	}
	
	public void zeraSalParcial() {
		salAcumulado = 0;

	}

	public static double getValConsulta() {
		return valConsulta;
	}
	
	public ArrayList<Operadora> getOpAtendidas() {
		return OpAtendidas;
	}

	public void setOpAtendidas(ArrayList<Operadora> opAtendidas) {
		OpAtendidas = opAtendidas;
	}

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

	public String getEspecAtend() {
		return especAtend;
	}

	public void setEspecAtend(String especAtend) {
		this.especAtend = especAtend;
	}





	public void setOpAtendida(Operadora selectedItem) {
		// TODO Auto-generated method stub
		
	}
}


	