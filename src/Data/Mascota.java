package Data;

public class Mascota implements Comparable<Mascota>{
    private int edad;
    private String nombre;
    private boolean vacunas;
    private int llegada; 
    private String especie;
    private String raza;
    private static int n=0; 

    public Mascota(int edad, String nombre, boolean vacunas, String especie, String raza ) {
        this.edad=edad;
        this.nombre=nombre;
        this.vacunas=vacunas;
        this.llegada=++n;
        this.especie = especie;
        this.raza = raza;
    }
    public Mascota(int llegada)
    {
        this.llegada=llegada;
    }
    public int getEdad() {
        return edad;
    }
    public String getNombre() {
        return nombre;
    }
    public String getEspecie() {
        return especie;
    }
    public String getRaza() {
        return raza;
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
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    public void setRaza(String raza) {
        this.raza = raza;
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

    @Override
    public int compareTo(Mascota o) {
      
      
        if(this.llegada<o.getLlegada())
        {
            return-1;
        }
            else{ 
                if(this.llegada>o.getLlegada())
                    { return 1;}
                else return 0;
        }
       
    }
}
