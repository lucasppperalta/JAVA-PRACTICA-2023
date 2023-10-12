public class actividad1 {
        /*1. Triangulo de asteriscos : Se le solicita que creen un programa que imprima un
        triángulo de asteriscos en la consola. Usar bucles.*/
public static void main(String[] args) {
    int num1 = 3;
    System.out.println("*");
    for(int i = 0; i < num1; i++){
        for(int j = 0; j <= i; j++){
            System.out.print('*');
        }
        System.out.println("*");
    }
    
}

}
