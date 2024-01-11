package org.academiadecodigo.group1;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Player implements KeyboardHandler {

    private int score = 0;
    public int choice = -1;
    Picture comedianImage = new Picture(100, 550, "/home/trindade/TrindadePlayground/WizardsTime/SlapGameFinal/SlapGameFinal/resources/Images/comedianForward.png");
    private Keyboard keyboard;
    private boolean dodge = false;

    public Player() {
        keyboard = new Keyboard(this);
    }

    public int getScore() {
        return score;
    }

    public boolean getDodge() {
        return dodge;
    }

    public void setDodge(boolean dodge) {
        this.dodge = dodge;
    }

    public Picture getComedianImage() {
        return comedianImage;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setComedianImage(Picture comedianImage) {
        this.comedianImage = comedianImage;
    }

    public void init() {
        comedianImage.draw();
        events();
    }

    public int getChoice() {
        return choice;
    }

    public void setChoice(int choice) {
        this.choice = choice;
    }

    public void events() {

        KeyboardEvent up = new KeyboardEvent();
        up.setKey(KeyboardEvent.KEY_UP);
        up.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent down = new KeyboardEvent();
        down.setKey(KeyboardEvent.KEY_DOWN);
        down.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent upToDown = new KeyboardEvent();
        upToDown.setKey(KeyboardEvent.KEY_UP);
        upToDown.setKeyboardEventType(KeyboardEventType.KEY_RELEASED);

        KeyboardEvent downToUp = new KeyboardEvent();
        downToUp.setKey(KeyboardEvent.KEY_DOWN);
        downToUp.setKeyboardEventType(KeyboardEventType.KEY_RELEASED);

        KeyboardEvent resp1 = new KeyboardEvent();
        resp1.setKey(KeyboardEvent.KEY_1);
        resp1.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent resp2 = new KeyboardEvent();
        resp2.setKey(KeyboardEvent.KEY_2);
        resp2.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent resp3 = new KeyboardEvent();
        resp3.setKey(KeyboardEvent.KEY_3);
        resp3.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        keyboard.addEventListener((up));
        keyboard.addEventListener(down);
        keyboard.addEventListener(downToUp);
        keyboard.addEventListener(upToDown);
        keyboard.addEventListener(resp1);
        keyboard.addEventListener(resp2);
        keyboard.addEventListener(resp3);
    }

    public void comiDown() {
        comedianImage = new Picture(100, 650, "resources/Images/comedianDuck.png");
        comedianImage.draw();
    }

    public void comiUp() {
        comedianImage = new Picture(100, 300, "resources/Images/comedianJump.png");
        comedianImage.draw();
        System.out.println("tas n ar");
    }

    public void comidReturn() {
        comedianImage = new Picture(100, 550, "resources/Images/comedianForward.png");
        comedianImage.draw();
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_UP:
                comedianImage.delete();
                comiUp();
                dodge = true;
                break;
            case KeyboardEvent.KEY_DOWN:
                comedianImage.delete();
                comiDown();
                dodge = true;
                break;
        }
        if (keyboardEvent.getKey() == KeyboardEvent.KEY_1) {
            choice = 1;
            System.out.println("Escolhi 1");
        }
        if (keyboardEvent.getKey() == KeyboardEvent.KEY_2) {
            choice = 2;
            System.out.println("Escolhi 2");
        }
        if (keyboardEvent.getKey() == KeyboardEvent.KEY_3) {
            choice = 3;
            System.out.println("Escolhi 3");
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {
        if (keyboardEvent.getKey() == KeyboardEvent.KEY_DOWN) {
            comedianImage.delete();
            comidReturn();
            dodge = false;
        }
        if (keyboardEvent.getKey() == KeyboardEvent.KEY_UP) {
            comedianImage.delete();
            comidReturn();
            dodge = false;
        }
    }
}
