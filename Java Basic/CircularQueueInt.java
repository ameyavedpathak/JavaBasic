package ClassWork;

public class CircularQueueInt {
	private int q[];
	private int putloc, getloc;
	
public CircularQueueInt(int size){
	q = new int[size];
	putloc = 0;
	getloc = 0;
}	

public void put(int ch)
{
	if(isFull()){
		
		System.out.println("The Queue is full - put() ignored");
		return;
	}
	q[putloc] = ch;
	putloc++;
	if(putloc ==q.length) putloc = 0;
}
public int get(){
	if(isEmpty()){
		System.out.println("The queue is empty");
		return 0;
	}
	int res = q[getloc];
	getloc++;
	if(getloc == q.length) getloc = 0;
	return res;
	
}	
boolean isEmpty(){
	return putloc == getloc;
}
boolean isFull(){
	//return (getloc == putloc+1)	|| ((getloc==0)&&(putloc == q.length-1)) ;
	return getloc == increament (putloc);
}
int increament (int index){
	index++;
	if(index ==q.length)
		index = 0;
	return index;
		
}
}


