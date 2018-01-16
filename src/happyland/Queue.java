package happyland;

import javax.swing.JOptionPane;

public class Queue implements QueueADT{
	
	String [] qArray;
	int numQ = 0;
	int capacity = 6;
	
	public Queue(){
		qArray = new String[6];
	}

	public void enqueue(String q) throws Exception {
		// TODO Auto-generated method stub
		if(numQ + 1 <= capacity){
			qArray[numQ] = q;
			numQ++;
		}
	}

	public String dequeue() throws Exception {
		// TODO Auto-generated method stub
		if(numQ > 0){
			//String q = sarray[0];
			for(int i=0 ; i<numQ-1 ; i++){
				qArray[i] = qArray[i+1];
  			}
			qArray[numQ-1] = "";
  			numQ--;
  		}
		return null;
	}

	public String front() throws Exception {
		// TODO Auto-generated method stub
		if(numQ > 0){
			String q = qArray[0];
			return q;
		}
		return null;
	}

	public boolean isEmpty() {
		return numQ == 0;
		
	}

	public boolean isFull() {
		// TODO Auto-generated method stub
		return numQ == capacity-1;
	}

	public void clear() {
		// TODO Auto-generated method stub
		if(numQ > 0){
			numQ = 0;
		}
	}

	public int size() {
		// TODO Auto-generated method stub
		return numQ;
	}

}
