/**
 * 
 */
package sumador;

/**
 * @author azord
 *
 */
public class ASumar {

private String valor_inicial;
	
	/**
	 * 
	 * @param string
	 */
	public ASumar(String string) {
		this.valor_inicial = string;
		
	}
	/**
	 * 
	 * @return devuelve un valor en el caso de que sea un solo número
	 */


    public String mostrar() {
    	String numero = valor_inicial;
    	if(numero.length() == 1) {
    		return (numero + "=" + numero);
    	}
    	    return null;
    }
}