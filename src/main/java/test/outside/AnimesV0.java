package test.outside;

import java.util.ArrayList;

public class AnimesV0 {

    ArrayList<String> animes = new ArrayList();

    public ArrayList<String> getAnimes() {
        return animes;
    }

    public AnimesV0() {
        animes.add("Naruto");
        animes.add("One Piece");
        animes.add("Attack on Titan");
    }

}
