public class actividad2 {
    /*Mis amigos : Guarde en variables el nombre de N cantidad de amigos, itere sobre
esa cantidad mostrando el nombre de cada amigo */
public static void main(String[] args) {
    String amigo1 = "Juan";
    String amigo2 = "Kevin";
    String amigo3 = "Gonzalo";
    String amigo4 = "Ezequiel";
    String amigo5 = "Lionel"; 
    int numeroAmigos = 4;
    if (numeroAmigos <= 5 && numeroAmigos >= 1){
        switch(numeroAmigos){
            case(1):
            System.out.println("Hola soy tu amigo: " + amigo1);
                break;
            case(2):
            System.out.println("Hola soy tu amigo: " + amigo2);
                break;
            case(3):
            System.out.println("Hola soy tu amigo: " + amigo3);
                break;
            case(4):
            System.out.println("Hola soy tu amigo: " + amigo4);
                break;
            case(5):
            System.out.println("Hola soy tu amigo: " + amigo5);
                break;

    }
    }else System.out.println("El numero introducido es incorrecto ");
    
}
}
