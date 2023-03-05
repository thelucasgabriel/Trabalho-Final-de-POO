package clinicaoftal;

public class Endereco {
	private String estado;
    private String cidade;
    private String bairro;
    private String rua;
    private int nro;
    private String cep;
    private String complemento;
    
    public Endereco(String es, String c, String b, String r, int n, String ce, String comp) {
    	setEstado(es);
    	setCidade(c);
    	setBairro(r);
    	setRua(r);
    	setNro(nro);
    	setCep(ce);
    	setComplemento(comp);
    }

    public Endereco() {
		// TODO Auto-generated constructor stub
	}

	public String exibeDados() {
	    return 	"Estado: " + getEstado()+"\n" +
	    		"Cidade: " + getCidade()+"\n" +
	    		"Bairro: " + getBairro()+"\n" +
	    		"Rua: " + getRua()+"\n" + 
	    		"Numero: " + getNro()+"\n" +
	    		"CEP: " + getCep()+"\n" + 
	    		"Complemento: " + getComplemento()+"\n";
	}
	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getNro() {
		return nro;
	}

	public void setNro(int nro) {
		this.nro = nro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
    


}
