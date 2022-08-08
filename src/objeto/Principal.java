package objeto;

public class Principal {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        int mesAno = 14;

        //imprimirNomeMesUsandoIf(13);

        imprimirNomeMesUsandoSwitch(mesAno);

        String cor = "Verde";

        switch (cor){
            case "Vermelho":
                System.out.println(cor);
                break;
            case "Amarelo":
                System.out.println(cor);
                break;
            default:
                System.out.println("Não é cor nem Vermelho e nem Amarelo");

        }

    }


    private static void imprimirNomeMesUsandoIf(int mesAno){
        if(mesAno == 1){
            System.out.println("Janeiro");
        }

        if(mesAno == 2){
            System.out.println("Fevereiro");
        }

        if(mesAno == 3){
            System.out.println("Março");
        }

        if(mesAno == 4){
            System.out.println("Abril");
        }

        if(mesAno == 5){
            System.out.println("Maio");
        }

        if(mesAno == 6){
            System.out.println("Junho");
        }

        if(mesAno == 7){
            System.out.println("Julho");
        }

        if(mesAno == 8){
            System.out.println("Agosto");
        }

        if(mesAno == 9){
            System.out.println("Setembro");
        }

        if(mesAno == 10){
            System.out.println("Outubro");
        }

        if(mesAno == 11){
            System.out.println("Novembro");
        }

        if(mesAno == 12){
            System.out.println("Dezembro");
        }
    }


    private static void imprimirNomeMesUsandoSwitch(int mesAno){

        switch (mesAno){
            case 1:
                System.out.println("Janeiro");
                break;
            case 2:
                System.out.println("Fevereiro");
                break;
            case 3:
                System.out.println("Março");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Maio");
                break;
            case 6:
                System.out.println("Junho");
                break;
            case 7:
                System.out.println("Julho");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Setembro");
                break;
            case 10:
                System.out.println("Outubro");
                break;
            case 11 :
                System.out.println("Novembro");
                break;
            case 12:
                System.out.println("Dezembro");
                break;
            default:
                System.out.println("Burro não existe o mês :" + mesAno);
        }
    }

}
