package program;

public class Fatorial extends Operacao {

	@Override
	public double calcular(double[] n) {
		
		if (n[0] < 0) {
			throw new NumeroNegativoException();
		}
		double f = 1;
		
		for (int i = 1; i <= n[0]; i++) {
			f = f * i;
		}
		return f;
	}

	@Override
	public String getDescricao() {
		// TODO Auto-generated method stub
		return "Fatorial";
	}

	@Override
	public int getQuantidadeDeParametros() {
		// TODO Auto-generated method stub
		return 1;
	}

}
