public class Main {
    public static void main(String[] args){
        Persona p1 = new Persona();
        p1.setNombre("Tobias");
        p1.setEdad(2);
        p1.setTelefono("0987654321");
        System.out.println(p1.getNombre());
        System.out.println(p1.getEdad());
        System.out.println(p1.getTelefono());
    }
}
class Persona{
    private int edad;
    private String nombre,telefono;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
