package clinicaoftal;

import java.util.ArrayList;

public class DadosExame {
	private ArrayList<Exame> vetEx = new ArrayList<Exame>();
	public void cadastrar(Exame e) {
			this.vetEx.add(e);
			System.out.println("Total de Exames: ");
			System.out.println(this.vetEx.size());
	}
	
	public void listar() {
			for (Exame objeto: this.vetEx) {
				objeto.exibeDados();
			}
		}
	
	public Exame buscar(String nome) {
		Exame e = null;
		for ( Exame objeto: this.vetEx) {
			if (objeto.getNome().equals(nome)) {
				e = objeto;
				break;
			}
		}
		return e;
	}
	
	public boolean excluir(String n){ 
		Exame e = this.buscar(n);
		if (e != null) {
			this.vetEx.remove(e);
			return true;
		}
		else {
			return false;
		}
	}
}
