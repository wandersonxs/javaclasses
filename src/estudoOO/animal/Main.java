package estudoOO.animal;

public class Main {

    public static void main(String[] args) {

        Mamifero mamifero = new Mamifero();
        Gato gato = new Gato();
        Humano humano = new Humano();

        mamifero.setIdade(10);
        System.out.println(mamifero.getIdade());

        gato.setIdade(10);
        gato.setPeso(5.5f);
        gato.setCorPelo("VERMELHO");

        humano.setIdade(45);
        humano.setPeso(80.0f);
        humano.setTomVoz("AGUDO");

        System.out.println("Gato Peso :" + gato.getPeso() + " Cor Pelo : " + gato.getCorPelo() + " Idade : "+ gato.getIdade());
        System.out.println("Humano Peso :" + humano.getPeso() + " Tom Voz : " + humano.getTomVoz() + " Idade : "+ humano.getIdade());

    }

}
