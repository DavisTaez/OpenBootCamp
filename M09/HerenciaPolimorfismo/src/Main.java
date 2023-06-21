public class Main {
    public static void main(String[] args){
        //creacion de objeto y asignación de propiedades de la clase cliente
        Cliente cliente = new Cliente();
        cliente.setNombre("Fabricio");
        cliente.setEdad(35);
        cliente.setTelefono("0987654321");
        cliente.setCredito(400);
        System.out.println("El cliente: "+cliente.getNombre()+
                "\nCon edad: "+cliente.getEdad()+
                "\nNumero de teléfono: "+cliente.getTelefono()+
                "\nTiene un crédito de: "+cliente.getCredito());
        //creacion de objeto y asignación de propiedades de la clase trabajador
        Trabajador trabajador = new Trabajador();
        trabajador.setNombre("Lorena");
        trabajador.setEdad(28);
        trabajador.setTelefono("0912345678");
        trabajador.setSalario(580);
        System.out.println("El trabajor@: "+trabajador.getNombre()+
                "\nCon edad: "+trabajador.getEdad()+
                "\nNumero de teléfono: "+trabajador.getTelefono()+
                "\nTiene un salario de: "+trabajador.getSalario());
    }

}
class Persona{
    private int edad;
    private String nombre, telefono;
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

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
}

class Cliente extends Persona{
    private int credito;

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }
}

class Trabajador extends Persona{
    private int salario;

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}