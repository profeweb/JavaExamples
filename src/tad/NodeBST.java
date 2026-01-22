package tad;

import processing.core.PApplet;

public class NodeBST {

    int valor;
    NodeBST esq, dret;

    public NodeBST(int v){
        this.valor = v;
        this.esq = null;
        this.dret = null;
    }

    public void setFillEsq(NodeBST esq){
        this.esq = esq;
    }

    public void setFillDret(NodeBST dret){
        this.dret = dret;
    }

    public void visitar(){
        System.out.print(this.valor +", ");
    }

    public void inordre(){
        if(this.esq!=null){ this.esq.inordre(); }
        visitar();
        if(this.dret!=null){ this.dret.inordre();}
    }

    public void preordre(){
        visitar();
        if(this.esq!=null){ this.esq.preordre(); }
        if(this.dret!=null){ this.dret.preordre();}
    }

    public void postordre(){
        if(this.esq!=null){ this.esq.postordre(); }
        if(this.dret!=null){ this.dret.postordre();}
        visitar();
    }

    public void revers(){
        if(this.dret!=null){ this.dret.revers();}
        visitar();
        if(this.esq!=null){ this.esq.revers(); }
    }

    public void display(PApplet p5, float x, float y, float r, int level){

        float dx = (p5.width/3)/(level+2);
        p5.pushStyle();

        if(this.esq!=null){
            p5.line(x, y, x - dx, y + 2*r);
        }

        if(this.dret!=null){
            p5.line(x, y, x + dx, y + 2*r);
        }

        p5.fill(255);
        p5.ellipse(x, y, r,r);
        p5.fill(0); p5.textSize(18); p5.textAlign(p5.CENTER);
        p5.text(this.valor, x, y + r/6);
        p5.popStyle();
    }

}
