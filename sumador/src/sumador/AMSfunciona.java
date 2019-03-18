/**
 * 
 */
package sumador;
import  java.util.Scanner ;

/**
 * @author azord
 *
 */
public class AMSfunciona {

	/**
	 * 
	 * @param args
	 */

   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Introduce un número: ");
	String num = sc.next();
	ASumar suma = new ASumar(num);
	System.out.println(suma.mostrar());
	}

 
}
