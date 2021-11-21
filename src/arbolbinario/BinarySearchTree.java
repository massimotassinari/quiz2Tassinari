/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbolbinario;

/**
 *
 * @author massimo
 */
public class BinarySearchTree {

    private NodoA root;

    //CONSTRUCTOR ARBOL
    public BinarySearchTree() {
        this.root = null;
    }

    public boolean EsVacio(NodoA node) {
        return root == null;

    }

    public NodoA searchPadre(NodoA root, int data) {
        NodoA found = null;
        if (data < (int) root.getDato()) {
            if (found != null) {
                return found;
            } else if (root.getHijoIzq() != null) {
                found = searchPadre(root.getHijoIzq(), data);

            } else {
                return root;
            }

        } else if (data > (int) root.getDato()) {
            if (found != null) {
                return found;
            } else if (root.getHijoDer() != null) {
                found = searchPadre(root.getHijoDer(), data);

            } else {
                return root;
            }

        }
        return found;
    }

    public void insert(int data) {
        NodoA node = new NodoA(data);
        if (this.root == null) {
            this.root = node;

        } else {
            NodoA nodeP = this.searchPadre(this.root, data);
            if (nodeP == null) {
                System.out.println("\t-El valor "+ data +" esta repetido");

            } else if ((int) nodeP.getDato() > (int) node.getDato()) {
                nodeP.setHijoIzq(node);

            } else {
                nodeP.setHijoDer(node);

            }
        }
    }

    public void preorder(NodoA root) {
        System.out.println(root.getDato());
        if (root.getHijoIzq() != null) {
            preorder(root.getHijoIzq());

        }
        if (root.getHijoDer() != null) {
            preorder(root.getHijoDer());

        }
    }

    public void inorder(NodoA root) {

        if (root.getHijoIzq() != null) {
            inorder(root.getHijoIzq());

        }
        
        System.out.println(root.getDato());
        
        if (root.getHijoDer() != null) {
            inorder(root.getHijoDer());

        }
    }

    public void postorder(NodoA root) {

        if (root.getHijoIzq() != null) {
            preorder(root.getHijoIzq());

        }
        if (root.getHijoDer() != null) {
            preorder(root.getHijoDer());

        }
        System.out.println(root.getDato());
    }
    //Busca el ancestro menor de dos numeros
//
//    public NodoA Buscar(int valor, NodoA root) {
//        if (EsVacio(root)) {
//            return null;
//
//        } else {
//            if ((int) root.getDato() == valor) {
//                return root;
//
//            } else {
//                if (valor < (int) root.getDato()) {
//                    return Buscar(valor, root.getHijoIzq());
//
//                } else {
//                    return Buscar(valor, root.getHijoDer());
//
//                }
//            }
//        }
//    }
//
//
//    public int ACMP(int val1, int val2) {
//        NodoA primero = new NodoA(val1);
//        NodoA segundo = new NodoA(val2);
//
//        if ((int) root.getDato() == val1 || (int) root.getDato() == val2) {
//            return (int) root.getDato();
//
//        }
//        NodoA ancestro = Ancestro(root, primero, segundo);
//        return (int) ancestro.getDato();
//    }
//
//    public NodoA Ancestro(NodoA Root, NodoA primero, NodoA segundo) {
//        NodoA aux = Root;
//        while (aux != null) {
//            if (aux.getDato() == primero.getDato() || aux.getDato() == segundo.getDato()) {
//                return Padre(aux, root);
//
//            } else if ((int) primero.getDato() < (int) aux.getDato() && (int) segundo.getDato() < (int) aux.getDato()) {
//                aux = aux.getHijoIzq();
//
//            } else {
//                return aux;
//            }
//        }
//        return null;
//
//    }
//    
//    public NodoA Padre(NodoA mynode,NodoA root){
//        if (root ==null || mynode == null){
//            return null;
//            
//        }else if ((root.getHijoDer() != null && root.getHijoDer()== mynode)||(root.getHijoIzq()!= null && root.getHijoIzq()== mynode)){
//            return root;
//        }else{
//            NodoA encontrado = Padre(mynode,root.getHijoIzq());
//            if(encontrado == null){
//                encontrado = Padre(mynode,root.getHijoDer());
//            }
//            return encontrado;
//        }
//    }

    /**
     * @return the root
     */
    public NodoA getRoot() {
        return root;
    }

    /**
     * @param root the root to set
     */
    public void setRoot(NodoA root) {
        this.root = root;
    }

