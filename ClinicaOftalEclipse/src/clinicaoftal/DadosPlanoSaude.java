package clinicaoftal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;



public class DadosPlanoSaude {
	private static ArrayList<Operadora> vetPlan = new ArrayList<Operadora>();
		public static boolean cadastrar(Operadora o) {
			if(o != null) {
				getVetPlan().add(o);
				//gravarArquivo();
				return true;
			}else {
				return false;
			}
			
			 //ADICIONA O PACIENTE NO ARRAY
			//System.out.println("Total de Pacientes: ");
			//System.out.println(this.vetPlan.size());
	}
		public void listar(){
		for (Operadora objeto: this.getVetPlan()) {
		objeto.exibeDados();
		//método mostrarDados();
		}
	}
		public static Operadora buscar(String cnpj) {
			Operadora o = null;
			for ( Operadora objeto: getVetPlan()) {
				if (objeto.getCnpj().equals(cnpj)) {
					o = objeto;
					break;
				}
			}
			return o;
		}
		
		public static boolean excluir(String cnpj){ 
			Operadora o = buscar(cnpj);
			if (o != null) {
				getVetPlan().remove(o);
				return true;
			}
			else {
				return false;
			}
		}
		
		//Gravação em Arquivo
		public static boolean gravarArquivo(){
			if(Arquivo.gravar(getVetPlan(), "ArqOperadoras.dat")){
				return true;
			}else {
				return false;
			}
		}
		
		//Banco de Dados 
		public static void inserirDados(String comando) {
			
			String url = "jdbc:postgresql://localhost:5432/TrabalhoPOO";
			String user = "postgres";
			String password = "12345678";
			Connection conn = null;
			Statement stmt = null; 
			int rs = 0;
			
			try {
				Class.forName("org.postgresql.Driver");
				System.out.println("Driver OK");
			}catch (Exception e) {
				System.out.println("Erro Driver");
				return;
	}
			try {
				conn = DriverManager.getConnection(url,user,password);
				stmt = conn.createStatement();
				String query = comando;
				rs = stmt.executeUpdate(query);
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			} finally {
				try {
				if (stmt != null) stmt.close();
				} catch (SQLException ex) {
				System.err.println(ex.getMessage());
				}
			}
		}
		public static ArrayList<Operadora> getVetPlan() {
			return vetPlan;
		}
		public static void setVetPlan(ArrayList<Operadora> vetPlan) {
			DadosPlanoSaude.vetPlan = vetPlan;
		}
}
