/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbolbinario;

/**
 *
 * @author massimo
 */
public class Pila {

    // Inicio
    private Nodo inicio;
    //Tamaño
    int tamanio;

    //constructor
    public void Pila() {
        inicio = null;
        tamanio = 0;
    }

    //Consulta si es vacia o no
    public boolean esVacia() {
        return inicio == null;
    }

    //Devuelve el numero de elementos de la lista
    public int getTamanio() {
        return tamanio;
    }

    //Agrega un nodo a la pila 
    public void apilar(double valor) {

        Nodo nuevo = new Nodo();

        nuevo.setValor(valor);

        if (esVacia()) {

            inicio = nuevo;
        } else {
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        }

        tamanio++;
    }
    //Quita un nodo de la pila

    public void retirar() {
        if (!esVacia()) {

            inicio = inicio.getSiguiente();

            tamanio--;
        }
    }

    //Elimina la pila
    public void eliminar() {

        inicio = null;

        tamanio = 0;
    }

    //RETORNA EL NODO DEL TOPE DE LA PILA
    public Nodo Top() throws Exception {
        if (!esVacia()) {
            return inicio;
        } else {
            throw new Exception("");
        }
    }

    public Object tope() throws Exception {
        if (!esVacia()) {
            return inicio.getValor();
        } else {
            throw new Exception("");
        }
    }

    //Imprime en consola los elementos de la lista
    public void imprimir() {

        Nodo aux = inicio;

        while (aux != null) {
            System.out.println("(\t" + aux.getValor() + "\t)");
            System.out.println("-----------------");
            aux = aux.getSiguiente();
        }
    }

    //Busca un nodo mediante su valor de referencia
    public boolean buscar(double referencia) {

        Nodo aux = inicio;

        boolean existe = false;

        while (existe != true && aux != null) {

            if (referencia == (double) aux.getValor()) {

                existe = true;
            } else {

                aux = aux.getSiguiente();
            }
        }

        return existe;
    }

    //Elimina un valor por su valor de referencia DOUBLE
    public void remover(double referencia) {

        if (buscar(referencia)) {

            Nodo pilaAux = null;

            while (referencia != (double) inicio.getValor()) {

                Nodo temp = new Nodo();

                temp.setValor(inicio.getValor());

                if (pilaAux == null) {

                    pilaAux = temp;
                } else {
                    temp.setSiguiente(pilaAux);
                    pilaAux = temp;
                }

                retirar();
            }

            retirar();

            while (pilaAux != null) {

                apilar((double) pilaAux.getValor());

                pilaAux = pilaAux.getSiguiente();
            }

            pilaAux = null;
        }
    }
//
//    //Actualiza un valor en la pila con su valor de referencia y el valor nuevo
//    public void editar(double referencia, double valor) {
//
//        if (buscar(referencia)) {
//
//            Nodo pilaAux = null;
//
//            while (referencia != (double) inicio.getValor()) {
//
//                Nodo temp = new Nodo();
//
//                temp.setValor(inicio.getValor());
//
//                if (pilaAux == null) {
//
//                    pilaAux = temp;
//                } else {
//                    temp.setSiguiente(pilaAux);
//                    pilaAux = temp;
//                }
//
//                retirar();
//            }
//
//            inicio.setValor(valor);
//
//            while (pilaAux != null) {
//
//                apilar((double) pilaAux.getValor());
//
//                pilaAux = pilaAux.getSiguiente();
//            }
//
//            pilaAux = null;
//        }
//    }
//
//    public void Copiar(Pila origen, Pila copia) throws Exception {
//
//        double elemento = 0;
//
//        if (!origen.esVacia()) {
//            elemento = (double) origen.tope();
//            origen.retirar();
//            Copiar(origen, copia);
//            origen.apilar(elemento);
//            copia.apilar(elemento);
//
//        }
//
//    }

//    public Pila reverse() throws Exception {
//        Pila pilita = new Pila();
//        int Size = this.tamanio;
//
//        for (int i = 0; i < Size; i++) {
//            pilita.apilar((double) this.tope());
//            this.retirar();
//
//        }

//        Nodo nodo = this.inicio;
//        
//        this.retirar();
//        if(nodo!=null){
//            this.reverse();
//            this.apilar(nodo.getValor());
//        }
//        return pilita;
//    }
//
//    public void invertir(Pila origen, Pila copia) throws Exception {
//        double elemento = 0;
//
//        if (!origen.esVacia()) {
//            elemento = (double) origen.tope();
//            origen.retirar();
//            copia.apilar(elemento);
//            invertir(origen, copia);
//            origen.apilar(elemento);
//
//        }
//
//    }
////EL QUE MEJOR INVIERTE VOLTEA ETC
//
//    public void voltear() throws Exception {
//
//        Pila reverse = new Pila();
//        reverse.Copiar(this, reverse);
//
//        while (this.tamanio != 0) {
//            this.retirar();
//        }
//
//        while (reverse.tamanio != 0) {
//
//            this.apilar((double) reverse.tope());
//            reverse.retirar();
//
//        }
//
//    }

//    //El reverse de la clase
//    public void reversa() {
//        if (!this.esVacia()) {
//            Nodo node = this.inicio;
//            this.retirar();
//            this.reversa();
//            this.submerge((double) node.getValor());
//        }
//    }

//    public double Suma() throws Exception {
//
//        double total = 0;
//        int count = 0;
//        int Size = this.tamanio;
//
//        while (count != Size) {
//            total += (double) this.tope();
//            this.retirar();
//            count++;
//
//        }
//
//        return total;
//
//    }
//
//    public double promedio() throws Exception {
//        int Size = this.tamanio;
////        System.out.println(Size);
////        System.out.println(Suma());
//
//        double prom = (double) Suma() / (double) Size;
//        return prom;
//
//    }
//
//    //inserta al final de la pila
//    public void submerge(double data) {
//        if (!this.esVacia()) {
//            Nodo node = this.inicio;
//            this.retirar();
//            this.submerge(data);
//            this.apilar((double) node.getValor());
//
//        } else {
//            this.apilar(data);
//
//        }
//
//    }

//    //inserta al en una posicion especifica de la pila
//    //Este es el que se usa en el main, valor e index
//    public void insertMid(double data, int pos) {
//        this.insertMid(data, pos, 0);
//
//    }
//
//    public void insertMid(double data, int pos, int i) {
//        if (i < pos) {
//            Nodo node = this.inicio;
//            this.retirar();
//            this.insertMid(data, pos, i + 1);
//            this.apilar((double) node.getValor());
//
//        } else {
//            this.apilar(data);
//
//        }
//
//    }

//    public Pila insertalo(Pila ABB) throws Exception {
//
//        Pila aux = new Pila();
//
//        for (int i = 0; i < this.tamanio / 2; i++) {
//
//            aux.apilar((double) this.tope());
//
//            this.retirar();
//
//        }
//
//        ABB.apilar((double) this.tope());
//
//        this.retirar();
//
//        aux.insertalo(ABB);
//        this.insertalo(ABB);
////        this.insertalo(ABB);
//
//        return ABB;
//
//    }
    
