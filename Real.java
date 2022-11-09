// Utilizando herança Real(classe filha) extende Moeda(Classe mãe)
public class Real extends Moeda {
	
	
	public Real(double valorInicial) {
		this.valor = valorInicial;
		
	}
	

	@Override
	public void info() {
		System.out.println("Real - " + valor);
		
	}

	@Override
	public double converter() {
		return this.valor;
		
		
	}
	//Compatativo de classes
	@Override
	public boolean equals(Object o){
		if (this.getClass()!= o.getClass()) {
			return false;
		}
		
		//Cast
		
		Real objetoReal = (Real) o;
		
		if (this.valor != objetoReal.valor) {
			return false;
		}
		
		return true;
		
	}
	

}
