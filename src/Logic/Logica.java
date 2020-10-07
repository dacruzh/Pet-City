package Logic;
import  java.util.*;
import  Data.*;
import Interfaz.*;

public class Logica {
    
    
    
    public static Mascota regMascota(){
        Scanner reader = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la nueva mascota");
        String nombre = reader.next();
        int i = 0;
        while(i == 0){
            System.out.println("Ingrese la edad:");
            i = Menu.tryCatchMenu();
        }
        int a = -1;
        while(a == -1){
            System.out.println("Oprima 1 si no tiene vacunas o 2 si las tiene.");
            a = Menu. tryCatchMenu(2)-1;
        }
        boolean vacunas;
        if(a == 0) vacunas = false;
        else vacunas = true;
        reader.close();
        return new Mascota(i,nombre,vacunas);
        
    }
}
