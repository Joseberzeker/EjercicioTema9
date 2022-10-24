/**
 * Ejercicio Tema #9
 * Estudiante: Jose Luis Ahumada Navarro
 * Curso: Introducción a la programación
 * OpenBootcamp - 2022
 */


public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNombre("Jose");
        cliente.setEdad(24);
        cliente.setTelefono(12345667);
        cliente.IsCredito(true);

        var nombre = cliente.getNombre();
        var edad = cliente.getEdad();
        var telefono = cliente.getTelefono();
        var credito = cliente.getCredito();
        System.out.println("Nombre del cliente: " + nombre);
        System.out.println("Edad del cliente: " + edad);
        System.out.println("Telefono del cliente: " + telefono);
        System.out.println("Credito del cliente: " + credito);

        Trabajador trabajador = new Trabajador();
        trabajador.setSalario(5412.98);
        trabajador.setNombre("Luis");
        trabajador.setEdad(43);
        trabajador.setTelefono(111222);

        var nombreTrabajador = trabajador.getNombre();
        var edadTrabajador = trabajador.getEdad();
        var telefonoTrabajador = trabajador.getTelefono();
        var salario = trabajador.getSalario();

        System.out.println("Nombre del Trabajador: " + nombreTrabajador);
        System.out.println("Edad del Trabajador: " + edadTrabajador);
        System.out.println("Telefono del Trabajador: " + telefonoTrabajador);
        System.out.println("Salario del Trabajador: " + salario);
    }
}

class Persona{
    private int edad;
    private String nombre;
    private int telefono;

    //Getters
    public int getEdad(){
        return this.edad;
    }

    public String getNombre(){
        return this.nombre;
    }

    public int getTelefono(){
        return this.telefono;
    }

    //Setters

    public void setEdad(int edad){
        this.edad = edad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
}

class Cliente extends Persona{
    private boolean credito;

    //Getter
    public boolean getCredito(){
        return this.credito;
    }

    //Setter
    public void IsCredito(boolean credito){
        this.credito = credito;
    }
}

class Trabajador extends Persona{
    private double salario;

    //Getter
    public double getSalario(){
        return this.salario;
    }

    //Setter
    public void setSalario(double salario){
        this.salario = salario;
    }
}

