/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

/**
 *
 * @author Ivanna
 */
public class HashMapPro {
    Cliente mapa [];
    int a;
    int b;
    public int n;
    int m;
    int p;
    public HashMapPro(int m){
        this.m=m;
        mapa=new Cliente[this.m];
        n=0;
        p=100000007;
        // a= (int)(Math.random()*(p-1)+1);
         //b=(int)(Math.random()*(p-1));
         a=67;
         b=23842;

    }
    private int hash(int id){
            int num =((id*a+b)%p)%m;
            return num;
    }
    public Cliente getCliente(int id)
    {   
        return mapa[hash(id)];
    }
    public boolean find(int id){
        boolean encontrado=false;
        if(mapa[hash(id)]!=null)
            return true;
        return encontrado;
    }
    public void insert(Cliente nuevo){
        rehash();
        mapa[hash(nuevo.getID())]=nuevo;
        n++;
    }
    public Cliente remove(int id)  {
        Cliente retornado=mapa[hash(id)];
        mapa[hash(id)]=null;
        n--;
        return retornado;
    }
    public void rehash(){
        if(((double)n)/((double)mapa.length)>=0.5){
        Cliente temp[]=new Cliente[2*mapa.length];
         m=temp.length;
         for (int i=0;i<mapa.length;i++) {
             if(mapa[i]!=null)
                temp[hash(mapa[i].getID())]=mapa[i];
         }
         mapa=temp;
        }
    }
    public Cliente[] obtenerLista(){ 
        Cliente lista[] = new Cliente[n];
        int j=0;
        for(int i=0;i<mapa.length;i++){
            if(mapa[i]!=null){
                lista[j]=mapa[i];
                j++;
            }
        }
        return lista;
    }
}
