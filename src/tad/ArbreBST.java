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




}
