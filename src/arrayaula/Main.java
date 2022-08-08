package arrayaula;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String[] listaFilmes = {"Matrix", "Senhor dos Anéis", "Maradona", "Pelé"};

        List<String> lista = new ArrayList<>();



        for(int i = 0 ; i < listaFilmes.length; i++){
            // Scope
            if( i == 1){
                continue;
            }
            System.out.println(listaFilmes[i]);

        }

//        for(String filme : listaFilmes){
//            System.out.println(filme);
//        }
    }

}
