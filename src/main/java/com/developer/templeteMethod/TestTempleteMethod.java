package com.developer.templeteMethod;

public class TestTempleteMethod {
      
	static Insertdata insertdata = null;
	
	public static void main(String[] args) {
		System.out.println("===========Updatedata========== \n");
		Updatedata updatedata = new Updatedata();
		Insertdata update = null;
		update.processdata();

		System.out.println("===========Deletedata========== \n");
		Insertdata deletedata = new Deletedata();
		Insertdata delete = null;
		delete.processdata();
	}
	}

