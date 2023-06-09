/*
 * Restaurant Booking System: example code to accompany
 *
 * "Practical Object-oriented Design with UML"
 * Mark Priestley
 * McGraw-Hill (2004)
 */

package application.persistency;

import application.domain.Customer;

class PersistentCustomer extends Customer {
	private int oid;

	PersistentCustomer(int id, String n, String p, int pt) {
		super(n, p, pt);
		oid = id;
	}

	int getId() {
		return oid;
	}
}
