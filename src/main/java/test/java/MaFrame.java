package test.java;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Map;


import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class MaFrame extends JFrame implements MouseListener, ActionListener{

    private MaMap maMap;
    private MonLabel monLabel2;
   // On implemente le listenner dans l'objet qui écoute
   //Mon bouton doit récupérer sa note plus le listener doit effectué le changement de texte du label
   // ça va donc prendre la forme  : bouton.addlistener(celui qui écoute = piano donc la frame)
   //On effet c'est le piano qui va écouter l'action et le bouton qui va être écouté
    public MaFrame(){

    setSize(700,400);
    setTitle("Ma fenêtre");
    this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    Container frameCont = this.getContentPane();
        frameCont.setLayout(new BorderLayout());

        MonLabel monLabel = new MonLabel("Ceci n'est pas un piano");
        monLabel2 = new MonLabel("Mais presque");
        MonPanel monPanel = new MonPanel(1,8);

        maMap = new MaMap();
        //Map.Entry = entrée de la map
        //maMap.getNoteMap().entrySet() = je récupère la valeur de 
        
        for(Map.Entry map : maMap.getNoteMap().entrySet()){

            MonBouton monBouton = new MonBouton(map.getValue().toString());
            monPanel.add(monBouton);
            monBouton.addActionListener((ActionListener) this);
            }


        //Création de mon pannel du haut
        MonPanel monPanelNord = new MonPanel();
        //ajout de mon label "ceci n'est pas un piano" au nord de ma frame"
        frameCont.add(monPanelNord, BorderLayout.NORTH);
        // je mets un mon label au centre de mon panel
        monPanelNord.add(monLabel, BorderLayout.SOUTH);

        //frameCont.add(monLabel, BorderLayout.NORTH);
        frameCont.add(monLabel2, BorderLayout.SOUTH);
        frameCont.add(monPanel, BorderLayout.CENTER);

        this.setVisible(true);

        this.addMouseListener((MouseListener) this);
        
    
   } 

   public void mouseClicked(MouseEvent e){
        System.out.println("souris cliquée ds la fenetre");
   }

   public void mousePressed(MouseEvent e){
        System.out.println("souris presse ds la fenetre");
   }

   public void mouseReleased(MouseEvent e){
        System.out.println("souris relachée ds la fenetre");
   }

   public void mouseEntered(MouseEvent e){
        this.getContentPane().setBackground(Color.pink);   
    }

    public void mouseExited(MouseEvent e){
        this.getContentPane().setBackground(Color.pink);   
    }

    public void actionPerformed(ActionEvent e){
        int valeurDeMaClee = 0;
        MonBouton monbouton = (MonBouton) e.getSource();

        for(Map.Entry map : maMap.getNoteMap().entrySet()){

            if(map.getValue().toString().equals(monbouton.getText())){
                valeurDeMaClee = (int) map.getKey();
            }
            monLabel2.setText("___ " + monbouton.getText() + "de code mifi" + valeurDeMaClee);
            }
        

}
}



