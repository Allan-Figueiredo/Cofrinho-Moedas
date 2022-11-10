
public class Euro extends Moeda {
	
	public Euro(double valorInicial) {
		this.valor = valorInicial;
		
	}
    
	
	public void info() {
		System.out.println("Euro - " + valor);
		
		
	}

	public double converter() {

		return this.valor * 6.5;
	}

	@Override
	public boolean equals(Object o){
		if (this.getClass()!= o.getClass()) {
			return false;
		}
		

		
		Euro objetoEuro = (Euro) o;
		
		if (this.valor != objetoEuro.valor) {
			return false;
		}
		
		return true;
		
	}
	

}
