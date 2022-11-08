import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        carro a = new carro();
        System.out.println("Anio: " + a.getAnio());
        a.setAnio(2008);
        System.out.println("Anio: " + a.getAnio());
        System.out.println("Color: " + a.getColor());
        a.setColor("Amarillo");
        System.out.println("Color: " + a.getColor());
        System.out.println("Marca: " + a.getMarca());
        a.setMarca("Chevrolet");
        System.out.println("Marca: " + a.getMarca());
    }
/*
        Jugador p = new Jugador();
        System.out.println("Nombre: " + p.getName());
        p.setName("Carlos");
        System.out.println("Nombre: " + p.getName());
        System.out.println("Fuerza: " + p.getFuerza());
        System.out.println("Velocidad: " + p.getVelocidad());
        System.out.println("Regate: " + p.getRegate());
        Jugador a = new Jugador();
        System.out.println("Nombre: " + a.getName());
        a.setName("Javier");
        System.out.println("Nombre: "+a.getName());
        System.out.println("Fuerza: " + a.getFuerza());
        System.out.println("Velocidad: " + a.getVelocidad());
        System.out.println("Regate: " + a.getRegate());
       */
}