public class Piece {

  public int x;
  public int y;
  public Joueur joueur;
  protected String symbole;

  public Piece(Joueur joueur) {
    this.joueur = joueur;
  }

  public String toString() {
    return joueur.couleur + symbole + Affichage.ANSI_RESET;
  }

}
