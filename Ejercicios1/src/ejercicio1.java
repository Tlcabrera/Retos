import java.util.Scanner;

public class ejercicio1 {
    //atributos

    //metodos
    public static void main(String[] args) {
        //declarar variables
        String nombreAnimal,especie;
        int edad,peso=0;
        //crear objetos
        Scanner capturar=new Scanner(System.in);
        //Solicitar datos
        System.out.println("Por favor digite el nombre de su animal");
        //capturar los datos
        nombreAnimal=capturar.nextLine();
        //solicitar datos
        System.out.println("Por favor digite la especie de su animal");
        //capturar los datos
        especie=capturar.nextLine();
        //solicitar datos
        System.out.println("Por favor digite la edad de su animal");
        //capturar los datos
        edad=capturar.nextInt();
        //operaciones o procesos
        peso=edad*50;
        //imprimir resultados
        System.out.println("Su animal "+nombreAnimal+" de la especie "+especie+" de edad "+edad+" esta pesando "+peso);
        capturar.close();
    }
    
}


