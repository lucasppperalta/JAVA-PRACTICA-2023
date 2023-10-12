public class actividad6 {
    /*A mi me gustan los apres: Escribe un programa que imprima solo los N números
pares, donde los N números son guardados en variables o constantes según
corresponda.
 */
public static void main(String[] args) {
    int numero1 = 12;
    int numero2 = 17;
    int numero3 = 45;
    int numero4 = 13;
    int numero5 = 18;
    int numero6 = 120;
    int numero7 = 149;
    int numero8 = 156;
    int[] numeros = {numero1,numero2,numero3,numero4,numero5,numero6,numero7,numero8}; 
    int i = 0;
    while (i < numeros.length){
        i++;
        if(numeros[i] % 2 == 0){
        System.out.println("Los numeros pares son: "  + numeros[i]);
        }
    }
} 
}
