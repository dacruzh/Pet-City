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
        int opcion4=0;
        int opcion5=0;
        LinkedQueue<Mascota> mascotas=new LinkedQueue<Mascota>();
        StackArray <Cliente> clientes =new StackArray<Cliente>(10);
        while(opcion1 < 3){
         opcion1 = Menu.primerMenu();

            switch(opcion1){

            case 1:
                while(opcion2 < 3){
                    opcion2 = Menu.segundoMenu();
                    switch(opcion2)
                    {
                        case 1:
                        System.out.println("Ingrese su ID");
                        int IDcual = Menu.tryCatchMenu();
                        int loquesea = clientes.find(new Cliente(IDcual));
                        if (loquesea!=-1){
                            opcion4 = Menu.menuCliente();
                            switch(opcion4){
                                case 1:
                                
                                if (mascotas.peek()==null){
                                    System.out.println("Disculpe, no tenemos mascotas en este momento");
                                }else{
                                    System.out.println("Esta es la mascota que te tal cosa");
                                    System.out.println(mascotas.peek());
                                }
                                
                                opcion5 = Menu.quintoMenu();
                                switch(opcion5){
                                    case 1:
                                        mascotas.dequeue();
                                        System.out.println("Su mascota ha sido correctamente adoptada");
                                        System.out.println("Esperamos que sean felices juntos");
                                        System.out.println("Vuelva pronto");
                                    case 2:
                                    
                                }
                                

                                case 2:
                                    if (clientes.eliminate(loquesea)){
                                        System.out.println("Ha sido correctamente eliminado");
                                    }else{
                                        System.out.println("No ha sido eliminado");
                                    }
                            }
                        }else{
                            System.out.println("Usted no está registrado");
                        }

                        break;
                        case 2:
                            clientes.push(Logica.registrarCliente());                     
                            //System.out.println("Usted ha sido correctamente registrado");
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
