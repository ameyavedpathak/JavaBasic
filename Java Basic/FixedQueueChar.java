package ClassWork;

public class FixedQueueChar {
	private char q[];
	private int putloc, getloc;
	
public FixedQueueChar(int size){
	q = new char [size];
	putloc = 0;
	getloc = 0;
}	

public void put(char ch)
{
	if(isFull()){
		
		System.out.println("The Queue is full - put() ignored");
		return;
	}
	q[putloc] = ch;
	putloc++;
}
public char get(){
	if(isEmpty()){
		System.out.println("The queue is full");
		return 0;
	}
	char res = q[getloc];
	getloc++;
	return res;
	
}	
boolean isEmpty(){
	return putloc == getloc;
}
boolean isFull(){
	return putloc == q.length;
}
}
