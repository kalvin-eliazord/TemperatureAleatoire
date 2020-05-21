package Modele;

import Controleur.ControleurTemp;
import Vue.VueTemp;

public class MainTemp {

	public static void main(String[] args) {
		
		ModeleTemp leModele = new ModeleTemp();

		VueTemp laVue = new VueTemp();

		ControleurTemp leControleur = new ControleurTemp(leModele, laVue);

	}
}
