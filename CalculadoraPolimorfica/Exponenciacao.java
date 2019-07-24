package program;

public class Exponenciacao extends Operacao {

	@Override
	public double calcular(double[] n) {
		return Math.pow(n[0], n[1]);
	}

	@Override
	public String getDescricao() {
		return "Exponenciação";
	}
	
	@Override
	public int getQuantidadeDeParametros() {
		// TODO Auto-generated method stub
		return 2;
	}

}
