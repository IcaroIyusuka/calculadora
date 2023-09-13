package calculadora;

public class Teste_Multiplicacao {

	public static void main(String[] args) {
		calculadora calc = new calculadora();
		
		
		//cenario de teste 1: Multiplicação de dois valores.
		int mult = calc.multiplicacao(8, 7);
		System.out.println(mult);
		
		//cenario de teste 2: Multiplicação de dois valores sendo que um deles igual a zero.
		mult = calc.multiplicacao(9, 0);
		System.out.println(mult);
		
		//cenario de teste 3: Multiplicação de dois numeros sendo os dois iguais a zero.
		mult = calc.multiplicacao(0, 0);
		System.out.println(mult);
		
		//cenario de teste 4: Multiplicação de dois valores sendo um deles negativo.
		mult = calc.multiplicacao(8, -7);
		System.out.println(mult);
	}

}
