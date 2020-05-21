package Modele;

public class ModeleTemp {

	private double tempCelcius, tempFareinheit;

	public void generationTempCelius() {
		tempCelcius = Math.random() * 100.0;
	}

	public void conversionEnFareinheit() {
		tempFareinheit = (9/5) * tempCelcius + 32;
	}

	public double getTempCelcius() {
		return tempCelcius;
	}

	public double getTempFareinheit() {
		return tempFareinheit;
	}

}
