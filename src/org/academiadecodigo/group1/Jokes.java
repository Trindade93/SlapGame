package org.academiadecodigo.group1;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Jokes {

    public boolean isGoodJoke;
    public Player player;
    public Picture picture;
    public int pos;
    public String path;

    public Jokes(boolean goodJoke, String path, Player player, int pos){
        this.isGoodJoke = goodJoke;
        this.player = player;
        this.pos = pos;
        this.path = path;
        switch (this.pos){
            case 1:
                picture = new Picture(340, 300, path);
                break;
            case 2:
                picture = new Picture(340, 450, path);
                break;
            case 3:
                picture = new Picture(340, 600, path);
                break;
        }
    }

    public void drawJoke(){
        picture.draw();
    }

    public void deleteJoke(){
        picture.delete();
    }

    public boolean isGoodJoke(Jokes jokes) {
        return isGoodJoke;
    }
}
