package fr.diginamic.maison;

/** Pièce de type chambre
 * @author DIGINAMIC
 *
 */
public class Chambre extends Piece {

	/** Constructeur
	 * @param etage étage
	 * @param superficie superficie
	 */
	public Chambre(int etage, double superficie) {
		super(etage, superficie);
	}

	@Override
	public String getType() {
		return TYPE_CHAMBRE;
	}

}
