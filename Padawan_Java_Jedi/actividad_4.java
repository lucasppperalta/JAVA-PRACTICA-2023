package Padawan_Java_Jedi;

public class actividad_4 {
    /*Promedio de edad : Guarde en diferentes espacios de memoria distintos valores de
edad y los nombres de esas personas, luego saque su promedio e imprima por
pantalla el nombre de la persona, su edad. Por último imprimir el promedio de sus
edades. */
public static void main(String[] args) {
    int edad1 = 50;
    var nombre1 = "Oscar";
    int edad2 = 25;
    var nombre2 = "Micaela";
    int edad3 = 38;
    var nombre3 = "Ismael";
    int edad4 = 12;
    var nombre4 = "Thiago";
    var sumaEdad = edad1 + edad2 + edad3 + edad4;
    var promedio = sumaEdad / 4;
    System.out.println("El primer nombre es " + nombre1 + " y tiene " + edad1 + " años");
    System.out.println("El segundo nombre es " + nombre2 + " y tiene " + edad2 + " años");
    System.out.println("El tercero nombre es " + nombre3 + " y tiene " + edad3 + " años");
    System.out.println("El cuarto nombre es " + nombre4 + " y tiene " + edad4 + " años");
    System.out.println("El promedio total de edades es " + promedio);
}
}
