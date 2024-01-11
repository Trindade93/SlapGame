package org.academiadecodigo.group1;

import org.academiadecodigo.group1.gfx.Meter;
import org.academiadecodigo.group1.gfx.Slap;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;
import java.util.ArrayList;

public class Game {

    int next = -1;
    Player player = new Player();
    Menu menu = new Menu(next);
    Slap slap = new Slap(player);
    Meter meter = new Meter();
    Jokes joke;
    Picture stage = new Picture(10, 10, "/home/trindade/TrindadePlayground/WizardsTime/SlapGameFinal/SlapGameFinal/resources/Images/stageF1.png");
    Picture slapPicture = new Picture(880, 650, "/home/trindade/TrindadePlayground/WizardsTime/SlapGameFinal/SlapGameFinal/resources/Images/slap.png");
    String chopSuey = "/home/trindade/TrindadePlayground/WizardsTime/SlapGameFinal/SlapGameFinal/resources/Audio/chopSuey.wav";

    public Game() throws InterruptedException {
    }

    public void gameInit() throws UnsupportedAudioFileException, LineUnavailableException, IOException, InterruptedException {

        Sound.playMusic(chopSuey);
        menu.gameStart();
        menu.rulesPrep();
        menu.rulesDelete();
        stage.draw();
        player.init();

        for (int x = 0; x < 11; x++) {
            if (x == 10 || player.getDodge()) {
                Picture picture = new Picture(10, 10,"/home/trindade/TrindadePlayground/WizardsTime/SlapGameFinal/SlapGameFinal/resources/Images/credits.png");
                picture.draw();
                break;
            }

            player.choice = -1;
            player.setDodge(false);

            Jokes joke1 = jokesPos1.get((int) (Math.random() * 14));
            joke1.drawJoke();
            Jokes joke2 = jokesPos2.get((int) (Math.random() * 14));
            joke2.drawJoke();
            Jokes joke3 = jokesPos3.get((int) (Math.random() * 14));
            joke3.drawJoke();

            while (player.choice == -1) {
                System.out.println(".");
            }

            joke1.deleteJoke();
            joke2.deleteJoke();
            joke3.deleteJoke();

            slap.drawSlap(slapPicture);

            switch (player.getChoice()) {
                case 1:
                    int random = (int) (Math.random() * 10);
                    joke = joke1;
                    scoreCalc();
                    if (random >= 1) {
                        while (slapPicture.getX() != stage.getX()) {
                            if (slap.moveSlap(slapPicture) != 1) {
                                Thread.sleep(10);
                            }else{
                                break;
                            }
                        }
                        slapPicture.translate( slapPicture.getX() - stage.getX() + 700, 0);
                    }
                    continue;
                case 2:
                    int random1 = (int) (Math.random() * 10);
                    joke = joke2;
                    scoreCalc();
                    if (random1 > 1) {
                        while (slapPicture.getX() != stage.getX()) {
                            if (slap.moveSlap(slapPicture) != 1) {
                                Thread.sleep(10);
                            }else{
                                break;
                            }
                        }
                        slapPicture.translate( slapPicture.getX() - stage.getX() + 700, 0);
                    }
                    continue;
                case 3:
                    int random2 = (int) (Math.random() * 10);
                    joke = joke3;
                    scoreCalc();
                    if (random2 >= 1) {
                        while (slapPicture.getX() != stage.getX()) {
                            if (slap.moveSlap(slapPicture) != 1) {
                                Thread.sleep(10);
                            }else{
                                break;
                            }
                        }
                        slapPicture.translate( slapPicture.getX() - stage.getX() + 700, 0);
                    }
            }
        }
    }

    public void scoreCalc() {
        if (joke.isGoodJoke(joke)) {
            player.setScore(player.getScore() + 10);
        } else {
            player.setScore(player.getScore() - 10);
        }
        meter.fillInnerMeter();
    }

    ArrayList<Jokes> jokesPos1 = instanciaJokes(1, player);
    ArrayList<Jokes> jokesPos2 = instanciaJokes(2, player);
    ArrayList<Jokes> jokesPos3 = instanciaJokes(3, player);

