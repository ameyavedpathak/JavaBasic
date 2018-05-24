package ClassWork;

public class QueueDemo {
	public static void main(String[] args) {
//		FixedQueueChar q1 = new FixedQueueChar(10);
//		CircularQueueChar q1 = new CircularQueueChar(10);
		CircularQueueInt q1 = new CircularQueueInt(3);
		CircularQueue<Integer> q1 = new CircularQueue<Integer>(3);
		
		
		q1.put(1);
		q1.put(2);
		q1.put(3);
		q1.put(4);
		q1.put(5);

		System.out.print(q1.get());
		System.out.print(q1.get());
		System.out.print(q1.get());
		System.out.print(q1.get());
//		System.out.print(q1.get());
		
//		q1.put('A');
//		q1.put('B');
//		q1.put('C');
//		q1.put('D');
//		System.out.print(q1.get());
//		System.out.print(q1.get());
//		System.out.print(q1.get());
//		System.out.print(q1.get());
//		q1.put('E');
//		q1.put('F');
//		q1.put('G');
//		q1.put('H');
//		q1.put('I');
//		System.out.print(q1.get());
//		System.out.print(q1.get());
//		System.out.print(q1.get());
//		q1.put('J');
//		q1.put('K');
//		q1.put('L');
//		q1.put('M');
//		q1.put('N');
//		q1.put('O');
//		System.out.print(q1.get());
//		System.out.print(q1.get());
//		System.out.print(q1.get());
//		System.out.print(q1.get());
//		System.out.print(q1.get());
		
	}

}
