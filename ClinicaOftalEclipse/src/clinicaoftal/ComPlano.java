package clinicaoftal;
import java.time.LocalDate;
import java.util.Date;

public class ComPlano extends Paciente {
	private Operadora operadora;
	private String nrocarteirinha;
	private Date dataing;
	private boolean carencia;

	public ComPlano(String n, String c, String r, String ec, Endereco e, LocalDate d, String s, LocalDate dtC, LocalDate ultC, Operadora op, String nro, Date dtIng, boolean cr ) {
		super(n, c, r, ec, e, d, s, dtC, ultC);
		setOperadora(op); // verificar 
		setNrocarteirinha(nro);
		setDataing(dtIng);
		setCarencia(cr);
	}
	public ComPlano() {
		// TODO Auto-generated constructor stub
	}

	
	
	public String exibeDados() { //1 correção
	    return 	"CPF: "+getCpf()+"\n" +
	    		"RG: "+getRg()+"\n" + 
	    		"Estado Civil: "+getEstadoCivil()+"\n" + 
	    		"Endereço: "+getEndereco() + "\n" +
	    		"Data de Nascimento: "+getDataNasc() + "\n" +
	    		"Sexo: "+getSexo() + "\n" +
	       		"Data da Última Consulta: "+getUltConsulta() +
	    		"Operadora: " +getOperadora() + "\n" +
	    		"Número da Carteirinha: "+getNrocarteirinha() + "\n" +
	    		"Data de Ingresso no PS: "+getDataing() + "\n" +
	    		"Período de Carência? "+isCarencia();

	}

	public Operadora getOperadora() {
		return operadora;
	}

	public void setOperadora(Operadora operadora) {
		this.operadora = operadora;
	}

	public String getNrocarteirinha() {
		return nrocarteirinha;
	}

	public void setNrocarteirinha(String nrocarteirinha) {
		this.nrocarteirinha = nrocarteirinha;
	}

	public Date getDataing() {
		return dataing;
	}

	public void setDataing(Date dataing) {
		this.dataing = dataing;
	}

	public boolean isCarencia() {
		return carencia;
	}

	public void setCarencia(boolean carencia) {
		this.carencia = carencia;
	}
}
