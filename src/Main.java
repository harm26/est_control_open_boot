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

        System.out.println("ejercicio con la class Persona desde aqui------------------");

        Persona persona = new Persona();

        persona.setEdad(46);
        System.out.println("la edad de persona es: " + persona.getEdad());
        persona.setNombre("Humberto");
        System.out.println("Su nombre es: " + persona.getNombre());
        persona.setNumTelefono(123123);
        System.out.println("y su numero de telefono es: " + persona.getNumTelefono());

        System.out.println("class Cliente");

        Cliente cliente = new Cliente();

        cliente.setEdad(46);
        System.out.println("la edad de cliente es: " + cliente.getEdad());
        cliente.setNombre("Humberto");
        System.out.println("Su nombre es: " + cliente.getNombre());
        cliente.setNumTelefono(123123);
        System.out.println("y su numero de telefono es: " + cliente.getNumTelefono());
        cliente.setCredito(1000);
        System.out.println("El credito del cliente es hasta: $" + cliente.getCredito());



}
}

class Persona{
    private int edad;
    private String nombre;
    private int numTelefono;

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(int numTelefono) {
        this.numTelefono = numTelefono;
    }
}

class Cliente extends Persona {

    private int credito;

    public void setCredito(int credito) {
        this.credito = credito;
    }

    public int getCredito() {
        return credito;
    }
}

class Trabajador extends Persona{
    private int salario;
}




