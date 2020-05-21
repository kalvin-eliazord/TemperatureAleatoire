package Vue;

import java.awt.TextField;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VueTemp extends JFrame {

	private static final long serialVersionUID = 1L;
	private JLabel labelCelcius = new JLabel("Température en Celcius: ");  
	private TextField textCelcius = new TextField(10);

	private JLabel labelFareinheit = new JLabel("Température en Fareinheit: ");  
	private TextField textFareinheit = new TextField(10);

	private JLabel labelAlerte = new JLabel("Message d'alerte: ");  
	private TextField textAlerte = new TextField(10);	

	private JButton bouttonTempRandom = new JButton("Générer les températures aléatoires");


	public VueTemp() {

		JPanel fenetre = new JPanel();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(800, 200);
		this.setTitle("Génération de Températures - Kalvin ELIAZORD");

		fenetre.add(labelCelcius);
		fenetre.add(textCelcius);
		fenetre.add(labelFareinheit);
		fenetre.add(textFareinheit);
		fenetre.add(labelAlerte);
		fenetre.add(textAlerte);
		fenetre.add(bouttonTempRandom);

		textCelcius.setEditable(false);
		textFareinheit.setEditable(false);
		textAlerte.setEditable(false);

		this.add(fenetre);
		this.setVisible(true);
	}

	public void setTextCelcius(double tempCelcius) {
		textCelcius.setText(Double.toString(tempCelcius));
	}

	public void setTextFareinheit(String stringFareinheint) {
		textFareinheit.setText(stringFareinheint);
	}

	public void setTextAlerte(String msgAlerte) {
		textAlerte.setText(msgAlerte);
	}

	public void recepteurTempRandom(ActionListener event){
		bouttonTempRandom.addActionListener(event);
	}

}
