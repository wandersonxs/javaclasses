package comparator;

import java.util.*;

public class ComparatorBeforeJava8 {

    public static void main(String[] args) {
//        ListaInteiros();
//        ListaString();
        ListaStringLambda();
    }

    private static void ListaString(){

        List<String> nomes = new ArrayList<>();

        nomes.add("Wanderson");
        nomes.add("anderson");
        nomes.add("Enderson");
        nomes.add("Alexander");
        nomes.add("Stephany");
        nomes.add("Caroline");

        Collections.sort(nomes, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.toLowerCase().compareTo(o2.toLowerCase());
            }
        });

        nomes.forEach(System.out::println);
    }


    private static void ListaInteiros(){
        List<Integer> inteiros = new ArrayList<>();
        inteiros.add(10);
        inteiros.add(1);
        inteiros.add(3);
        inteiros.add(6);
        inteiros.add(8);
        inteiros.add(4);
        inteiros.add(5);
        inteiros.add(9);
        inteiros.add(7);
        inteiros.add(2);

//        Collections.sort(inteiros, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2.compareTo(o1);
//            }
//        });

        Collections.sort(inteiros, null);

        inteiros.forEach(System.out::println);

    }

    private static void ListaStringLambda(){

        List<String> nomes = new ArrayList<>();

        nomes.add("Wanderson");
        nomes.add("anderson");
        nomes.add("Enderson");
        nomes.add("Alexander");
        nomes.add("Stephany");
        nomes.add("Caroline");

        nomes.sort(Comparator.comparing(String::toUpperCase));
        nomes.sort(Comparator.comparing(String::length));

        nomes.forEach(System.out::println);
    }

}
