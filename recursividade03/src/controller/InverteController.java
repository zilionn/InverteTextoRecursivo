package controller;

public class InverteController {

	public InverteController() {
		super();
	}

	public String inverte(String text) {
		if (text.length() <= 1) {
			return text;
		}
		String resto = inverte(text.substring(1));
		
		return resto + text.charAt(0);
	}
}
