package Data;

public class Mascota {
    private int edad;
    private String nombre;
    private boolean vacunas;

    public Mascota(int edad, String nombre, boolean vacunas ){
        this.edad=edad;
        this.nombre=nombre;
        this.vacunas=vacunas;
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
}
