package clinicaoftal;

import java.time.LocalDate;
import java.util.Date;

public class SemPlano extends Paciente {
	private boolean descEsp;
	private double valDesc;
	private double valPagUltConsul;
	
	public SemPlano(String n, String c, String r, String ec, Endereco e, LocalDate d, String s, LocalDate dtC, LocalDate ultC, boolean descE) {
		super(n, c, r, ec, e, d, s, dtC, ultC);
		setDescEsp(descE);
		valDesc = 0.15f;
	}
	


	public SemPlano() {
		// TODO Auto-generated constructor stub
	}

	
	public String exibeDados() { //1 correção
	    return 	"CPF: "+getCpf()+"\n" +
	    		"RG: "+getRg()+"\n" + 
	    		"Estado Civil: "+getEstadoCivil()+"\n" + 
	    		"Endereço: "+getEndereco() + "\n" +
	    		"Data de Nascimento: "+getDataNasc() + "\n" +
	    		"Sexo: "+getSexo() + "\n" +
	    		"Data de Cadastramento: "+getDataCad() +
	    		"Data da Última Consulta: "+getUltConsulta() + "\n" +
	    		"Desconto Especial: "+isDescEsp() + "\n" +
	    		"Valor Pago na Última Consulta: "+getValPagUltConsul();

	}
	
	
	public double getValDesc() {
		return valDesc;
	}

	public boolean isDescEsp() {
		return descEsp;
	}

	public void setDescEsp(boolean descEsp) {
		this.descEsp = descEsp;
	}

	public double getValPagUltConsul() {
		return valPagUltConsul;
	}

	public void setValPagUltConsul(double valPagUltConsul) {
		this.valPagUltConsul = valPagUltConsul;
	}





}
