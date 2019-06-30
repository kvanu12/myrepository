
public class StringReverse {

	public static void main(String[] args) {
				String original = "WELCOME";
				String reverse= null;
				String s1="";
				String s2="";
				for (int i = 3;i<original.length();i++)
				{
					s1 = s1+original.charAt(i);
				}
				System.out.println(s1);
				for (int i=0;i<=2; i++)
				{
					s2=s2+original.charAt(i);
				}
				System.out.println(s2);
				reverse=s1+s2;
				System.out.println(reverse);
			}

		

	}


