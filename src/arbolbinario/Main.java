/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arbolbinario;

/**
 *
 * @author massimo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here

//        BinarySearchTree BST = new BinarySearchTree();
//
//        BST.insert(5);
//        BST.insert(2);
//        BST.insert(1);
//        BST.insert(3);
//        BST.insert(4);
//        BST.insert(9);
//        BST.insert(7);
//        BST.insert(6);
//        BST.insert(8);
//        BST.insert(11);
//        BST.insert(10);
//        BST.insert(12);
//        
////        BST.preorder(BST.getRoot());
////        System.out.println(BST.ACMP(10, 12));
//        ArbolBinario BT1 = new ArbolBinario();
//        ArbolBinario BT2 = new ArbolBinario();
        //IDENTICOS solo en estructura no me interesa los datos aqui
//        BT1.AddNode("25", null);
//        BT1.AddNode("27", "25");
//        BT1.AddNode("9", "25");
//        BT1.AddNode("80", "27");
//        BT1.AddNode("10", "27");
//        BT1.AddNode("20", "9");
//        BT1.AddNode("3", "9");
//        BT2.AddNode("25", null);
//        BT2.AddNode("27", "25");
//        BT2.AddNode("9", "25");
//        BT2.AddNode("80", "27");
//        BT2.AddNode("10", "27");
//        BT2.AddNode("20", "9");
//        BT2.AddNode("3", "9");
//
////        System.out.println(BT1.sameStructure(BT2.getRoot()));
//        System.out.println(BT1.sameValues(BT2.getRoot()));
//        ESPEJO
//        BT2.AddNode("25", null);
//        BT2.AddNode("9", "25");
//        BT2.AddNode("27", "25");
//        BT2.AddNode("3", "9");
//        BT2.AddNode("20", "9");
//        BT2.AddNode("10", "27");
//        BT2.AddNode("80", "27");
//        
//        System.out.println(BT1.mirrorValues(BT2.getRoot()));
//        Pila pila = new Pila();
//        pila.apilar((int) (Math.random() * 100));
//        pila.apilar((int) (Math.random() * 100));
//        pila.apilar((int) (Math.random() * 100));
//        pila.apilar((int) (Math.random() * 100));
//        pila.apilar((int) (Math.random() * 100));
//        pila.apilar((int) (Math.random() * 100));
//        pila.apilar((int) (Math.random() * 100));
//        pila.apilar((int) (Math.random() * 100));
//        pila.apilar((int) (Math.random() * 100));
//        pila.apilar((int) (Math.random() * 100));
//        pila.apilar((int) (Math.random() * 100));
//        pila.apilar((int) (Math.random() * 100));
//        pila.apilar((int) (Math.random() * 100));
//        pila.apilar((int) (Math.random() * 100));
//
//        BinarySearchTree ABB = new BinarySearchTree();
//
//        for (int i = 0; i < (int) (Math.random() * 20); i++) {
//            int n = (int) (Math.random() * 100);
//            ABB.insert(n);
//            System.out.println(n);
//        }
//        System.out.println("-------------------\n\n");
//        ABB.inorder(ABB.getRoot());
//        Pila pila = new Pila();
//        pila.apilar(1);
//        pila.apilar(2);
//        pila.apilar(3);
//        pila.apilar(4);
//        pila.apilar(5);
//        pila.apilar(6);
//        pila.apilar(7);
//        pila.apilar(8);
//        pila.apilar(9);
//        pila.apilar(10);
//        pila.apilar(11);
//        pila.imprimir();
//
//        
//        Pila ABB = new Pila();
//        
//        ABB = pila.insertalo(ABB);
//        Pila pili = new Pila();
//        BinarySearchTree ABB = new BinarySearchTree();
//        pili.apilar(7);
//        pili.apilar(6);
//        pili.apilar(5);
//        pili.apilar(4);
//        pili.apilar(3);
//        pili.apilar(2);
//        pili.apilar(1);
//        pili.imprimir();
//        ABB.ConstructBST(pili);
//        System.out.println("INORDEN");
//        ABB.inorder(ABB.getRoot());
//        BinarySearchTree ABB2 = new BinarySearchTree();
//        ABB2.insert(4);
//        ABB2.insert(2);
//        ABB2.insert(1);
//        ABB2.insert(3);
//        ABB2.insert(6);
//        ABB2.insert(5);
//        ABB2.insert(7);
//        System.out.println("aja");
//
//        ABB2.inorder(ABB2.getRoot());
//
//        BinarySearchTree BST = new BinarySearchTree();
//        BST.insert(5);
//        BST.insert(2);
//        BST.insert(1);
//        BST.insert(3);
//        BST.insert(4);
//        BST.insert(9);
//        BST.insert(7);
//        BST.insert(6);
//        BST.insert(8);
//        BST.insert(11);
//        BST.insert(10);
//        BST.insert(12);
//
//        System.out.println("bst");
//
//        BST.preorder(BST.getRoot());
//
//        System.out.println("----------\n\n");
//
//        Pila pilita = new Pila();
//
//        pilita.apilar(4);
//        pilita.apilar(6);
//        pilita.apilar(2);
//        pilita.apilar(8);
//        pilita.apilar(5);
//        pilita.apilar(7);
//        pilita.apilar(7);
//        pilita.imprimir();
//        System.out.println("----------\n\n");
//
//        pilita.ordenamiento(pilita, 0);
//
//        pilita.imprimir();
//        BinarySearchTree ABB4 = new BinarySearchTree();
//        System.out.println("hdbisabdiusdvs");
//        ABB4.ConstructBST(pilita);
//        System.out.println("INORDEN");
//        ABB4.inorder(ABB4.getRoot());
//        pili.apilar(8);
        //QUIZZZZZ
        System.out.println("PREGUNTA 1\n");
        System.out.println("Se le ha solicitado que genere un árbol binario de búsqueda a partir de una pila con las siguientes características:\n"
                + "\n"
                + "-La pila debe contar con un número aleatorio entre 10 a 20 elementos.\n"
                + "-No se puede usar una estructura auxiliar para el ordenamiento de los elementos de la pila.\n");

        Pila pila = new Pila();
        int n = (int) (Math.random() * (21 - 10)) + 10;
        
        

        System.out.println("Se genero una pila con un numero de elementos random entre el 10-20, en este caso son " + n + " elementos los que conforman la pila y cada elemento se genero con un numero aleatorio entre el 1-100\n");

        for (int i = 0; i < n; i++) {
            
            pila.apilar((int) (Math.random() * 100));

        }

        System.out.println("----PILA DESORDENADA----\n");
        pila.imprimir();

        pila.ordenamiento(pila, 0);
        
        System.out.println("\n----PILA ORDENADA----\n");

        pila.imprimir();

        System.out.println("\nYa que los ABB no aceptan valores repetidos, el programa detecta y elimina los valores repetidos de la lista para construir el ABB\nEstos valores son:\n");

        BinarySearchTree ABB = new BinarySearchTree();

        ABB.ConstructBST(pila);
        
        System.out.println("\nImprimiento el arbol INORDEN, POSTORDEN y PREORDEN se comprueba que esta bien estructurado y balanceado\n");

        System.out.println("\n---INORDEN---\n");
        ABB.inorder(ABB.getRoot());
        System.out.println("\n---PREORDEN---\n");
        ABB.preorder(ABB.getRoot());
        System.out.println("\n---POSTORDEN---\n");
        ABB.postorder(ABB.getRoot());

    }

}
