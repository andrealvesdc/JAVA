package program;

public class Soma extends Operacao{

	@Override
	public double calcular(double[] n) {
		return n[0] + n[0];
	}

	@Override
	public String getDescricao() {
		return "Soma";
	}

	@Override
	public int getQuantidadeDeParametros() {
		// TODO Auto-generated method stub
		return 2;
	}
	

}

