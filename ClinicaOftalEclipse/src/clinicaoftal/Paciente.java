package clinicaoftal;
import java.time.LocalDate;
import java.util.Date;

public class Paciente extends Pessoa {
	private LocalDate dataCad;
	private LocalDate ultConsulta;
	
	public Paciente(String n, String c, String r, String ec, Endereco e, LocalDate d, String s, LocalDate dtC, LocalDate ultC ) {
		super(n, c, r, ec, e, d, s);
		setDataCad(dtC);
		setUltConsulta(ultC);
			
	}
	
	public Paciente(String n, String c) {
		super(n, c);
		setNome(n);
		setCpf(c);
		
	}
	
	public Paciente() {
		
	}


/*	public void exibeDados() { //verificar

		System.out.printf("Nome: "+getNome()+"\n", "CPF: "+getCpf()+"\n", "RG: "+getRg()+"\n", "Estado civil: " +getEstadocivil()+"\n", "Endereco: " +getEndereco()+"\n", "Data de nascimento: "+getDatanasc()+"\n", "Sexo: "+getSexo()+"\n", "Data de cadastramento: "+getDataCad()+"\n", "Data da última consulta: "+getUltConsulta());
	} */
	
	public String exibeDados() { //1 correção
	    return 	"CPF: "+getCpf()+"\n" +
	    		"RG: "+getRg()+"\n" + 
	    		"Estado Civil: "+getEstadoCivil()+"\n" + 
	    		"Endereço: "+getEndereco() + "\n" +
	    		"Data de Nascimento: "+getDataNasc() + "\n" +
	    		"Sexo: "+getSexo() + "\n" +
	    		"Data de Cadastramento: "+getDataCad() + "\n" +
	    		"Data da Última Consulta: "+getUltConsulta();

	}

	public LocalDate getDataCad() {
		return dataCad;
	}

	public void setDataCad(LocalDate dtC) {
		this.dataCad = dtC;
	}

	public LocalDate getUltConsulta() {
		return ultConsulta;
	}

	public void setUltConsulta(LocalDate ultConsulta) {
		this.ultConsulta = ultConsulta;
	}
}
