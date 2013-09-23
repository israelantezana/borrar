package fizzbuzz;

public class FizzBuzz {

	private static final int _FIZZ = 3;
	private static final int _BUZZ = 5;
	private static final String _MENSAJE_BUZZ = "Buzz";
	private static final String _MENSAJE_FIZZ = "Fizz";
	private static final String _MENSAJE_FIZZ_BUZZ = "FizzBuzz";

	public String generar(int numero) {
		if (esMultiploDe(numero, _FIZZ)&&esMultiploDe(numero, _BUZZ))
			return _MENSAJE_FIZZ_BUZZ;
		if (esMultiploDe(numero, _FIZZ))
			return _MENSAJE_FIZZ;
		if (esMultiploDe(numero, _BUZZ))
			return _MENSAJE_BUZZ;
		return Integer.toString(numero);			
	}

	private boolean esMultiploDe(int numero, int multiplo) {
		return numero % multiplo == 0;
	}

	public String imprimir(int maximo) {
		String resultado = "";
		for (int i = 1; i <= maximo; i++)
			resultado = resultado + generar(i) + "\n";
		return resultado;
	}

}
