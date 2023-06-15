package org.dxc.model;

public class Capital extends City implements Comparable<Capital> {

	@Override
	public int compareTo(Capital other) {
		
		return this.getName().compareTo(other.getName());
	}

}
