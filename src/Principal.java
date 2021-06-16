import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
	
		
		
		ArrayList <String> listaPrioridadePrimaria = new ArrayList<>();	
		listaPrioridadePrimaria.add("processamento do sistema");
		listaPrioridadePrimaria.add("execução do drive de video");
		
		ArrayList <String> listaPrioridadeSecundaria = new ArrayList<>();
		listaPrioridadeSecundaria.add("Filme sendo executado");
		listaPrioridadeSecundaria.add("Navegador de internet aberto");
		
		ArrayList <String> listaPrioridadeTerciaria = new ArrayList<>();
		listaPrioridadeTerciaria.add("download automatico de atualização do SO");

		
		
		while ( !(listaPrioridadePrimaria.isEmpty() && listaPrioridadeSecundaria.isEmpty() && listaPrioridadeTerciaria.isEmpty()) ) {
			
			
			if (!listaPrioridadePrimaria.isEmpty()) {
				for (int i = 0; i < listaPrioridadePrimaria.size(); i++) {
					System.out.println(listaPrioridadePrimaria.get(i));				
				}
				listaPrioridadePrimaria.clear();
				continue;
			}
			
			if (!listaPrioridadeSecundaria.isEmpty()) {
				for (int i = 0; i < listaPrioridadeSecundaria.size(); i++) {
					System.out.println(listaPrioridadeSecundaria.get(i));
				}
				listaPrioridadeSecundaria.clear();
				
				listaPrioridadePrimaria.add("dispositivo USA conectado");
				continue;
			}
			
			if (!listaPrioridadeTerciaria.isEmpty()) {
				for (int i = 0; i < listaPrioridadeTerciaria.size(); i++) {
					System.out.println(listaPrioridadeTerciaria.get(i));
				}
				listaPrioridadeTerciaria.clear();
				continue;
			}
			
			
		} //While
		
		
		
		
		

	}
	
	

}
