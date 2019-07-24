package program;

public class Divisao extends Operacao{

	@Override
	public double calcular(double[] n) {
		if (n[1] == 0) {
			throw new DivisaoPorZeroException();
		}
		return n[0] / n[1];
	}

	@Override
	public String getDescricao() {
		return "divisão";
	}
	
	@Override
	public int getQuantidadeDeParametros() {
		// TODO Auto-generated method stub
		return 2;
	}
	
}
