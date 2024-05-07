public class ArregloEncap {
    private long[] arreglo; //referencia a un arreglo
    private int numElems;//variable que almacena el numero de elementos en el arreglo
    
    //Datos no ordenados

    //metodo constructor
    public ArregloEncap(int max) {
        arreglo = new long[max]; //crea un arreglo de max elementos
        numElems = 0; //inicialmente no hay elementos en el arreglo
    }

    //metodo busca un elemento en el arreglo
    public boolean buscar(long dato) {
        int j; //indice del arreglo
        for(j=0; j<numElems; j++) { //buscar el elemento
            if (arreglo[j] == dato) { //¿se encontro el elemento?
                break; //si, salir del ciclo
            }
        }
        if (j == numElems) { // ¿se llego al final del arreglo?
            return false; //no se encontro el elemento
        } else {
            return true; //se encontro el elemento
        }
    }

    //metodo insertar un nuevo elemento en el arreglo
    public void insertar(long dato) {
        arreglo[numElems] = dato; //insertar el dato en el arreglo
        numElems++; //incrementar el numero de elementos en el arreglo
    }

    //metodo eliminar un elemento del arreglo que sea igual al dato desplazando los elementos del arreglo a una posicion anterior
    public boolean eliminar(long dato) {
        int j; //indice del arreglo

        for(j=0; j<numElems;j++) { //buscar el elemento
            if (arreglo[j] == dato) { //se encontro el elemento?
                break; //si, salir del ciclo
            }
        }
        if (j == numElems) { // ¿se llego al final del arreglo?
            return false; //no se encontro el elemento
        } else {
            for(int k=j; k<numElems-1; k++) { //mueve los elementos superiores hacia abajo
                arreglo[k] = arreglo[k+1];
            }
            numElems--; //reduce el numero de elementos en el arreglo en 1
            return true; //se encontro el elemento
        }
    }

    //metodo imprime/mostrar los elementos del arreglo
    public void mostrar() {
        for(int j=0; j<numElems; j++) {
            System.out.print(arreglo[j] + " "); //imprime el elemento
        }
        System.out.println("");//salto de linea
    }

    //metodo que devuelve el numero de elementos en el arreglo
    public long devuelve(int i) {
        return arreglo[i]; //devuelve el elemento en la posicion i
    }
}
