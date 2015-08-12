/**
 * 
 */
package vhdang;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


/**
 * @author haidangvo
 *
 */
public class Serialization {
 
	
	/** It is used to serialize data then write to file
	 * @param e is an Employee object
	 * @param path file name and path
	 */
	public static void saveEmployee(Employee e, String path){
		
		try {
		FileOutputStream fo = new FileOutputStream(path);
		ObjectOutputStream obju = new ObjectOutputStream(fo);
		
		obju.writeObject(e);
		obju.close();
		fo.close();
		System.out.print("Serialized data saved to " + path);
		} catch (IOException i){
			i.printStackTrace();
		}
		
		
	}
	
	/** Used to deserialize data
	 * @param path read serialized data from file
	 * @return return employee object
	 */
	public static Employee loadEmployee(String path){
		Employee e = null;
		
		try{
			FileInputStream fi = new FileInputStream(path);
			ObjectInputStream obji = new ObjectInputStream(fi);
			
			 e = (Employee) obji.readObject() ; 
			 obji.close();
			 fi.close();
			 System.out.println("Serialized data load susscessfully.");
		} catch (IOException i){
			i.printStackTrace();
		} catch (ClassNotFoundException objerr){
			objerr.printStackTrace();
		}
		
		return e;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "/Users/haidangvo/employee.data";
		//Employee e = null;
		Employee e = new Employee();
		e.setFirstName("Dang");
		e.setLastName("Vo");
		e.setAddress("Valkreer 64 Rotterdam, The Netherlands");
		e.print();
		 saveEmployee(e,path);
		
		//e = loadEmployee(path);
		//e.print();
		
	}

}
