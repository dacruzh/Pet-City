/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;
import java.io.*;
import java.util.Scanner;
import Interfaz.*;
/**
 *
 * @author ASUS PC
 */
public class PetCity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num=0;
        int opcion1=0;
        int opcion2=0;
        int opcion3=0;
        while(num==0){
         opcion1 = Menu.primerMenu();

            switch(opcion1){

            case 1:
                opcion2 = Menu.segundoMenu();
                    switch(opcion2)
                    {
                        case 1:
                        System.out.println("Usted ya está registardo");
                        break;
                        case 2:
                        System.out.println("Usted no está registardo");
                        break;
                    }
            break;

            case 2:
                opcion3 = Menu.tercerMenu();
                switch(opcion3)
                    {
                        case 1:
                        System.out.println("Usted desea registrar una mascota");
                        break;
                    }
            break;
            case 3:
            num = 1; 
            break;
        }
    }
    }
}
