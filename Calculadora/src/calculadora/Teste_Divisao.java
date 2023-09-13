package calculadora;

public class Teste_Divisao {

	public static void main(String[] args) {
		calculadora calc = new calculadora();
		
		//cenario de teste 1:Divisão de dois valores.
		int div = calc.divisao(4, 2);
		System.out.println(div);
		
		//cenario de teste 2: Divisão de dois valores sendo o dividendo menor que o divisor.
		div = calc.divisao(1, 2);
		System.out.println(div);
		
		//cenario de teste 3: Divisão de dois valroes iguais.
		div = calc.divisao(2, 2);
		System.out.println(div);
		
		//cenario de teste 4: Divisão de dois valores sendo o dividendo igual a zero.
		div = calc.divisao(0, 2);
		System.out.println(div);
	}

}
