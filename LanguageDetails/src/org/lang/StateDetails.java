package org.lang;

public class StateDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StateDetails state = new StateDetails();
		
		state.southIndia();
		state.northIndia();
	}
	
	public void southIndia() {
		System.out.println("South India");
		LanguageInfo lang = new LanguageInfo();
		lang.tamilLanguage();
		lang.englishLanguage();
	}
	
	public void northIndia() {
		System.out.println("North India");
		LanguageInfo lang = new LanguageInfo();
		lang.hindiLanguage();
		lang.englishLanguage();
	}
}

class LanguageInfo {
	public void tamilLanguage() {
		System.out.println("Tamil Language");
	}
	
	public void englishLanguage() {
		System.out.println("English Language");
	}
	
	public void hindiLanguage() {
		System.out.println("Hindi Language");
	}

}
