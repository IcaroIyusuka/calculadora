package calculadora;

public class calculadora_teste_geral {

	public static void main(String[] args) {
		calculadora calc = new calculadora();
		
		System.out.println("Area do teste de soma");
		
		
		int soma = calc.somar(3,7);
		System.out.println(soma);
		
		
		 soma = calc.somar(3,0);
		System.out.println(soma);
		
		
		 soma = calc.somar(0,0);
		System.out.println(soma);
		
		
		 soma = calc.somar(3,-1);
		System.out.println(soma);
		
		
		
		System.out.println("------------------------------------------------------------------");
		
		
		System.out.println("Area do teste de Subtração");
		
		
		int sub = calc.subtracao(7,3);
		System.out.println(sub);
		
		
		sub = calc.subtracao(2, 0);
		System.out.println(sub);
		
		sub = calc.subtracao(3, 3);
		System.out.println(sub);
		
		sub = calc.subtracao(5, -5);
		System.out.println(sub);
		
		
		System.out.println("------------------------------------------------------------------");
		
		
		System.out.println("Area do teste de multiplicação");
		
		double mult = calc.multiplicacao(8, 7);
		System.out.println(mult);
		
		mult = calc.multiplicacao(9, 0);
		System.out.println(mult);
		
		mult = calc.multiplicacao(0, 0);
		System.out.println(mult);
		
		mult = calc.multiplicacao(8, -7);
		System.out.println(mult);
		
System.out.println("------------------------------------------------------------------");
		
		
		System.out.println("Area do teste de Divisão");
		
		double div = calc.divisao(4, 2);
		System.out.println(div);
		
		div = calc.divisao(1, 2);
		System.out.println(div);
		
		div = calc.divisao(2, 2);
		System.out.println(div);
		
		div = calc.divisao(0, 2);
		System.out.println(div);
	}

}
