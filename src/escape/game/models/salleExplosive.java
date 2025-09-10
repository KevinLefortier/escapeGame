package escape.game.models;

public class salleExplosive extends Salle {
	private Enigme enigmeFausse;

	public salleExplosive(String nom, int tempsLimite, Enigme enigmeFausse) {
		super(nom, tempsLimite);
		setEnigmeFausse(enigmeFausse);
	}
	
	public void setEnigmeFausse(Enigme enigmeFausse) {
		if(ajouterEnigme(enigmeFausse)) {
			this.enigmeFausse=enigmeFausse;
		}
	}

}
