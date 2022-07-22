package tema8;

public class ExerTema8 {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.setEdad(15);
        persona1.setNombre("El bicho");
        persona1.setTelefono("7462465");
        System.out.println("Edad....: "+persona1.getEdad());
        System.out.println("Nombre..: "+persona1.getNombre());
        System.out.println("Teléfono: "+persona1.getTelefono());
    }
}

class Persona {
    private int edad;
    private String nombre, telefono;

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad(){
        return this.edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getTelefono(){
        return this.telefono;
    }
}
