package com.yrdomain.ch11;

public class Key {
	public int number;
	
	public Key(int number) {
		this.number = number;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Key) {
			Key compareKey = (Key) obj;
			if(this.number == compareKey.number) {
				return true;
			} else {
				//p
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return number;
	}

}
