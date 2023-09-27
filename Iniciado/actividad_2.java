public class actividad_2 {
    public static void main(String[] args) {
        /* Se les solicita que guarden dos números enteros y los
sumen. 

El resultado guardarlo, mostrarlo por pantalla junto con un mensaje que
indique si se trata de un número par o impar.
 */

        int num1 = 17;
        int num2 = 20;
        int resultado = num1 + num2;
        var paridad = resultado % 2 == 0 ? "Par" : "Impar" ;
        System.out.println("El resultado de sumar " + num1 + " y " + num2 + " es " + resultado + "Y su paridad es " + paridad);



    }
}
