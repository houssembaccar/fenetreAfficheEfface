import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class FenetreAfficheEfface extends JFrame implements ActionListener {
	private String mot;
	private JButton affiche ,efface;
	private JPanel pano;
	private JLabel affichage;
	
	public FenetreAfficheEfface (){
		setSize(300,100);
		setTitle("Fenetre");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		pano = new JPanel (new BorderLayout(40,50));
		affiche= new JButton("Afficher");
		efface = new JButton("Effacer");
		affiche.addActionListener(this);
		efface.addActionListener(this);
		
		affichage = new JLabel();
		pano.add(affiche, BorderLayout.EAST);
		pano.add(efface, BorderLayout.WEST );
		
		add(pano);
		setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==affiche)
		{
			pano.remove(affichage);
			mot="bonjour";
			affichage=new JLabel(mot);
			
			pano.add(affichage, BorderLayout.CENTER);
			pano.repaint();
			pano.validate();
			pano.setBackground(Color.ORANGE);
		}
		else if(e.getSource()==efface)
		{
			pano.remove(affichage);
			mot="";
			affichage=new JLabel(mot);
			
			pano.add(affichage, BorderLayout.CENTER);
			pano.repaint();
			pano.validate();
		}
		
	}

}
