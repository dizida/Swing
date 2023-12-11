package test.java;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JPanel;

public class MonPanel extends JPanel{
    
    public MonPanel(){

        this.setLayout(new BorderLayout());
    }

    public MonPanel(int ligne, int colonne){

        this.setLayout(new GridLayout(ligne, colonne));
    }
}
