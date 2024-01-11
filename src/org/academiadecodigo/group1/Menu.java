package org.academiadecodigo.group1;


import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Menu implements KeyboardHandler {

    int next;
    Keyboard keyboard;
    Picture entry = new Picture(10, 10, "/home/trindade/TrindadePlayground/WizardsTime/SlapGameFinal/SlapGameFinal/resources/Images/intro.png");
    Picture rules = new Picture(10, 10, "/home/trindade/TrindadePlayground/WizardsTime/SlapGameFinal/SlapGameFinal/resources/Images/rules.png");

    public Menu(int next){
        keyboard = new Keyboard(this);
        this.next = next;
        events();
    }

    public void gameStart() {
        while (next == -1) {
            entry.draw();
        }
    }

    public void rulesPrep(){
        next = 1;
        entry.delete();
    }

    public void rulesDelete(){
        rules.delete();
    }

    public void events() {
        KeyboardEvent keyNext = new KeyboardEvent();
        keyNext.setKey(KeyboardEvent.KEY_SPACE);
        keyNext.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent keyNext2 = new KeyboardEvent();
        keyNext2.setKey(KeyboardEvent.KEY_SPACE);
        keyNext2.setKeyboardEventType(KeyboardEventType.KEY_RELEASED);

        keyboard.addEventListener(keyNext);
        keyboard.addEventListener(keyNext2);
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        switch (keyboardEvent.getKey()){
            case KeyboardEvent.KEY_SPACE:
                if(next == -1){
                    rulesPrep();
                    next = 1;
                }if(next == 1){
                rulesDelete();
                next = 0;
                System.out.println(next);
            }
                break;
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {
        switch (keyboardEvent.getKey()){
            case KeyboardEvent.KEY_SPACE:
                if(next == 1){
                    rules.draw();
                }if(next == 0){
            }
        }
    }
}
