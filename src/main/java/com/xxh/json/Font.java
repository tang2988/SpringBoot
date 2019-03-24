package com.xxh.json;

public class Font {
	public String WoffUrl;
	public String EotUrl;
	public String FontMapping;
	
	
	
	public Font() {
	}
	public String getWoffUrl() {
		return WoffUrl;
	}
	public void setWoffUrl(String woffUrl) {
		WoffUrl = woffUrl;
	}
	public String getEotUrl() {
		return EotUrl;
	}
	public void setEotUrl(String eotUrl) {
		EotUrl = eotUrl;
	}
	public String getFontMapping() {
		return FontMapping;
	}
	public void setFontMapping(String fontMapping) {
		FontMapping = fontMapping;
	}
	@Override
	public String toString() {
		return "Font [WoffUrl=" + WoffUrl + ", EotUrl=" + EotUrl + ", FontMapping=" + FontMapping + "]";
	}
	

}
