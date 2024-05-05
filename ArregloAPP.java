
public class ArregloAPP {
    public static void main(String[] args) {
        long[] arreglo; //referencia a un arreglo
        arreglo = new long[20]; //crea un arreglo de 20 elementos
        int numElems;//variable que almacena el numero de elementos en el arreglo
        int j; //indice del arreglo 

        //insertar 10 elementos en el arreglo
        arreglo[0] = 77;
        arreglo[1] = 99;
        arreglo[2] = 44;
        arreglo[3] = 55;
        arreglo[4] = 22;
        arreglo[5] = 88;
        arreglo[6] = 11;
        arreglo[7] = 00;
        arreglo[8] = 66;
        arreglo[9] = 33;
        numElems = 10; //ahora hay 10 elementos en el arreglo

        //recorrer el arreglo
        for(j=0; j<numElems; j++) { 
            System.out.print(arreglo[j] + " "); //imprime el elemento
        }
        System.out.println("");//salto de linea

    }
}