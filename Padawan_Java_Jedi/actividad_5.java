package Padawan_Java_Jedi;

public class actividad_5 {
    /*Conversión a kilogramos: Guarde en un espacio de memoria sus libras y luego, en
otro espacio de memoria realice la conversión de esas libras a kilogramos. Utilice
una constante de los valores que no van a cambiar en esta conversión. Muestre el
resultado por pantalla
 */
public static void main(String[] args) {
    double miPeso = 182.98;

    final double conversion_kilogramos = miPeso * 0.453592;
    System.out.println("Mi peso en libras es: " + miPeso + " convertido a kilogramos sería: " + conversion_kilogramos + "kg");
}
}
