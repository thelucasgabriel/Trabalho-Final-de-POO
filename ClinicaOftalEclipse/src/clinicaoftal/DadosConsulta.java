package clinicaoftal;

import java.util.ArrayList;

public class DadosConsulta {
	private ArrayList<Consulta> vetCon = new ArrayList<Consulta>();
	public void cadastrar(Consulta c) {
			this.vetCon.add(c);
			System.out.println("Total de Consultas: ");
			System.out.println(this.vetCon.size());
	}
	
	public void listar() {
			for (Consulta objeto: this.vetCon) {
				objeto.exibeDados();
			}
		}
	
	public Consulta buscar(Paciente p) { //verificar como fazer
		Consulta c = null;
		for ( Consulta objeto: this.vetCon) {
			if (objeto.getP().equals(p)) {
				c = objeto;
				break;
			}
		}
		return c;
	}
	
	public boolean excluir(Paciente p){ //verificar como fazer
		Consulta c = this.buscar(p);
		if (c != null) {
			this.vetCon.remove(c);
			return true;
		}
		else {
			return false;
		}
	}
}
