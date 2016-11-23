package jrl.deint.deportesfavoritos.Modelo;

import java.util.ArrayList;

import jrl.deint.deportesfavoritos.R;

/**
 * Created by usuario on 23/11/16.
 */

public class Repository {

    private ArrayList<Sport> sports;

    public ArrayList<Sport> getSports() {
        return sports;
    }

    public Repository() {
        sports = new ArrayList<Sport>();
        addSport(R.drawable.baloncesto, "Baloncesto");
        addSport(R.drawable.futbol, "Fútbol");
        addSport(R.drawable.motociclismo, "Motociclismo");
        addSport(R.drawable.natacion, "Natación");
        addSport(R.drawable.golf, "Golf");
        addSport(R.drawable.atletismo, "Atletismo");
    }

    public boolean addSport(int idImage, String sportName) {
        boolean result = false;
        Sport sport = new Sport();
        sport.setIdImage(idImage);
        sport.setName(sportName);
        if(!this.sports.contains(sport))
            if(this.sports.add(sport))
                result = true;
        return result;
    }

}
