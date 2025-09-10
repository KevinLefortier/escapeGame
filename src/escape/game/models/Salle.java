package escape.game.models;

import java.util.ArrayList;
import java.util.List;

import escape.game.exceptions.NullResponseException;

public class Salle {
	private String nom;
	private List<Enigme> enigmes;
	private int tempsLimite;
	private boolean estTerminee;
	private Salle salleSuivante;
	
	public Salle(String nom, int tempsLimite) {
		this.nom = nom;
		this.tempsLimite = tempsLimite;
		this.enigmes=new ArrayList<>();
	}
	
	public boolean ajouterEnigme(Enigme enigme) {
		if(!enigmes.contains(enigme)) {
			return enigmes.add(enigme);
		}
		return false;
	}
	
	public boolean resoudreEnigme(int index, String reponse) throws NullResponseException {
		if(index < enigmes.size() && index >= 0) {
			return enigmes.get(index).resoudre(reponse);
		}
	return false;
	}
	
	public List<Enigme>getEnigmesNonResolues() {
		List<Enigme> nonResolues=new ArrayList<>();
		for (Enigme e : enigmes) {
			if(!e.isResolue()) {
				nonResolues.add(e);
			}
	
		}
		return nonResolues;
	}
	
	public List<Enigme> getEnigmes() {
		return enigmes;
	}
	
	public Salle getSalleSuivante() {
		return salleSuivante;
	}
	
	public boolean estTerminee() {
		return !getEnigmesNonResolues().isEmpty();
	}
	
	public boolean estSalleDeFin() {
		return salleSuivante==null;
	}
}