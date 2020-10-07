/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;
//import java.io.*;
import Interfaz.*;
import Data.*;
/**
 *
 * @author ASUS PC
 */
public class PetCity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion1=0;
        int opcion2=0;
        int opcion3=0;
        LinkedQueue<Mascota> mascotas=new LinkedQueue<Mascota>();
        while(opcion1 < 3){
         opcion1 = Menu.primerMenu();

            switch(opcion1){

            case 1:
                while(opcion2 < 3){
                    opcion2 = Menu.segundoMenu();
                    switch(opcion2)
                    {
                        case 1:
                        System.out.println("Usted ya está registardo");
                        break;
                        case 2:
                        System.out.println("Usted no está registardo");
                        break;
                        case 3:
                        break;
                    } 
                }
                opcion2 = 0; 
            break;

            case 2:
                while(opcion3 < 3){
                    opcion3 = Menu.tercerMenu();
                    switch(opcion3)
                    {   
                        case 1:
                        Mascota animal = Logica.regMascota();
                        mascotas.enqueue(animal);
                        break;
                        case 2:
                        mascotas.imprimirTodos();
                        break;
                        case 3:
                        break;
                    }
                }
                opcion3 = 0;
                
            break;

            case 3: 
            break;
            }
        }
    }
}
