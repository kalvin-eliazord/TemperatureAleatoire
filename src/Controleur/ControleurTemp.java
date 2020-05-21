package Controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Modele.ModeleTemp;
import Vue.VueTemp;

public class ControleurTemp {

	private ModeleTemp leModele;
	private VueTemp laVue;

	public ControleurTemp(ModeleTemp leModele, VueTemp laVue) {

		this.leModele = leModele;
		this.laVue = laVue;

		this.laVue.recepteurTempRandom(new ActionBtn());
	}

	class ActionBtn implements ActionListener {
		public void actionPerformed(ActionEvent event) {			

			leModele.generationTempCelius();

			double tempCelius = leModele.getTempCelcius();
			laVue.setTextCelcius(tempCelius);

			if ( tempCelius >= 0 && tempCelius <= 40 ) {
				leModele.conversionEnFareinheit();
				laVue.setTextFareinheit(Double.toString(leModele.getTempFareinheit()));

			}else {
				laVue.setTextFareinheit("");
			}

			if ( tempCelius >= 40 && tempCelius <= 50 ) {
				laVue.setTextAlerte("Alerte Mineure!");

			} else if ( tempCelius >= 50 && tempCelius <= 60 ) {
				laVue.setTextAlerte("Alerte Sérieuse!");

			} else if ( tempCelius > 60 ) {
				laVue.setTextAlerte("Alerte Maximum!");

			} else {
				laVue.setTextAlerte("");

			}
		}
	}
}




