package org.academiadecodigo.group1.gfx;

import java.io.IOException;
import java.util.Objects;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import org.academiadecodigo.group1.Player;
import org.academiadecodigo.group1.Sound;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Slap {

    Player player;
    String filePathEstalo = "resources/Audio/slap.wav";

    public Slap(Player player) throws InterruptedException {
        this.player = player;
    }

    public void drawSlap(Picture picture){
        picture.draw();
    }

    public int moveSlap(Picture picture) throws UnsupportedAudioFileException, LineUnavailableException, IOException {
            picture.translate(-10, 0);
            return checkHit(picture);
    }

    public int checkHit(Picture slap) throws UnsupportedAudioFileException, LineUnavailableException, IOException {

          if(slap.getX() + slap.getMaxX() <= player.getComedianImage().getX() + player.getComedianImage().getMaxX() && !player.getDodge()) {
            System.out.println("You got hit!");
            slap.delete();
            Sound.playMusic(filePathEstalo);
            player.setDodge(true);
            return 1;
        } else {
            System.out.println("You dodged");
            return 2;
        }

    }

   /* public boolean init() throws InterruptedException, UnsupportedAudioFileException, IOException, LineUnavailableException{
        
        
        picture.draw();
      //  Sound.playMusic(filePathEstalo);

        for (int i=0; i<= 1000; i++){
            
            picture.translate(-1, 0);
            switch (checkHit(picture)){
                case 0 :
                case 1 :
                    return true;
                case 2 : break;
            }
            Thread.sleep(5);
        }
        return false;
    }*/

}
