package tema9;

public class ExerTema9 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        cliente1.edad = 25;
        cliente1.nombre = "Carlitos";
        cliente1.telefono = "7487465";
        cliente1.credito = 265.4;

        System.out.println(
                "=> Cliente "+ cliente1.nombre +"\n"+
                "       Edad........: "+ cliente1.edad + "\n" +
                "       Teléfono....: " + cliente1.telefono + "\n" +
                "       Crédito (S/): " + cliente1.credito
        );

        Trabajador trabajador1 = new Trabajador();
        trabajador1.edad = 35;
        trabajador1.nombre = "Pedrito";
        trabajador1.telefono = "4568214";
        trabajador1.salario = 1250;

        System.out.println(
                "=> Trabajador "+ trabajador1.nombre +"\n"+
                "       Edad........: "+ trabajador1.edad + "\n" +
                "       Teléfono....: " + trabajador1.telefono + "\n" +
                "       Crédito (S/): "  + trabajador1.salario
        );

    }
}

class Persona {
     int edad;
     String nombre, telefono;
}

class Cliente extends Persona {
    double credito;
}

class Trabajador extends Persona {
    double salario;
}