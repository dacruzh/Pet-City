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
        //reader.close();
        return new Mascota(i,nombre,vacunas);
        
    }
    
    public static Cliente registrarCliente(PriorityQueueClass<Cliente> clientes){
        Scanner lector = new Scanner(System.in);
        int IDc = 0;
        while(IDc== 0){
            System.out.println("Ingrese su ID:");
            IDc = Menu.tryCatchMenu();
            if(clientes.find(new Cliente (IDc))!=-1)
            {
                System.out.println("Alguien ya está registrado con ese ID");
                IDc=0;
            }
        }
        System.out.println("Ingrese su nombre");
        String nombreC = lector.next();
        System.out.println("Ingrese su apellido");
        String apellidoC = lector.next();
        System.out.println("Ingrese su contraseña:");
        String contraseñaC = lector.next();
        int edadC = 0;
        while(edadC== 0){
            System.out.println("Ingrese su edad:");
            edadC = Menu.tryCatchMenu();
        }
        
       
        int y = 0;
        while(y == 0){
            System.out.println("Oprima 1 si es hombre, 2 si es mujer o 3 si no se identifica con ninguno de los anteriores.");
            y = Menu. tryCatchMenu(3);
        }
        String generoC="";
        if (y == 1){
            generoC = "Hombre";
        }if (y == 2){
            generoC = "Mujer";
        }if (y == 3){
            generoC = "Otro";
        }/*else{
            System.out.println("/////Ingresó un número incorrecto/////");
        }*/
        //lector.close();
        return new Cliente(nombreC,apellidoC, edadC, IDc, generoC);
    }
    
    public static void fillListPets(PriorityQueueClass<Mascota> petQueue){
         Mascota storni = new Mascota(1,"Storni",true);
        petQueue.insertItem(storni);
        int n=0;
        boolean vacunas=false;
        
        long t0 = System.currentTimeMillis();
        for (int i = 0; i<10000; i++){
            Mascota prueba = new Mascota(n,"prueba",vacunas);
            petQueue.insertItem(prueba);
            n=(n+1)%20;
            if(n%2==0)
                vacunas=false;
            else
                vacunas=true;
        }
        long exTime = System.currentTimeMillis()-t0;
        System.out.println("Llenar linkedQueue con 100 datos: " + exTime);
       
    }
    
    public static void fillListClientes(PriorityQueueClass<Cliente> clientes){
        Cliente Gsus = new Cliente("Daniel", "elgsus", 20, 234500, "Otro");
        clientes.insertItem(Gsus);
        int id=0;
        int n=15;
        long t0 = System.currentTimeMillis();
        for (int i = 0; i<10000; i++){
            clientes.insertItem( new Cliente("John", "Doe", n, id, "Otro"));
        id++;
        n=(n+1)%80;
        if(n<=15)
            n=16;
        }
        long exTime = System.currentTimeMillis()-t0;
        System.out.println("Llenar stackArray con 100000000 datos: " + exTime);
      
    }
    /*public static boolean eliminarCliente(int loquesea, StackArray<T> clientes){
        boolean eliminado = false;
        for(int i=array.length;i>loquesea;i--)
    }*/
}
