package clinicaoftal;
import java.time.LocalDate;
import java.util.Date;

public abstract class Funcionario extends Pessoa {
	private LocalDate dataAdm;
	private int nroCarTrab;
	private String usuario;
	private String senha;
	
	public Funcionario(String n, String c, String r, String ec, Endereco e, LocalDate d, String s, LocalDate dtAdm, int nroCt, String u, String se) {
		super(n, c, r, ec, e, d, s);
		setDataAdm(dtAdm);
		setNroCarTrab(nroCt);
		setUsuario(u);
		setSenha(se);
	}
	
	
	public Funcionario() {
		// TODO Auto-generated constructor stub
	}


	public String exibeDados() {
	    return "Nome: "+getNome()+"\n" +
	    		"CPF: "+getCpf()+"\n" + 
	    		"RG: "+getRg()+"\n" + 
	    		"Estado Civil: "+getEstadoCivil() + "\n" +
	    		"Endereço: "+getEndereco() + "\n" +
	    		"Data de Nascimento: "+getDataNasc() + "\n" +
	    		"Data de Admissão: "+getDataAdm() + "\n" +
	    		"Nro. Cart. de Trabalho: "+getNroCarTrab() + "\n";
	}
	
	public abstract double calculaSalario();	



	public LocalDate getDataAdm() {
		return dataAdm;
	}


	public void setDataAdm(LocalDate dataAdm) {
		this.dataAdm = dataAdm;
	}


	public int getNroCarTrab() {
		return nroCarTrab;
	}

	public void setNroCarTrab(int nroCarTrab) {
		this.nroCarTrab = nroCarTrab;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
