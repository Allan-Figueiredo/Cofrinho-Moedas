// Utilizando herança Euro(classe filha) extende Moeda(Classe mãe)
public class Euro extends Moeda {
	
	public Euro(double valorInicial) {
		this.valor = valorInicial;
		
	}
    
	
	public void info() {
		System.out.println("Euro - " + valor);
		
		
	}

	public double converter() {
		//Valor do Euro convertido em Real
		return this.valor * 6.5;
	}
	//Compatativo de classes
	@Override
	public boolean equals(Object o){
		if (this.getClass()!= o.getClass()) {
			return false;
		}
		
		//Cast
		
		Euro objetoEuro = (Euro) o;
		
		if (this.valor != objetoEuro.valor) {
			return false;
		}
		
		return true;
		
	}
	

}
