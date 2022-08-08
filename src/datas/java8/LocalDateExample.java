package datas.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateExample {

    public static void main(String[] args) {

        LocalDate localDate1 = LocalDate.of(2021, 03,15);
        LocalDate localDate2 = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDate1);
        System.out.println(localDate2);
        System.out.println(localDateTime);

        localDateTime =  localDate1.atTime(20,05);

        System.out.println(localDateTime);

        int resultado = localDate2.compareTo(localDate1);

        System.out.println(resultado);


    }

}
