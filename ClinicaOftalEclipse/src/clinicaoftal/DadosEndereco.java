package clinicaoftal;

import java.util.ArrayList;

public class DadosEndereco {
	private ArrayList<Endereco> vetEnd = new ArrayList<Endereco>();
	public void cadastrar(Endereco e) {
			this.vetEnd.add(e);
			System.out.println("Total de Endereços: ");
			System.out.println(this.vetEnd.size());
	}
	
	public void listar() {
			for (Endereco objeto: this.vetEnd) {
				objeto.exibeDados();
			}
		}
	
	public Endereco buscar(String cep) {
		Endereco e = null;
		for ( Endereco objeto: this.vetEnd) {
			if (objeto.getCep().equals(cep)) {
				e = objeto;
				break;
			}
		}
		return e;
	}
	
	public boolean excluir(String cep){ 
		Endereco e = this.buscar(cep);
		if (e != null) {
			this.vetEnd.remove(e);
			return true;
		}
		else {
			return false;
		}
	}
}
