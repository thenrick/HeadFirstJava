package com.nationwide.chapter16;

public class Employee {

	protected long employeeId;
	protected String firstName;
	protected String lastName;

	public boolean equals(Object o) {
		if (o == null)
			return false;
		Employee other = (Employee) o;
		if (this.employeeId != other.employeeId)
			return false;
		if (!this.firstName.equals(other.firstName))
			return false;
		if (!this.lastName.equals(other.lastName))
			return false;

		return true;
	}

	public int hashCode() {
		return (int) employeeId * firstName.hashCode() * lastName.hashCode();
	}

}
