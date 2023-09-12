package calculadora;

public class Teste_soma {

	public static void main(String[] args) {
		calculadora calc = new calculadora();
		
		
		//cenario de teste 1 : Soma de dois valores.
		int soma = calc.somar(3,7);
		System.out.println(soma);
		
		//cenario de teste 2: Soma de dois valores sendo que um deles zero.
		 soma = calc.somar(3,0);
		System.out.println(soma);
		
		//cenario de teste 3: Soma de dois valores sendo ambos zero.
		 soma = calc.somar(0,0);
		System.out.println(soma);
		
		//cenario de teste 4: Soma de dois valores sendo um deles negativo.
		 soma = calc.somar(3,-1);
		System.out.println(soma);
		

	}

}
