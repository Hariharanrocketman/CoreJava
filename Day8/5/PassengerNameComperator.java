package com.te.assignmentday8;

import java.util.Comparator;

public class PassengerNameComperator implements Comparator<Seat> {

		public int compare(Seat s1, Seat s2) {
		
			return s1.getPassengerName().compareTo(s2.getPassengerName());
		}
}
