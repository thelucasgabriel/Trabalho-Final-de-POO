package clinicaoftal;

import java.time.LocalDate;
import java.util.Date;

public abstract class Pessoa {
	
	private String nome;
	private String cpf;
	private String rg;
	private String estadoCivil;
	private Endereco endereco;
	private LocalDate dataNasc;
	private String sexo;
	
	public Pessoa(String n, String c, String r, String ec, Endereco e, LocalDate d, String s) {
		setNome(n);
		setCpf(c);
		setRg(r);
		setEstadoCivil(ec);
		setEndereco(e);
		setDataNasc(d);
		setSexo(s);
		
	
	}
	public Pessoa(String n, String c) {
		setNome(n);
		setCpf(c);
	}
	
	public Pessoa() {
		
	}
	
/*	public abstract void exibeDados() { //verificar
		
	} */

	public String exibeDados() { //1 correção
	    return 	"Nome: "+getNome()+"\n" +
	    		"CPF: "+getCpf()+"\n" + 
	    		"RG: "+getRg()+"\n" + 
	    		"Estado Civil: "+getEstadoCivil() + "\n" +
	    		"Endereço: "+getEndereco() + "\n" +
	    		"Data de Nascimento: "+getDataNasc();
	}
	

	
	public String getNome() {
		return nome;
	}

	public boolean setNome(String nome) {
			if(nome.length() > 0) {
				this.nome = nome;
				return true;
			}else{
				return false;
			}
	}

	public String getCpf() {
		return cpf;
	}

	public boolean setCpf(String cpf) { // chamar ou adicionar o método de verificação
		if (ValidaCpf.isCPF(cpf) == true) {
			this.cpf = cpf;
			return true;
		}else{
			return false;
		}
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}
	
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}


	public LocalDate getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(LocalDate dataNasc) {
		this.dataNasc = dataNasc;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
}
