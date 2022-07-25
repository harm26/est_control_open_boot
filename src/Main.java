public class Main {
    public static void main(String[] args) {
        System.out.println("condicion if-----------------");
        int numeroIf = 4;

        if (numeroIf > 0){
            System.out.println("El numero es positivo");
        } else if (numeroIf<0) {
            System.out.println("El numero es negativo");

        }else System.out.println("el numero es 'o'");

        System.out.println("bucle while");

        int numeroWhile = 0;

        while (numeroWhile<3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }
        System.out.println("bucle do while----------------------");

        int numDoWhile = 1;
        do {
            System.out.println(numDoWhile);
            numDoWhile--;
        }
        while ( numDoWhile > 0);

        System.out.println("bucle for-----------------");


        for (int numeroFor = 0; numeroFor <= 3 ; numeroFor++) {
            System.out.println(numeroFor);
        }
        System.out.println("condicional switch----------------");

        String estacion = "verano";

        switch (estacion){
            case "verano":
                System.out.println("es verano");
                break;
            case "invierno":
                System.out.println("es invierno");
                break;

            case "primavera":
                System.out.println("es primavera");
                break;

            case "otonño":
                System.out.println("es otonño");
                break;

            default:
                System.out.println("no hay estacion");
        }
}
}


