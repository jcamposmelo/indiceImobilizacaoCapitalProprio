public class imobilizacaoCapitalProprio {
	public static void main(String[] args) {
		double ativoPermanente = 2190000;
		double patrimonioLiquido = 13500000;

		double imobilizacaoCapitalProprio;

		imobilizacaoCapitalProprio = ativoPermanente / patrimonioLiquido;

		System.out.println("O índice calculado em Imobilização do Capital Próprio é?  " + 
				imobilizacaoCapitalProprio);
	}

}