    //
//LUISSSSS
//    public NodoA Buscar(int valor, NodoA root) {
//        if (EsVacio(root)) {
//            return null;
//        } else {
//            if ((int) root.getDato() == valor) {
//                return root;
//            } else {
//                if (valor < (int) root.getDato()) {
//                    return Buscar(valor, root.getHijoIzq());
//                } else {
//                    return Buscar(valor, root.getHijoDer());
//                }
//            }
//        }
//
//    }
//
//    public int ACMP(int val1, int val2) {
//        NodoA primero = new NodoA(val1);
//        NodoA segundo = new NodoA(val2);
//        NodoA ancestro = Ancetro2(root, primero, segundo);
//        return (int) ancestro.getDato();
//
//    }
//
//    public NodoA Ancetro2(NodoA Root, NodoA primero, NodoA segundo) {
//        NodoA aux = Root;
//
//        while (aux != null) {
//            if (aux.getDato() == primero.getDato() || aux.getDato() == segundo.getDato()) {
//                return Padre(aux, root);
//            }
//            if ((int) primero.getDato() > (int) aux.getDato() && (int) segundo.getDato() > (int) aux.getDato()) {
//                aux = aux.getHijoDer();
//
//            } else if ((int) primero.getDato() < (int) aux.getDato() && (int) segundo.getDato() < (int) aux.getDato()) {
//
//                aux = aux.getHijoIzq();
//
//            } else {
//                return aux;
//            }
//        }
//
//        return null;
//    }
//
//    public NodoA Padre(NodoA mynode, NodoA Root) {
//        if (Root == null || mynode == null) {
//            return null;
//        } else if ((Root.getHijoDer() != null && Root.getHijoDer() == mynode) || (Root.getHijoIzq() != null && Root.getHijoIzq() == mynode)) {
//            return Root;
//        } else {
//            NodoA encontrado = Padre(mynode, Root.getHijoIzq());
//            if (encontrado == null) {
//                encontrado = Padre(mynode, Root.getHijoDer());
//            }
//            return encontrado;
//        }
//    }

    public void ConstructBST(Pila num) throws Exception {
        Pila aux = new Pila();
//        Pila aux2 = new Pila();

        if (!num.esVacia()) {
            int j = num.tamanio / 2;

            for (int i = 0; i < j; i++) {

                
                aux.apilar((double) num.tope());
                num.retirar();

            }
            double d = (double) num.tope();
            int i = (int) d;
            this.insert(i);

            num.retirar();
            this.ConstructBST(num);
            this.ConstructBST(aux);

        }
    }
    //ANdresss
//    
//    public NodoA SearchPadre2(NodoA root,String padre){
//        NodoA encontrado = null;
//        if(root.getDato() == padre){
//            return root;
//        }
//        if(root.getHijoIzq() !=null && encontrado == null){
//            encontrado = SearchPadre2(root.getHijoIzq(),padre);
//        }
//        if(root.getHijoDer() != null &&encontrado == null){
//            encontrado= SearchPadre2(root.getHijoDer(),padre);
//            
//        }
//        return encontrado;
//        
//    }
//
//    public boolean sameStructure(NodoA root2) {
//        return sameStructure(this.root, root2);
//
//    }
//
//    public boolean sameStructure(NodoA root1, NodoA root2) {
//        boolean same = true;
//        if (root1 == null || root2 == null) {
//            return false;
//
//        }
//        if ((root1.getHijoIzq() != null || root2.getHijoIzq() != null) && same) {
//            same = sameStructure(root1.getHijoIzq(), root2.getHijoIzq());
//
//        }
//        if ((root1.getHijoDer() != null || root2.getHijoDer() != null) && same) {
//            same = sameStructure(root1.getHijoDer(), root2.getHijoDer());
//        }
//        return same;
//
//    }
//
//    public void AddNode(String hijo, String padre) {
//        NodoA nodeHijo = new NodoA(hijo);
//        if(this.EsVacio(this.root)){
//            this.root = nodeHijo;
//            
//            
//            
//        }else{
//            NodoA nodePadre = SearchPadre2(this.root,padre);
//            if(nodePadre ==null){
//                System.out.println("El padre no existe");
//            }
//            else if(nodePadre.getHijoIzq()==null){
//                nodePadre.setHijoIzq(nodeHijo);
//                
//            }
//            else if(nodePadre.getHijoDer()==null){
//                nodePadre.setHijoDer(nodeHijo);
//                
//            }else{
//                System.out.println("Ambos hijos estan llenos");
//            }
//        }

//    }
}