    //RETORNA EL NUMERO MAYOR DE LA PILA

    public int Mayor(int mayor) throws Exception {
        if (!this.esVacia()) {
            Nodo actual = inicio;
            this.retirar();

            double d = (double) actual.getValor();
            int i = (int) d;

            if (i > mayor) {
                double e = (double) actual.getValor();
                int w = (int) d;
                mayor = w;

            }
            mayor = Mayor(mayor);
            double a = (double) actual.getValor();
            int b = (int) d;
            this.apilar(b);

        }
        return mayor;
    }
    
    //ORDENA LA PILA DE MAYOR EN EL TOPE Y MENOR EN LA BASE

    public void ordenamiento(Pila pila, int mayor) throws Exception {
        if (!this.esVacia()) {
            int numero = pila.Mayor(mayor);
            pila.remover(numero);
            ordenamiento(pila, mayor);
            pila.apilar(numero);

        }
    }
    
    //OTRA FORMA DE ELIMINAR PASANDO EL DATO POR PARAMETRO PERO SOLO INT
    public void elimina(int numero){
        if(!this.esVacia()){
            Nodo actual = inicio;
            this.retirar();
            elimina(numero);
            if((int) actual.getValor()!= numero){
                this.apilar((int) actual.getValor());
            }
            
        }
    }

//    public BinarySearchTree insertalo(BinarySearchTree ABB) throws Exception{
//        
//        Pila pilaaux = new Pila();
//        for (int i = 0; i < this.tamanio/2; i++) {
//            
//            pilaaux.apilar((int) this.tope());
//            this.retirar();
//  
//        }
//        
//        ABB.insert((int) this.tope());
//        this.retirar();
//        
//        pilaaux.insertalo(ABB);
////        this.insertalo(ABB);
//        
//        
//        
//        return ABB;
//        
//    }
//    public void orden() throws Exception{
//        if(!this.esVacia()){
//            Nodo aux = new Nodo();
//            aux = (Nodo) this.tope();
//            
//            this.retirar();
//            if (aux<this.)
//            this.orden();
//            
//        }
//    }
//
//    public void selection(Lista listaJugadores) throws Exception {
//
//        if (listaJugadores.getTamanio() > 0) {
//            this.apilar((double) listaJugadores.getValor(0));
//            this.apilar((double) listaJugadores.getValor(listaJugadores.getTamanio() - 1));
//            listaJugadores.removerPorPosicion(0);
//            listaJugadores.removerPorPosicion(listaJugadores.getTamanio() - 1);
//
//
//        } else {
//            System.out.println("La lisyta esta vacia");
//        }
//
//    }
}
