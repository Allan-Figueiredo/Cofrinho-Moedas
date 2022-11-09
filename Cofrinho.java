import java.util.ArrayList;

public class Cofrinho {
	//Minha lista de Moedas utilizando o ArrayList com isso o Cofrinho consegue trabalhar com as moedas
	private ArrayList<Moeda> listaMoedas;
		
	
	public Cofrinho() {
		this.listaMoedas = new ArrayList<>();
		
	}
	//Adicionar moeda ao cofre
	public void adicionar(Moeda moeda){
		this.listaMoedas.add(moeda);
			
	}
	//Remover moeda co cofre (boolean)pra ter retorno
	public boolean remover(Moeda moeda){
		return this.listaMoedas.remove(moeda);
			
	}
	
	public void listagemMoedas(){
		//Se listar as moedas e não tiver moedas no Cofrinho
		if(this.listaMoedas.isEmpty()) {
			System.out.println("Não existe moeda no cofrinho ");
			return;
		}
		
		
		for (Moeda moeda : this.listaMoedas) {
			moeda.info();
		}
			
		
		}
	
      public double totalConvertido() {
    	if (this.listaMoedas.isEmpty()) {
	    return 0;
      }
    //Valor acumulado começa com zero	
    double valorAcomulado = 0;
    
    for (Moeda moeda : this.listaMoedas) {
    	valorAcomulado = valorAcomulado + moeda.converter();
	}
    
    return valorAcomulado;
   }
}
