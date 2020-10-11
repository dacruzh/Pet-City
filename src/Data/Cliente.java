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
public class Cliente extends Usuario{
    public Cliente(String nombre, String apellido, String contraseña, int edad, String genero){
        this.edad=edad;
        this.nombre=nombre;
        this.apellido=apellido;
        this.contraseña=contraseña;
        this.genero=genero;
    }
    public int getEdad() {
        return edad;
    }
    public String getNombre() {
        return nombre;
    }
    
    public String getApellido() {
        return apellido;
    }
    public String getContraseña() {
        return contraseña;
    }
    public String getGenero() {
        return genero;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
}
