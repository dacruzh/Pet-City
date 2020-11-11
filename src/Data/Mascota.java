package Data;

public class Mascota {
    private int edad;
    private String nombre;
    private boolean vacunas;
    private int llegada; 
    private static int n=0; 

    public Mascota(int edad, String nombre, boolean vacunas ){
        this.edad=edad;
        this.nombre=nombre;
        this.vacunas=vacunas;
        this.llegada=n+1;
    }
    public int getEdad() {
        return edad;
    }
    public String getNombre() {
        return nombre;
    }
    
    public boolean getVacunas() {
        return vacunas;
    }
    public int getLlegada() {
        return llegada;
    }
    public void setVacunas(boolean vacunas) {
        this.vacunas = vacunas;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return this.nombre+"        "+this.edad+"       "+this.vacunas;
    }
    @Override
    public boolean equals(Object obj)
    {  Mascota m1=(Mascota)obj;
        if (m1.getLlegada() >this.getLlegada()){
            return true;
        }
		return false;  
    }
}
