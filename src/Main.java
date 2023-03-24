import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String persona1, persona2;
        double altura1, altura2;

        System.out.println("Ingrese el nombre de la primera persona");
        persona1 = scanner.next();
        System.out.println("Ingrese la altura de la primera persona");
        altura1 = scanner.nextDouble();

        System.out.println("Ingrese el nombre de la primera persona");
        persona2 = scanner.next();
        System.out.println("Ingrese la altura de la primera persona");
        altura2 = scanner.nextDouble();

        if(altura1 > altura2) {
            System.out.println("La persona mas alta es: " + persona1);
        }
        else{
            System.out.println("La persona mas alta es: " + persona2);
        }
    }
}