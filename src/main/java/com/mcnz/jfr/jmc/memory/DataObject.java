package com.mcnz.jfr.jmc.memory;


public class DataObject {
	private long position;
	
	public DataObject(int pos) {
		position = pos;
		position = position+1;
	}
	

	public long getPosition() {
		return position;
	}

	public void setPosition(long position) {
		System.out.println("Set position in the var");
		this.position = position;
	}

	
	

}
