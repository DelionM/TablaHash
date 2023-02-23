package tablahash;

import java.util.Arrays;

public class TablaHash {
    String [] arreglo;
    int tamanio, contador;
    public TablaHash(int tam){
        tamanio = tam;
        arreglo = new String [tam];
        Arrays.fill(arreglo, "-1");
    }
    public void  funcionHash(String [] cadenaArreglo, String [] arreglo ){
        int i;
        for (i = 0; i<cadenaArreglo.length; i++){
            String elemento = cadenaArreglo[i];
            int  indiceAreglo = Integer.parseInt(elemento)%7;
            System.out.println("El indice es:" + indiceAreglo+ "Para elemento o valor "+ elemento);
            //Tratando la s colosiones
            while (arreglo [indiceAreglo] !="-1" ){
                indiceAreglo++;
                System.out.println("Ocurrio una colisión  en el indice: " + (indiceAreglo-1) + "Cambiar al indice "+
                        indiceAreglo);
                indiceAreglo%=tamanio;
            }
            arreglo[indiceAreglo]= elemento;
            
            
        }
    }
    public static void main(String[] args) {
            
    }
    
}
