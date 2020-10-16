package Interfaz;
import  java.util.*;
//import  Data.*;

/**
 * Menu
 */
public class Menu {

    public static int tryCatchMenu (int numa){
        Scanner reader = new Scanner (System.in);
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
        Scanner reader = new Scanner (System.in);
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
        int num = 0;
        while(num == 0){
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
        int num = 0;
        while(num == 0){
            System.out.println("Marque una de las siguientes opciones:");
            System.out.println("1. Si usted está registrado");
            System.out.println("2. Si usted no está registardo");
            System.out.println("3. Volver al menú anterior");
            num = tryCatchMenu(3);
        }
        return num;
    }
    public static int quintoMenu(){
        int num = 0;
        while(num == 0){
            System.out.println("Marque una de las siguientes opciones:");
            System.out.println("1. Deseo adoptar a esta mascota");
            System.out.println("2. No deseo adoptar a esta mascota");
            
            num = tryCatchMenu(2);
        }
        return num;
    }
    
    public static int tercerMenu(){
        int num = 0;
        while(num == 0){
            System.out.println("=======================================");
            System.out.println("           Menú del refugio");
            System.out.println("=======================================\nIngrese una de las siguientes opciones:");
            System.out.println("1. Registrar una mascota");
            System.out.println("2. Ver todas las mascotas");          
            System.out.println("3. Regresar al menú anterior");
            num = tryCatchMenu(3);
        }
        return num;
    }
    public static int menuCliente(){
        int num = 0;
        while(num == 0){
            System.out.println("=======================================");
            System.out.println("           Bienvenido de nuevo");
            System.out.println("=======================================\nIngrese una de las siguientes opciones:");
            System.out.println("1. Quiero adoptar una mascota");
            System.out.println("2. Quiero irme de aquí (No aguanto ni un segundo más)");          
            System.out.println("3. Regresar al menú anterior");
            num = tryCatchMenu(3);
        }
        return num;
    }
   
}