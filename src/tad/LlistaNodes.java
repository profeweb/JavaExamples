package tad;

import poo.LlistaGenerica;
import processing.core.PApplet;

public class LlistaNodes {

    Node head, tail;
    int numNodes;

    public LlistaNodes(){
        this.head = null;
        this.tail = null;
        this.numNodes = 0;
    }

    public boolean isEmpty(){
        return this.head == null &&
                this.tail==null;
    }

    public void preppend(int v){
        if(isEmpty()) {
            Node n = new Node(v);
            head = n;
            tail = n;
        }
        else {
            Node n = new Node(v, head);
            head = n;
        }
        numNodes++;
    }

    public void append(int v){
        if(isEmpty()) {
            Node n = new Node(v);
            head = n;
            tail = n;
        }
        else {
            Node n = new Node(v);
            tail.seg = n;
            tail = n;
        }
        numNodes++;
    }

    public int numElements(){
        int n=0;
        Node x = head;
        while(x!=null){
            x = x.seg;
            n++;
        }
        return n;
    }

    public int numElements2(){
        return this.numNodes;
    }

    public int getFirst(){ return head.valor; }

    public int getLast(){ return tail.valor; }

    public int getElementAt(int i){
        if(i<numNodes){
            int k=0;
            Node n = head;
            while(k<i){
                n = n.seg;
                k++;
            }
            return n.valor;
        }
        else {
            return -1;
        }
    }

    public void insertAt(int i, int v){
        if(i==0){
            preppend(v);
        }
        else if(i==numNodes-1){
            append(v);
        }
        else if(i<numNodes) {
            int k=0;
            Node nAnt = head;
            while(k<i-1){
                nAnt = nAnt.seg;
                k++;
            }
            Node nSeg = nAnt.seg;
            Node nouNode = new Node(v, nSeg);
            nAnt.seg = nouNode;
            numNodes++;

        }
    }

    public void display(PApplet p5, int x, int y, int wn) {

        if (!isEmpty()) {

            Node n = head;
            int i = 0;
            do {
                n.display(p5,x + 2*i*wn, y, wn);
                n = n.seg;
                i++;
            } while (n!=null);
        }

        p5.fill(0);
        p5.textAlign(p5.CENTER);
        p5.text("HEAD", x + wn/2, y -50);
        p5.line(x + wn/2, y - wn, x + wn/2, y);
    }

}
