package ma.enset.calcul;

import junit.framework.TestCase;

public class CalculMetierTest extends TestCase {
    private CalculMetier metier;
	protected void setUp() throws Exception {
		super.setUp();
		metier= new CalculMetier();
	}
	
	public void testSomme() {
		assertTrue(metier.somme(6,2)==8);
	}
	public void testProduit() {
		assertTrue(metier.produit(6,2)==12);
	}
	


	
}
