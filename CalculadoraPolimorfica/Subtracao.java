package program;

public class Subtracao extends Operacao{

	@Override
	public double calcular(double[] n) {
		return n[0] - n[1];
	}

	@Override
	public String getDescricao() {
		return "Subtração";
	}
	
	@Override
	public int getQuantidadeDeParametros() {
		// TODO Auto-generated method stub
		return 2;
	}

}
