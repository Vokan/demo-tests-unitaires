/**
 * 
 */
package utils;

import static org.junit.Assert.*;
import org.junit.Test;
/**
 * @author vokankocak
 *
 */
public class StringUtilsTest {

	@Test
	public void testLevenshteinDistanceDeUn() {
		int resultat = StringUtils.levenshteinDistance("Jva", "Java");
		assertEquals(1, resultat);
		}
	@Test
	public void testLevenshteinDistanceDeDeuxEnDebut() {
		int resultat2= StringUtils.levenshteinDistance("distance", "instance");
		assertEquals(2, resultat2);
	}
	@Test
	public void testLevenshteinDistanceDeDeuxEnFin() {
		int resultat3= StringUtils.levenshteinDistance("distance", "instance");
		assertEquals(2, resultat3);
	}
	@Test
	public void testLevenshteinDistanceDeUnInversion() {
		int resultat4 = StringUtils.levenshteinDistance("Java", "Jva");
		assertEquals(1, resultat4);
	}

	// Question c)
	
	public void testLevenshteinDistanceParametreNul() {
		int resultat6 = StringUtils.levenshteinDistance(null, null);
		assertEquals(0, resultat6);

	}
}