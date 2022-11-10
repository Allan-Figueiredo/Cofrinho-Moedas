
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

		return this.valor * 5.5;
	}

	@Override
	public boolean equals(Object o){
		if (this.getClass()!= o.getClass()) {
			return false;
		}
		

		Dolar objetoDolar = (Dolar) o;
		
		if (this.valor != objetoDolar.valor) {
			return false;
		}
		
		return true;
		
	}
	

}
