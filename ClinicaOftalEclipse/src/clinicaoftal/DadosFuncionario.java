package clinicaoftal;

import java.util.ArrayList;

public class DadosFuncionario {

	private static ArrayList<Funcionario> vetFun = new ArrayList<Funcionario>();
	public static boolean cadastrar(Funcionario f) {
		if(f != null) {
			vetFun.add(f); 
			return true;
			}else {
				return false;
			}
			
			
			
			//System.out.println("Total de Funcionários: ");
			//System.out.println(this.vetFun.size());
	}
	
	public void listar() {
			for (Funcionario objeto: this.vetFun) {
				objeto.exibeDados();
			}
		}
	public Funcionario buscar(String cpf) {
		Funcionario f = null;
		for ( Funcionario objeto: this.vetFun) {
			if (objeto.getCpf().equals(cpf)) { //verificar o problema do número ser inteiro
				f = objeto;
				break;
			}
		}
		return f;
	}
	
	public boolean excluir(String cpf){ // continuar e resolver
		Funcionario f = this.buscar(cpf);
		if (f != null) {
			this.vetFun.remove(f);
			return true;
		}
		else {
			return false;
		}
	}

	public Funcionario[] getVetFun() {
		// TODO Auto-generated method stub
		return null;
	}
}
