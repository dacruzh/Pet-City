package Interfaz;
import  java.util.*;
import  Data.*;

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
    public static int primerMenu(){
        int num=0;
        while (num==0){
            System.out.println("Bienvenido a Pet City");
            System.out.println("Si usted desea adoptar una mascota, marque 1");
            System.out.println("Si usted es funcionario del refugio, marque 2");
            System.out.println("Si usted desea salir, marque 3");
            num = tryCatchMenu(3);
        }
        return num;
    }
    public static int segundoMenu(){
        int num=0;
        while(num==0){
            System.out.println("Si usted está registrado, marque 1");
            System.out.println("Si usted no está registardo, marque 2");
            System.out.println("Si quiere volver al menu anterior, marque 3");
            num = tryCatchMenu(3);
        }
        return num; 
    }
    
    public static int tercerMenu(){
        int num =0;
        while(num==0){
            System.out.println("Si desea registrar una mascota nueva, marque 1");
            System.out.println("Si desea regresar, marque 2");
            num= tryCatchMenu(2);
        }
        return num; 
    }
}