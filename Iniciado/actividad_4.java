public class actividad_4 {
    public static void main(String[] args) {
        /*Cálculo de divisibilidad: Se le solicita que guarden dos números enteros y los
sumen, determine si el primer número es divisible por el segundo número y muestre
el resultado.
 */

        int num1 = 45;
        int num2 = 90;
        var divisible = num1 % num2 == 0 ? "Si" : "No";
        System.out.println("El primer numero " + divisible + " es divisible por el segundo número" );


    }
}
