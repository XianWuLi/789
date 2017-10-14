package com.zhiyou100.video.controller;

public class array {
/*	byte[] bytes = new byte[10];

	String str = "abcedfg";

	byte[]怎么转换成String类型？

	String类型怎么转换成byte[]类型？*/
	
	public static void main(String[] args) {
		byte[] bytes = new byte[10];
		String str = "abcedfg";
		String a = bytes.toString();
		byte[] bytes1 = str.getBytes();
	}

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		array other = (array) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "array [name=" + name + "]";
	}
	
}
