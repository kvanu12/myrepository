//package mysecond;

public class Reverse {

	public static void main(String args[]) {
		String x = "WELCOME";
		char y[] = x.toCharArray();
		int size =y.length;
		char a[]= new char[size];
		int i=0, j=size;
		while(i!=size) {
			j--;
			a[j]=y[i];
			++i;
		}
		System.out.println(y);
		System.out.println(a);
			
		

	}

}
