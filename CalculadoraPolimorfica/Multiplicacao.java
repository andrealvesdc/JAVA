package program;

public class Multiplicacao extends Operacao{

	@Override
	public double calcular(double[] n) {
		return n[0] * n[1];
	}

	@Override
	public String getDescricao() {
		return "Multipli��o";
	}
	
	@Override
	public int getQuantidadeDeParametros() {
		// TODO Auto-generated method stub
		return 2;
	}

}
