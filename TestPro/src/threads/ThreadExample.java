package threads;

import java.applet.Applet;

public class ThreadExample {
	public static void main(String[] args) throws InterruptedException {
		MathematicalTable myTableOf2=new MathematicalTable(2);
		myTableOf2.setName("Name: (Table of 2)");
		myTableOf2.start();
		MathematicalTable myTableof4=new MathematicalTable(4);
		myTableof4.setName("\t\tName:(Table of 4)");
		myTableof4.start();
		
		
		//With Runnable Interface
		MathematicalTableRunnable tableOf6=new MathematicalTableRunnable(6);
		Thread threadForTableOf6=new Thread(tableOf6,"\t\t\t\tTable of 6");
		threadForTableOf6.start();
		
		
		if(myTableOf2.isAlive() || myTableof4.isAlive() || threadForTableOf6.isAlive()){
			Thread.sleep(2000);
		}
		System.out.println("End of Main Method..._____________________");
		
	}
	
}

class MathematicalTableRunnable implements Runnable{
	int tableFor;
	public MathematicalTableRunnable(int tableFor) {
		// TODO Auto-generated constructor stub
		this.tableFor=tableFor;
	}
	public void showTable(){
		for(int start=1;start<=10;start++){
			System.out.println("Table for "+tableFor+"  "+(start*tableFor));
		}
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		showTable();
		
	}
	
}



class MathematicalTable extends Thread{
	int tableFor;
	public MathematicalTable(int tableFor) {
		// TODO Auto-generated constructor stub
		this.tableFor=tableFor;
	}
	public void showTable(){
		for(int start=1;start<=10;start++){
			System.out.println(getName()+"  "+(start*tableFor));
		}
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		showTable();
		
	}
	
}