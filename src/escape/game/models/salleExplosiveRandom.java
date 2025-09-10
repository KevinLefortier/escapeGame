package escape.game.models;

public class salleExplosiveRandom extends salleExplosive {

	public salleExplosiveRandom(String nom, int tempsLimite) {
		super(nom, tempsLimite, null);
	}
	
	public boolean selectRandom() {
		if(enigmes.size()>0) {
			int aleatNumber=(int) Math.round(Math.random()*enigmes.size());
			setEnigmeFausse(enigmes.get(aleatNumber));
			return true;
		}
		return false;
	}
}
