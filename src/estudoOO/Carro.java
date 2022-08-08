package estudoOO;

public class Carro {

    private static int contador = 0;
    private String modelo;

    public static int getContador() {
        return contador;
    }

    public static void incrementarContador() {
        Carro.contador++;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void teste(){
        String modelo = "BMW";
        this.modelo = modelo;
        System.out.println(this.modelo);
        System.out.println(modelo);
    }

    public String getQualquerString(){
        return "É ISSO AI";
    }
}
