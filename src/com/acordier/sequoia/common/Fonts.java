package com.acordier.sequoia.common;

import java.awt.Font;

import processing.core.PFont;

/**
 * Some helpers class related to fonts
 * for use with processing 3
 * @author anton
 *
 */
public class Fonts {
	
	public static PFont loadFont(String fileName, float size){
		Font font = null;
		try {
			font = Font.createFont(Font.TRUETYPE_FONT,  Fonts.class.getClassLoader().getResourceAsStream("coolvetica.ttf"));
			font = font.deriveFont(size);
		} catch (Exception ex) {
			ex.printStackTrace();;
			font = new Font("serif", Font.PLAIN, 24);
		}
		return new PFont(font, false);
	}
}
