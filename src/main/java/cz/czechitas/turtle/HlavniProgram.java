package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {
    private Turtle zofka = new Turtle();

    public void start() {

        /*zofka.turnLeft(90);
        zofka.penUp();
        zofka.move(100);
        zofka.turnRight(90);
        zofka.penDown();*/

        nakresliObdlznik(100,200, Color.orange);
        zofka.turnRight(180);
        zofka.penUp();
        zofka.move(100);
      //  zofka.turnRight(180);
        nakresliObdlznik2(300,100, Color.green);

        zofka.penUp();
        zofka.move(50);
        zofka.turnLeft(90);
        zofka.move(40);
        zofka.turnRight(90);
        zofka.move(25);
       // zofka.turnRight(180);

        nakresliKruh(40, Color.pink);

        zofka.turnRight(106);
        //zofka.turnLeft(144);
        zofka.penUp();
        zofka.move(200);
        zofka.turnLeft(90);
        zofka.move(20);
        nakresliKruh(20, Color.pink);

        zofka.turnRight(20);
        zofka.penUp();
        zofka.move(130);
        nakresliKruh(20, Color.pink);

        zofka.penUp();
        zofka.move(120);
        zofka.turnLeft(162);

        double stranaTrojuholnika = 100;
        double preponaT = Math.sqrt(2*Math.pow(stranaTrojuholnika, 2));
        zofka.penDown();
        zofka.setPenColor(Color.black);
        zofka.move(stranaTrojuholnika);
        zofka.turnRight(90);
        zofka.move(stranaTrojuholnika);
        zofka.turnRight(135);
        zofka.move(preponaT);

      //  zofka.move(50);
       // zofka.turnLeft(180);

        //nakresliTrojuholnik(150,Color.blue);




        //nakresliKruh(100, Color.pink);

       // nakresliStvorec(200, Color.blue);

        /*double stranaT = 150;
        double prepona = Math.sqrt(2*Math.pow(stranaT, 2));
        nakresliPravRovnoTrojuhol(100, prepona, Color.black);*/


    }



        /*public void nakresliRovnostrannyTrojuhelnik(double velikostStrany) {
            // Zde lze používat proměnnou velikostStrany.
            // Jeji hodnota je takova, s jakou byla metoda zavolana
            zofka.move(velikostStrany);
            zofka.turnLeft(120.0);
            zofka.move(velikostStrany);
            zofka.turnLeft(120.0);
            zofka.move(velikostStrany);
            zofka.turnLeft(120.0);
        }*/

    public void nakresliTrojuholnik (double velkostStranyT, Color farbaTrojuholnika) {
        zofka.setPenColor(farbaTrojuholnika);
        zofka.move(velkostStranyT);
        zofka.turnLeft(120.0);
        zofka.move(velkostStranyT);
        zofka.turnLeft(120.0);
        zofka.move(velkostStranyT);
        zofka.turnLeft(120.0);
    }
public void nakresliObdlznik2 (double stranaX, double stranaY, Color farbaObdl) {
    zofka.setPenColor(farbaObdl);
    zofka.penDown();
    zofka.turnRight(90);
    zofka.move(stranaX);
    zofka.turnLeft(90);
    zofka.move(stranaY);
    zofka.turnLeft(90);
    zofka.move(stranaX);
}

    public void nakresliPravRovnoTrojuhol (double stranaT, double prepona, Color farbaT) {
        // double prepona = Math.sqrt(2*Math.pow(stranaT, 2));
        zofka.setPenColor(farbaT);
        zofka.penDown();
        zofka.turnRight(45);
        zofka.move(stranaT);
        zofka.turnRight(90);
        zofka.move(stranaT);
        zofka.turnRight(135);
        zofka.move(prepona);
    }

    public void nakresliStvorec (double stranaStvorca, Color farbaStvorca) {
        zofka.setPenColor(farbaStvorca);
        for (int s = 0; s < 4; s++) {
            zofka.penDown();
            zofka.turnRight(90);
            zofka.move(stranaStvorca);
        }
    }
    public void nakresliObdlznik (double stranaA, double stranaB, Color farbaObdlznika) {
        zofka.setPenColor(farbaObdlznika);
        for (int o = 0; o < 2; o++) {
            zofka.penDown();
            zofka.turnRight(90);
            zofka.move(stranaA);
            zofka.turnRight(90);
            zofka.move(stranaB);
        }
    }
  public void nakresliKruh(double dlzkaStrany, Color farbaKruhu) {
      zofka.setPenColor(farbaKruhu);
      zofka.penDown();
      for (int z = 0; z < 12; z++) {
          zofka.turnRight(36);
          zofka.move(dlzkaStrany);
      }
  }

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}
