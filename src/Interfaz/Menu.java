package Interfaz;
import  java.util.*;
import  Data.*;

/**
 * Menu
 */
public class Menu {
    static Scanner reader = new Scanner (System.in);
    public static int tryCatchMenu (int numa){
        
        int n = 0;
        try
        {
            n = reader.nextInt();
            if(n >= 1 && n<=numa ){
                return n;
            }
            else{
                System.out.println("/////Ingreso una opcion inexistente/////");
                return 0;
            }
        }
        catch(Exception e)
        {
            System.out.println("/////Ingreso un tipo de dato incorrecto/////");
            return 0;
        } 
    }
    public static int tryCatchMenu (){
        try{
            int n=reader.nextInt();
                return n;
        }
        catch(Exception e){
            System.out.println("/////Ingreso un tipo de dato incorrecto/////");
            return 0;
        } 
    }
    public static int primerMenu(){
        int num=0;
        while (num==0){
            System.out.println("=======================================");
            System.out.println("        BIENVENIDO A PET CITY");
            System.out.println("=======================================\nIngrese una de las siguientes opciones:");
            System.out.println("1. Si desea adoptar una mascota");
            System.out.println("2. Si usted es funcionario del refugio");
            System.out.println("3. Salir");
            num = tryCatchMenu(3);
        }
        return num;
    }
    public static int segundoMenu(){
        int num=0;
        while(num==0){
            System.out.println("Marque una de las siguientes opciones:");
            System.out.println("1. Si usted está registrado");
            System.out.println("2. Si usted no está registardo");
            System.out.println("3. Volver al menú anterior");
            num = tryCatchMenu(3);
        }
        return num; 
    }
    
    public static int tercerMenu(){
        int num =0;
        while(num==0){
            System.out.println("=======================================");
            System.out.println("           Menú del refugio");
            System.out.println("=======================================\nIngrese una de las siguientes opciones:");
            System.out.println("1. Registrar una mascota");
            System.out.println("2. Ver todas las mascotas");          
            System.out.println("3. Regresar al menú anterior");
            num= tryCatchMenu(3);
        }
        return num; 
    }
    public static Mascota regMascota()
    {
        System.out.println("Ingrese el nombre de la nueva mascota");
        String nombre=reader.next();
        int i=0;
        while(i==0){
            System.out.println("ingrese la edad:");
            i=tryCatchMenu();
        }
        int a=-1;
        while(a==-1){
            System.out.println("oprima 1 si no tiene vacunas o 2 si las tiene.");
            a=tryCatchMenu(2)-1;
        }
        boolean vacunas;
        if(a==0) vacunas=false;
        else vacunas=true;
        return new Mascota(i,nombre,vacunas);
    }
}