    private static ArrayList<Jokes> instanciaJokes(int pos, Player player) {
        ArrayList<Jokes> jokes = new ArrayList<>();

        if (pos == 1) {
            jokes.add(new Jokes(true, "/home/trindade/TrindadePlayground/WizardsTime/SlapGameFinal/SlapGameFinal/resources/Images/bj01.png", player, pos));
            jokes.add(new Jokes(true, "/home/trindade/TrindadePlayground/WizardsTime/SlapGameFinal/SlapGameFinal/resources/Images/gj04.png", player, pos));
            jokes.add(new Jokes(true, "/home/trindade/TrindadePlayground/WizardsTime/SlapGameFinal/SlapGameFinal/resources/Images/gj07.png", player, pos));
            jokes.add(new Jokes(true, "/home/trindade/TrindadePlayground/WizardsTime/SlapGameFinal/SlapGameFinal/resources/Images/gj10.png", player, pos));
            jokes.add(new Jokes(true, "/home/trindade/TrindadePlayground/WizardsTime/SlapGameFinal/SlapGameFinal/resources/Images/gj13.png", player, pos));
            jokes.add(new Jokes(true, "/home/trindade/TrindadePlayground/WizardsTime/SlapGameFinal/SlapGameFinal/resources/Images/gj16.png", player, pos));
            jokes.add(new Jokes(true, "/home/trindade/TrindadePlayground/WizardsTime/SlapGameFinal/SlapGameFinal/resources/Images/gj19.png", player, pos));
            jokes.add(new Jokes(true, "/home/trindade/TrindadePlayground/WizardsTime/SlapGameFinal/SlapGameFinal/resources/Images/gj22.png", player, pos));
            jokes.add(new Jokes(false, "/home/trindade/TrindadePlayground/WizardsTime/SlapGameFinal/SlapGameFinal/resources/Images/bj03.png", player, pos));
            jokes.add(new Jokes(false, "/home/trindade/TrindadePlayground/WizardsTime/SlapGameFinal/SlapGameFinal/resources/Images/bj06.png", player, pos));
            jokes.add(new Jokes(false, "/home/trindade/TrindadePlayground/WizardsTime/SlapGameFinal/SlapGameFinal/resources/Images/bj09.png", player, pos));
            jokes.add(new Jokes(false, "/home/trindade/TrindadePlayground/WizardsTime/SlapGameFinal/SlapGameFinal/resources/Images/bj12.png", player, pos));
            jokes.add(new Jokes(false, "/home/trindade/TrindadePlayground/WizardsTime/SlapGameFinal/SlapGameFinal/resources/Images/bj15.png", player, pos));
            jokes.add(new Jokes(false, "/home/trindade/TrindadePlayground/WizardsTime/SlapGameFinal/SlapGameFinal/resources/Images/bj18.png", player, pos));
            jokes.add(new Jokes(false, "/home/trindade/TrindadePlayground/WizardsTime/SlapGameFinal/SlapGameFinal/resources/Images/bj21.png", player, pos));
        }

        if (pos == 2) {
            jokes.add(new Jokes(true, "/home/trindade/TrindadePlayground/WizardsTime/SlapGameFinal/SlapGameFinal/resources/Images/gj02.png", player, pos));
            jokes.add(new Jokes(true, "/home/trindade/TrindadePlayground/WizardsTime/SlapGameFinal/SlapGameFinal/resources/Images/gj05.png", player, pos));
            jokes.add(new Jokes(true, "/home/trindade/TrindadePlayground/WizardsTime/SlapGameFinal/SlapGameFinal/resources/Images/gj08.png", player, pos));
            jokes.add(new Jokes(true, "/home/trindade/TrindadePlayground/WizardsTime/SlapGameFinal/SlapGameFinal/resources/Images/gj11.png", player, pos));
            jokes.add(new Jokes(true, "/home/trindade/TrindadePlayground/WizardsTime/SlapGameFinal/SlapGameFinal/resources/Images/gj14.png", player, pos));
            jokes.add(new Jokes(true, "/home/trindade/TrindadePlayground/WizardsTime/SlapGameFinal/SlapGameFinal/resources/Images/gj17.png", player, pos));
            jokes.add(new Jokes(true, "/home/trindade/TrindadePlayground/WizardsTime/SlapGameFinal/SlapGameFinal/resources/Images/gj20.png", player, pos));
            jokes.add(new Jokes(false, "/home/trindade/TrindadePlayground/WizardsTime/SlapGameFinal/SlapGameFinal/resources/Images/bj01.png", player, pos));
            jokes.add(new Jokes(false, "/home/trindade/TrindadePlayground/WizardsTime/SlapGameFinal/SlapGameFinal/resources/Images/bj04.png", player, pos));
            jokes.add(new Jokes(false, "/home/trindade/TrindadePlayground/WizardsTime/SlapGameFinal/SlapGameFinal/resources/Images/bj07.png", player, pos));
            jokes.add(new Jokes(false, "/home/trindade/TrindadePlayground/WizardsTime/SlapGameFinal/SlapGameFinal/resources/Images/bj10.png", player, pos));
            jokes.add(new Jokes(false, "/home/trindade/TrindadePlayground/WizardsTime/SlapGameFinal/SlapGameFinal/resources/Images/bj13.png", player, pos));
            jokes.add(new Jokes(false, "/home/trindade/TrindadePlayground/WizardsTime/SlapGameFinal/SlapGameFinal/resources/Images/bj16.png", player, pos));
            jokes.add(new Jokes(false, "/home/trindade/TrindadePlayground/WizardsTime/SlapGameFinal/SlapGameFinal/resources/Images/bj19.png", player, pos));
            jokes.add(new Jokes(false, "/home/trindade/TrindadePlayground/WizardsTime/SlapGameFinal/SlapGameFinal/resources/Images/bj22.png", player, pos));
        }

        if (pos == 3) {
            jokes.add(new Jokes(true, "/home/trindade/TrindadePlayground/WizardsTime/SlapGameFinal/SlapGameFinal/resources/Images/gj03.png", player, pos));
            jokes.add(new Jokes(true, "/home/trindade/TrindadePlayground/WizardsTime/SlapGameFinal/SlapGameFinal/resources/Images/gj06.png", player, pos));
            jokes.add(new Jokes(true, "/home/trindade/TrindadePlayground/WizardsTime/SlapGameFinal/SlapGameFinal/resources/Images/gj09.png", player, pos));
            jokes.add(new Jokes(true, "/home/trindade/TrindadePlayground/WizardsTime/SlapGameFinal/SlapGameFinal/resources/Images/gj12.png", player, pos));
            jokes.add(new Jokes(true, "/home/trindade/TrindadePlayground/WizardsTime/SlapGameFinal/SlapGameFinal/resources/Images/gj15.png", player, pos));
            jokes.add(new Jokes(true, "/home/trindade/TrindadePlayground/WizardsTime/SlapGameFinal/SlapGameFinal/resources/Images/gj18.png", player, pos));
            jokes.add(new Jokes(true, "/home/trindade/TrindadePlayground/WizardsTime/SlapGameFinal/SlapGameFinal/resources/Images/gj21.png", player, pos));
            jokes.add(new Jokes(false, "/home/trindade/TrindadePlayground/WizardsTime/SlapGameFinal/SlapGameFinal/resources/Images/bj02.png", player, pos));
            jokes.add(new Jokes(false, "/home/trindade/TrindadePlayground/WizardsTime/SlapGameFinal/SlapGameFinal/resources/Images/bj05.png", player, pos));
            jokes.add(new Jokes(false, "/home/trindade/TrindadePlayground/WizardsTime/SlapGameFinal/SlapGameFinal/resources/Images/bj08.png", player, pos));
            jokes.add(new Jokes(false, "/home/trindade/TrindadePlayground/WizardsTime/SlapGameFinal/SlapGameFinal/resources/Images/bj11.png", player, pos));
            jokes.add(new Jokes(false, "/home/trindade/TrindadePlayground/WizardsTime/SlapGameFinal/SlapGameFinal/resources/Images/bj14.png", player, pos));
            jokes.add(new Jokes(false, "/home/trindade/TrindadePlayground/WizardsTime/SlapGameFinal/SlapGameFinal/resources/Images/bj17.png", player, pos));
            jokes.add(new Jokes(false, "/home/trindade/TrindadePlayground/WizardsTime/SlapGameFinal/SlapGameFinal/resources/Images/bj20.png", player, pos));
        }

        return jokes;
    }
}

