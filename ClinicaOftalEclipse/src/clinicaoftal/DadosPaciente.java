package clinicaoftal;

import java.util.ArrayList;

public class DadosPaciente {

	private static ArrayList<Paciente> vetPac = new ArrayList<Paciente>();
	public static boolean cadastrar(Paciente p) {
			if(p != null) {
				vetPac.add(p);
				return true;
			}else {
				return false;
			}
			
			//System.out.println("Total de Pacientes: ");
			//System.out.println(vetPac.size());
	}
	
	public void listar() {
			for (Paciente objeto: this.vetPac) {
				objeto.exibeDados();
			}
		}
	
	public static Paciente buscar(String cpf) {
		Paciente p = null;
		for ( Paciente objeto: vetPac) {
			if (objeto.getCpf().equals(cpf)) {
				p = objeto;
				break;
			}
		}
		return p;
	}
	
	public static boolean excluir(String cpf){ 
		Paciente p = buscar(cpf);
		if (p != null) {
			vetPac.remove(p);
			return true;
		}
		else {
			return false;
		}
	}

	public Paciente[] getVetPac() {
		// TODO Auto-generated method stub
		return null;
	}
}

