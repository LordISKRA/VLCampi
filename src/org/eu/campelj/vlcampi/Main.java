package org.eu.campelj.vlcampi;

import javax.swing.SwingUtilities;

public class Main {
	
	public static void main(String[] args) {		
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new WindowFrame("VLCampi", 800, 600);
			}			
		});
	}
}
