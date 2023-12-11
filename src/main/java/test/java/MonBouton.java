package test.java;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class MonBouton extends JButton{
    
    public MonBouton(String titre){
//comme Jbutton possède déjà la méthode pour pouvoir saisir un titre, utilisation de super
        super(titre);
        initBouton();

    }
    public void initBouton(){
      
    }


}
