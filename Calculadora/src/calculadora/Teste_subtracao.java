package calculadora;

public class Teste_subtracao {

	public static void main(String[] args) {
		calculadora calc = new calculadora();
		
		//cenario de teste 1: Subtração de dois valores.
		int sub = calc.subtracao(7,3);
		System.out.println(sub);
		
		
		//cenario de teste 2: Subtração de dois valores sendo um deles igual a zero.
		sub = calc.subtracao(2, 0);
		System.out.println(sub);
		
		
		//cenario de teste 3: Subtração de dois numeros iguais.
		sub = calc.subtracao(3, 3);
		System.out.println(sub);
		
		
		//cenario de teste 4: Subtração de dois valores sendo um deles negativo
		sub = calc.subtracao(5, -5);
		System.out.println(sub);

	}

}
