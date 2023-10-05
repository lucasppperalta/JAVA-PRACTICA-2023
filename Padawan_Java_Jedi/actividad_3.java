package Padawan_Java_Jedi;

public class actividad_3 {
    /*Caracteres : Guarde en distintos espacios de memoria los caracteres de su nombre
en unicode y luego imprimirlos por pantalla. ¿Por qué no puede usar "" en el char?
¿Qué es unicode? */
public static void main(String[] args) {
    char letra1 = '\u004C';
    char letra2 = '\u0075';
    char letra3 = '\u0063';
    char letra4 = '\u0061';
    char letra5 = '\u0073';
    
    System.out.println(letra1);
    System.out.println(letra2);
    System.out.println(letra3);
    System.out.println(letra4);
    System.out.println(letra5);
}
}
