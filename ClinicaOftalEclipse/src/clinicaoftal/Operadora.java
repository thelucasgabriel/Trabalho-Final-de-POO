package clinicaoftal;

public class Operadora {
    private String nomeOp;
    private String cnpj;
    private Endereco endOp;
    private static double valConsulta = 100f;

	public Operadora(String n, String c, Endereco e) {
		setNomeOp(n);
		setCnpj(c);
		setEndOp(e);
		
		
		//obs. vincular médico às operadoras atendidas
	}
	

	public Operadora() {
		// TODO Auto-generated constructor stub
	}

	public String exibeDados() {
	    return "Nome da Operadora: " + getNomeOp() + "\n" +
	           "CNPJ da Operadora: " + getCnpj() + "\n" +
	           "Endereço da Operadora: " + getEndOp() + "\n" +
	           "Valor da Consulta: " + getValConsulta() + "\n";
	}


	public String getNomeOp() {
		return nomeOp;
	}

	public void setNomeOp(String nomeOp) {
		this.nomeOp = nomeOp;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}


	public Endereco getEndOp() {
		return endOp;
	}

	public void setEndOp(Endereco endOp) {
		this.endOp = endOp;
	}


	public static double getValConsulta() {
		return valConsulta;
	}	
}
