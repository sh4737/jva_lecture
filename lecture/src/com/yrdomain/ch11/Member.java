package com.yrdomain.ch11;

public class Member {
	public String id;
		
	public Member(String id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member) obj;
			if(id.equals(member.id)) {
				return true;
			} else {
				//p
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return id.hashCode();
	}

}
