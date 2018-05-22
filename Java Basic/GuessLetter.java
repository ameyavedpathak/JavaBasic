public class GuessLetter
{
public static void main(String args[]) throws java.io.IOException{

char maxNum = 'Z', minNum = 'A';
char ch;
			maxNum=(char)System.in.read();
			double r = (maxNum+1-minNum)* Math.random() +minNum;
			char answer = (char)r;
			System.out.println(answer);
			
			while(true)
			{
			
			System.out.println("I'm thinking of letter between A nd Z");
			
			do {
			
			ch= (char) System.in.read();
			}
			while(ch<minNum || ch>maxNum);
			
				if(ch==answer) 
			{
				System.out.println("**Right**");
				break;
			}
			else
			{
				if(ch<answer) 
				System.out.println("**Guess higher**");
				else 
				System.out.println("**Guess Lower**");
			
			}

}
}
}

