public class ex01 {

	public static void main(String[] args) {
		
        int a=3, b=7, c=-1, d=3;

        System.out.println ("a > 0 " + (a > 0));

        System.out.println ("!a>0 " + (!(a>0)));

        System.out.println ("a + b <= c + d " + (a + b <= c + d));

        System.out.println ("a < 6 && c > d " + (a < 6 && c > d));

        System.out.println ("a < 6 || c > d " + (a < 6 || c > d));

        System.out.println ("!(a < 6) && c > d " + (!(a < 6) && c > d));

        System.out.println ("!(a < 6 && c > d) " + (!(a < 6 && c > d)));

	}
}
