package escape.game.models;

public class SalleOne extends Salle {

	public SalleOne(String nom, int tempsLimite) {
		super(nom, tempsLimite);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean estTerminee() {
		for(Enigme e:enigmes) {
			if(e.isResolue()) {
				return true;
			}
		}
		return false;
	}

}