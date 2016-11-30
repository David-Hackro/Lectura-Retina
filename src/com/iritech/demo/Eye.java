package com.iritech.demo;

public class Eye {


	public Eye(String filename, byte[] pData) {
		super();
		this.filename = filename;
		this.pData = pData;
	}
	private String filename;
	private  byte[] pData;
	
	
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public byte[] getpData() {
		return pData;
	}
	public void setpData(byte[] pData) {
		this.pData = pData;
	}
}
