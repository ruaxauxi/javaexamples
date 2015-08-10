/**
 * 
 */
package vhdang;

import java.io.Serializable; 

/**
 * @author haidangvo
 *
 */
//@SuppressWarnings("serial")
public class Employee {
		private  String firstName;
		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		private  String lastName;
		private  String address;
		
		public void print(){
			System.out.println(firstName + " " + lastName + " is living at "+ address);
		}
}
