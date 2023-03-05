package clinicaoftal;

import java.util.Date;

public class Exame {
	
	private String nome;
	private Date data;
	
	public Exame(int c, String n, Date d){
		setNome(n);
		setData(d);
	}
	
	public Exame() {
		// TODO Auto-generated constructor stub
	}

	public void exibeDados() { //1) correção
		System.out.printf(
				"Nome: "+getNome()+"\n", 
				"CPF: "+getData()+"\n");
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	
}
