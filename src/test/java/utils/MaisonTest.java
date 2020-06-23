/**
 * 
 */
package utils;

import org.junit.Assert;
import org.junit.Test;

import fr.diginamic.maison.Chambre;
import fr.diginamic.maison.Maison;

/**
 * @author vokankocak
 *
 */
public class MaisonTest {

	@Test
	public void testAjouterPiece () {
		
		// comme AjouterPiece est un methode Void
		// elle ne renvoie rien. Il faut faire un test
		// pour une piece donc la surface est null.
		Maison objetMaison = new Maison();
		objetMaison.ajouterPiece(null);
		
		objetMaison.calculerSurface();
		Assert.assertEquals(0,0,0.0001);		
	}

	//Test pour une surface negative 
	@Test
	public void testSuperficieTypePiece() {
		Maison superficienegative = new Maison();
		superficienegative.ajouterPiece(new Chambre (-10,1));
		Assert.assertEquals(0,0,-10.0);
	}
	

}


