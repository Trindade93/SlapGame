package org.academiadecodigo.group1.gfx;

import org.academiadecodigo.group1.Player;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Meter {
    public Picture borderMeter = new Picture(860, 620, "/home/trindade/TrindadePlayground/WizardsTime/SlapGameFinal/SlapGameFinal/resources/Images/meter1.png");
    public Picture fillMeter = new Picture(914, 740, "/home/trindade/TrindadePlayground/WizardsTime/SlapGameFinal/SlapGameFinal/resources/Images/brick.jpg");
    public Picture fillMeter2 = new Picture(914, 733, "/home/trindade/TrindadePlayground/WizardsTime/SlapGameFinal/SlapGameFinal/resources/Images/brick.jpg");
    public Picture fillMeter3 = new Picture(914, 711, "/home/trindade/TrindadePlayground/WizardsTime/SlapGameFinal/SlapGameFinal/resources/Images/brick.jpg");
    public Picture fillMeter4 = new Picture(914, 689, "/home/trindade/TrindadePlayground/WizardsTime/SlapGameFinal/SlapGameFinal/resources/Images/brick.jpg");
    public Picture fillMeter5 = new Picture(914, 667, "/home/trindade/TrindadePlayground/WizardsTime/SlapGameFinal/SlapGameFinal/resources/Images/brick.jpg");
    public Picture fillMeter6 = new Picture(914, 645, "/home/trindade/TrindadePlayground/WizardsTime/SlapGameFinal/SlapGameFinal/resources/Images/brick.jpg");
    public Picture fillMeter7 = new Picture(914, 623, "/home/trindade/TrindadePlayground/WizardsTime/SlapGameFinal/SlapGameFinal/resources/Images/brick.jpg");
    public Picture fillMeter8 = new Picture(914, 601, "/home/trindade/TrindadePlayground/WizardsTime/SlapGameFinal/SlapGameFinal/resources/Images/brick.jpg");
    public Picture fillMeter9 = new Picture(914, 585, "/home/trindade/TrindadePlayground/WizardsTime/SlapGameFinal/SlapGameFinal/resources/Images/brick.jpg");
    public Picture fillMeter10 = new Picture(914, 575, "/home/trindade/TrindadePlayground/WizardsTime/SlapGameFinal/SlapGameFinal/resources/Images/brick.jpg");

    Player player = new Player();

    public Color color;

    public void init() {
        borderMeter.draw();
    }

    public void fillInnerMeter1() {
        fillMeter.draw();
    }

    public void fillInnerMeter2() {
        fillMeter.draw();
        fillMeter2.draw();
    }

    public void fillInnerMeter3 () {
        fillMeter.draw();
        fillMeter2.draw();
        fillMeter3.draw();
    }

    public void fillInnerMeter4 () {
        fillMeter.draw();
        fillMeter2.draw();
        fillMeter3.draw();
        fillMeter4.draw();
    }

    public void fillInnerMeter5 () {
        fillMeter.draw();
        fillMeter2.draw();
        fillMeter3.draw();
        fillMeter4.draw();
        fillMeter5.draw();
    }

    public void fillInnerMeter6 () {
        fillMeter.draw();
        fillMeter6.draw();
        fillMeter2.draw();
        fillMeter3.draw();
        fillMeter4.draw();
        fillMeter5.draw();
    }

    public void fillInnerMeter7 () {
        fillMeter.draw();
        fillMeter7.draw();
        fillMeter2.draw();
        fillMeter3.draw();
        fillMeter4.draw();
        fillMeter5.draw();
        fillMeter6.draw();
    }

    public void fillInnerMeter8() {
        fillMeter.draw();
        fillMeter6.draw();
        fillMeter2.draw();
        fillMeter3.draw();
        fillMeter4.draw();
        fillMeter5.draw();
        fillMeter7.draw();
        fillMeter8.draw();
    }

    public void fillInnerMeter9 () {
        fillMeter.draw();
        fillMeter9.draw();
        fillMeter2.draw();
        fillMeter3.draw();
        fillMeter4.draw();
        fillMeter5.draw();
        fillMeter6.draw();
        fillMeter7.draw();
        fillMeter8.draw();
    }

    public void fillInnerMeter10 () {
        fillMeter.draw();
        fillMeter2.draw();
        fillMeter3.draw();
        fillMeter4.draw();
        fillMeter5.draw();
        fillMeter6.draw();
        fillMeter7.draw();
        fillMeter8.draw();
        fillMeter9.draw();
        fillMeter10.draw();
    }

    public void fillInnerMeter() {
        switch (player.getScore()) {
            case 10:
                fillInnerMeter1();
                break;
            case 20:
                fillInnerMeter1();
                fillInnerMeter2();
                break;
            case 30:
                fillInnerMeter1();
                fillInnerMeter2();
                fillInnerMeter3();
                break;
            case 40:
                fillInnerMeter1();
                fillInnerMeter2();
                fillInnerMeter3();
                fillInnerMeter4();
                break;
            case 50:
                fillInnerMeter1();
                fillInnerMeter2();
                fillInnerMeter3();
                fillInnerMeter4();
                fillInnerMeter5();
                break;
            case 60:
                fillInnerMeter1();
                fillInnerMeter2();
                fillInnerMeter3();
                fillInnerMeter4();
                fillInnerMeter5();
                fillInnerMeter6();
                break;
            case 70:
                fillInnerMeter1();
                fillInnerMeter2();
                fillInnerMeter3();
                fillInnerMeter4();
                fillInnerMeter5();
                fillInnerMeter6();
                fillInnerMeter7();
                break;
            case 80:
                fillInnerMeter1();
                fillInnerMeter2();
                fillInnerMeter3();
                fillInnerMeter4();
                fillInnerMeter5();
                fillInnerMeter6();
                fillInnerMeter7();
                fillInnerMeter8();
                break;
            case 90:
                fillInnerMeter1();
                fillInnerMeter2();
                fillInnerMeter3();
                fillInnerMeter4();
                fillInnerMeter5();
                fillInnerMeter6();
                fillInnerMeter7();
                fillInnerMeter8();
                fillInnerMeter9();
                break;
            case 100:
                fillInnerMeter10();
                fillInnerMeter1();
                fillInnerMeter2();
                fillInnerMeter3();
                fillInnerMeter4();
                fillInnerMeter5();
                fillInnerMeter6();
                fillInnerMeter7();
                fillInnerMeter8();
                fillInnerMeter9();

        }

    }
}