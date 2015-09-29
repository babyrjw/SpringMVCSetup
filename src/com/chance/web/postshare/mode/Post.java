package com.chance.web.postshare.mode;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Post")
public class Post {
	private int code;

	public int getCode() {
		return code;
	}
	@XmlElement
	public void setCode(int code) {
		this.code = code;
	}
	
}
