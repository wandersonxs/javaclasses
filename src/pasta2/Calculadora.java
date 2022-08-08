package pasta2;

public class Calculadora extends Object{

    public int soma(int a , int b){
        return a + b;
    }

    public int subtrair(int a, int b){
        return a - b;
    }

    public Object multiplicarPrivate(){
        return multiplicar(100D, 200D);
    }


     protected Double multiplicar ( Double a, Double b){
        return a * b;
    }


}
