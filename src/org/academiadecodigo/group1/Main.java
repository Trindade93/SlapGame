package org.academiadecodigo.group1;
import javax.sound.sampled.*;
import java.io.IOException;

public class Main{

    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException, InterruptedException {

        Game game = new Game();

        game.gameInit();

    }
}