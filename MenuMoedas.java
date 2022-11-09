import java.util.Scanner;

public class MenuMoedas {
	
	private Scanner sc;
	private Cofrinho cofrinho;
	
	public MenuMoedas( ) {
		//Scanner para inserir
		sc = new Scanner(System.in);
		cofrinho = new Cofrinho();
	}
	
	public void ExibirMenuMoedas( ) {
		//Menu Cofrinho do programa
		System.out.println("---Menu cofrinho---");
		System.out.println("1-Adicionar moedas");
		System.out.println("2-Remover moedas");
		System.out.println("3-Listar moedas");
		System.out.println("4-Calcular valor total convertido pra real");
		System.out.println("0-Encerrar");
		
		String opcaoEscrever = sc.next();
		
		switch (opcaoEscrever) {
		
		case"0":
			System.out.println("Fim do sistema");
		   break;
		 // Cada case representa um número do Menu  
		case"1":
			exibirMenuAdcionarMoedas();
			ExibirMenuMoedas();
			break;
			
		case"2":
			exibirMenuRemoverMoedas();
			ExibirMenuMoedas();
		   break;
			
		case"3":
			
			cofrinho.listagemMoedas();
			ExibirMenuMoedas();
	     	break;
	    //Tratamento de "." para "," 	
		case "4":
			double valorTotalConvertido = cofrinho.totalConvertido();
			String valorTotalConvertidoText = String.valueOf(valorTotalConvertido);
			valorTotalConvertidoText = valorTotalConvertidoText.replace(".", ",");
			System.out.println("O valor total convertido para real ? " + valorTotalConvertido);
			ExibirMenuMoedas();
			break;
				
		default:
			System.out.println("Opção inválida");
			ExibirMenuMoedas();
			break;
		
		}
	
	}
	
	private void exibirMenuAdcionarMoedas() {
		
		System.out.println("Escolha Moeda ");
		System.out.println("1 - Real ");
		System.out.println("2 - Dólar ");
		System.out.println("3 - Euro ");
		int opcaoMoeda = sc.nextInt();
		
		System.out.println("Digite o valor ");
		
		String valorTextMoeda = sc.next();
		valorTextMoeda = valorTextMoeda.replace(",",".");
		double valorMoeda = Double.valueOf(valorTextMoeda);
		
		Moeda moeda = null;
		
		if(opcaoMoeda == 1) {
			moeda = new Real(valorMoeda);
		} else if (opcaoMoeda == 2) {
			moeda = new Dolar(valorMoeda);
		} else if (opcaoMoeda == 3) {
			moeda = new Euro(valorMoeda);
		} else {
			System.out.println("Não existe essa moeda ");
			ExibirMenuMoedas();
		}
		//Adicionando Moeda ao Cofrinho
		cofrinho.adicionar(moeda);
		System.out.println("Moeda inserida ");
	}
	
        private void exibirMenuRemoverMoedas() {
		
		System.out.println("Escolha Moeda ");
		System.out.println("1 - Real ");
		System.out.println("2 - Dólar ");
		System.out.println("3 - Euro ");
		int opcaoMoeda = sc.nextInt();
		
		System.out.println("Digite o valor ");
		
		String valorTextMoeda = sc.next();
		valorTextMoeda = valorTextMoeda.replace(",",".");
		double valorMoeda = Double.valueOf(valorTextMoeda);
		
		Moeda moeda = null;
		
		if(opcaoMoeda == 1) {
			moeda = new Real(valorMoeda);
		} else if (opcaoMoeda == 2) {
			moeda = new Dolar(valorMoeda);
		} else if (opcaoMoeda == 3) {
			moeda = new Euro(valorMoeda);
		} else {
			System.out.println("Não existe essa moeda ");
			ExibirMenuMoedas();
		}
		//Removendo Moeda do Cofrinho com retorno
		boolean removerMoeda = cofrinho.remover(moeda);
		
		if(removerMoeda){
		   System.out.println("Moeda removida");
      } else {
			System.out.println("Não removeu moeda, pois não tem moeda desse valor ");
		   }
        }
	
	
}
	
	


