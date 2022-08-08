package pasta1;

import pasta2.Calculadora;

public class Principal extends Calculadora {

    public static void main(String[] args) {

        Calculadora calc = new Calculadora();

        int resultado = calc.soma(10, 20);

        System.out.println(resultado);

        resultado = calc.soma(200, 400);

        System.out.println(resultado);

       int resultadoSubtracao = calc.subtrair(100 , 10);

        System.out.println(resultadoSubtracao);


        String resultadoString = obterNome("Stephany");

        System.out.println(resultadoString);

//        System.out.printf("Multiplicação é : %.2f", calc.multiplicar(10D,10D));
    }

    public static String obterNome(String nome){
        return "Seu nome é : " + nome;
    }

}
