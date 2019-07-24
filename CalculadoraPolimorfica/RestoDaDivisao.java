package program;

public class RestoDaDivisao extends Operacao {

	@Override
	public double calcular(double[] n) {
		return n[0] % n[1];
	}

	@Override
	public String getDescricao() {
		return "Resto da divisão";
	}
	
	@Override
	public int getQuantidadeDeParametros() {
		// TODO Auto-generated method stub
		return 2;
	}

}
