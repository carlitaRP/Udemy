public class ArregloEncapApp {
    
    public static void main(String[] args) {
        //crear un arreglo de 30 elementos
        int max = 30; //maximo numero de elementos en el arreglo
        ArregloEncap arreglo;//referencia a un arreglo
        arreglo = new ArregloEncap(max); //crea una instancia de la clase Arreglo. El constructor recibe el maximo numero de elementos en el arreglo

        //insertar 10 elementos en el arreglo
        arreglo.insertar(77);
        arreglo.insertar(99);
        arreglo.insertar(44);
        arreglo.insertar(55);
        arreglo.insertar(22);
        arreglo.insertar(88);
        arreglo.insertar(11);
        arreglo.insertar(00);
        arreglo.insertar(66);
        arreglo.insertar(33);

        //imprimir los elementos del arreglo en pantalla
        arreglo.mostrar();

        //buscamos elemento en el arreglo
        int busqueda = 35;
        if (arreglo.buscar(busqueda)) {
            System.out.println("Se encontro el elemento: " + busqueda);
        } else {
            System.out.println("No se encontro el elemento: " + busqueda);
        }
        //eliminar 3 elementos del arreglo
        arreglo.eliminar(00);
        arreglo.eliminar(55);
        arreglo.eliminar(99);

        //imprimir los elementos del arreglo en pantalla nuevamente
        arreglo.mostrar();
    }
}
