/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO;

import util.Graph;
import util.Vertex;

/**
 *
 * @author thiag
 */
public class test {

    public static void main(String[] args) {
        String a;
        InputText in = new InputText();
        in.open("C:\\Users\\thiag\\Documents\\NetBeansProjects\\WebOptimizer\\src\\IO\\3_2.txt");
        in.read();
        int[][] m = in.getData();
        
        Graph g = new Graph();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(m[i][j]+ " ");
            }
            System.out.println("");
        }
        
        for (int i = 0; i < 3; i++) {
            Vertex c = new Vertex(""+(i+1));
            g.addVertex(c);
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(i < j) {
                    g.addEdge(g.getVertices().get(i), g.getVertices().get(j), m[i][j]);
                }
            }
        }
        
        System.out.println(g.toString());
    }
}
