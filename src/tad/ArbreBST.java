package tad;

import processing.core.PApplet;

public class ArbreBST {

    NodeBST arrel;

    public ArbreBST(){
        this.arrel = null;
    }

    public ArbreBST(int n){
        this.arrel = new NodeBST(n);
    }

    public boolean isEmpty(){
        return this.arrel == null;
    }

    public void addElement(int n){
        if(isEmpty()){
            this.arrel = new NodeBST(n);
        }
        else {
            NodeBST pare = this.arrel;
            while((pare.esq!=null && n<pare.valor) ||
                    (pare.dret!=null && n>pare.valor)){
                if(n<pare.valor){
                    pare = pare.esq;
                }
                else {
                    pare = pare.dret;
                }
            }
            if(n<pare.valor){
                pare.esq = new NodeBST(n);
            }
            else {
                pare.dret = new NodeBST(n);
            }
        }
    }

    public boolean cercaElement(int valor, NodeBST n){
        if(n==null){
            return false;
        }
        else if(n.valor==valor) {
            return true;
        }
        else {
            if(valor < n.valor && n.esq!=null){
                return cercaElement(valor, n.esq);
            }
            else if(valor > n.valor && n.dret!=null){
                return cercaElement(valor, n.dret);
            }
            return false;
        }
    }

    public int getMinim(){
        NodeBST pare = this.arrel;
        while(pare.esq!=null){
            pare = pare.esq;
        }
        return pare.valor;
    }

    public int getMaxim(){
        NodeBST pare = this.arrel;
        while(pare.dret!=null){
            pare = pare.dret;
        }
        return pare.valor;
    }

    public void display(PApplet p5, NodeBST n, float x, float y, float r, int level){

        float dx = (p5.width/3)/(level+2);
        n.display(p5, x, y, r, level);

        if(n.esq != null){
            display(p5, n.esq, x-dx, y + 2*r, r, level +1);
        }

        if(n.dret != null){
            display(p5, n.dret, x+dx, y + 2*r, r, level +1);
        }
    }

    public void bfs(NodeBST node, int valor){
        System.out.print("BFS: ");
        CuaNodeBST c = new CuaNodeBST();
        node.setVisitat(true);
        c.encola(node);
        while(!c.isEmpty()){
            NodeBST nodeActual = c.desencola();
            nodeActual.visitar();
            if(nodeActual.valor==valor){
                System.out.println("TROBAT!!!!");
            }
            for(NodeBST fill : adjacents(nodeActual)){
                if(fill!=null && !fill.visitat){
                    fill.setVisitat(true);
                    c.encola(fill);
                }
            }
        }
        System.out.println();
    }

    public NodeBST[] adjacents(NodeBST n){
        NodeBST[] nodes = new NodeBST[2];
        nodes[0] = n.esq;
        nodes[1] = n.dret;
        return  nodes;
    }

    public void inordre(){
        System.out.print("IN-ORDRE: ");
        this.arrel.inordre();
        System.out.println();
    }

    public void preordre(){
        System.out.print("PRE-ORDRE: ");
        this.arrel.preordre();
        System.out.println();
    }

    public void postordre(){
        System.out.print("POST-ORDRE: ");
        this.arrel.postordre();
        System.out.println();
    }

    public void revers(){
        System.out.print("REVERS: ");
        this.arrel.revers();
        System.out.println();
    }


}
