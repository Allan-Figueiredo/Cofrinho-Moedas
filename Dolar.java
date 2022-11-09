// Utilizando herança Dolar(classe filha) extende Moeda(Classe mãe)
public class Dolar extends Moeda {
	
	
	public Dolar(double valorInicial) {
		this.valor = valorInicial;
		
	}

	@Override
	public void info() {
		System.out.println("Dolar - " + valor);
		
		
	}

	@Override
	public double converter() {
		//Valor do Dolar convertido em Real
		return this.valor * 5.5;
	}
	//Compatativo de classes
	@Override
	public boolean equals(Object o){
		if (this.getClass()!= o.getClass()) {
			return false;
		}
		
		// Cast
		Dolar objetoDolar = (Dolar) o;
		
		if (this.valor != objetoDolar.valor) {
			return false;
		}
		
		return true;
		
	}
	

}
