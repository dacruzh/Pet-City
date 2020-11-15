/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

/**
 *
 * @author ASUS PC
 */
public class Cliente extends Usuario implements Comparable<Cliente>{
    public Cliente(String nombre, String apellido, int edad, int ID, String genero){
        this.edad=edad;
        this.nombre=nombre;
        this.apellido=apellido;
        this.genero=genero;
        this.ID=ID;
    }
    public Cliente(int ID){
        
        this.ID=ID;
    }
    public int getEdad() {
        return edad;
    }
    public int getID() {
        return ID;
    }
    public String getNombre() {
        return nombre;
    }
    
    public String getApellido() {
        return apellido;
    }
    public String getGenero() {
        return genero;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    @Override
    public boolean equals(Object obj) {
        //super.comparar();
        Cliente c1=(Cliente)obj;
        if (c1.getID() == (this.getID())){
            return true;
        }
		return false;   
    }
    
    @Override
    public String toString() {
        return this.ID+"        "+this.nombre+"        "+this.apellido+"       "+this.edad+"       "+this.genero;
    }
    @Override
    public int compareTo(Cliente o) {
       
       
        if(this.ID<o.getID()) {
            return-1;
        }
            else{ 
                if(this.ID>o.getID()){ 
                        return 1;
                    }
                else return 0;
        }
       
    }

 
}
