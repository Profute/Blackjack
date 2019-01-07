package Blackjack;

import processing.core.*;
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Blackjack extends PApplet {

int ch = 2; //Sætter ens standard korthånd til 2

boolean[] keys = new boolean[4]; //Fortæller processing hvilke taster der bliver brugt

final int q = 0; 
final int w = 1;
final int e = 2;
final int r = 3;

PImage[] PLAYERCARDARRAY = new PImage[52];
PImage[] CV;


public void setup() {
  
  CV = loadArray(); //Loader arrayet "Cards"
  table(); //Loader table
}


public void keyReleased() { //sætter de forskellige taste til at reagere når jeg tasten løftes
  if (key == 'q') {
    deal();
  }
  if (key == 'w') {
    hit();
  }
  if (key == 'e') {
    //stay();
  }
}


public void draw() {

  //Draw funktion
  //værdier der er lig med nul når træk funktion bliver kaldt
  
}
    
public PImage[] loadArray(){ //Et array over et klassisk kortsæt

//int[] Ph;

//værdi der er = 0 i starten af 'runde'

PImage CV[] = new PImage [52];

CV[0] = loadImage("ace of club.jpg");
CV[1] = loadImage("ace of diamonds.jpg");
CV[2] = loadImage("ace of hearts.jpg");
CV[3] = loadImage("ace of spade.jpg");
CV[4] = loadImage ("2-heart.jpg");
CV[5] = loadImage("2-diamond.jpg");
CV[6] = loadImage("2-heart.jpg");
CV[7] = loadImage("2-spades.jpg");
CV[8] = loadImage("3-club.jpg");
CV[9] = loadImage("3-diamond.jpg");
CV[10] = loadImage("3-heart.jpg");
CV[11] = loadImage("3-spades.jpg");
CV[12] = loadImage("4-club.jpg");
CV[13] = loadImage("4-diamond.jpg");
CV[14] = loadImage("4-heart.jpg");
CV[15] = loadImage("4-spades.jpg");
CV[16] = loadImage("5-club.jpg");
CV[17] = loadImage("5-diamond.jpg");
CV[18] = loadImage("5-heart.jpg");
CV[19] = loadImage("5-spades.jpg");
CV[20] = loadImage("6-club.jpg");
CV[21] = loadImage("6-diamond.jpg");
CV[22] = loadImage("6-heart.jpg");
CV[23] = loadImage("6-spades.jpg");
CV[24] = loadImage("7-club.jpg");
CV[25] = loadImage("7-diamond.jpg");
CV[26] = loadImage("7-heart.jpg");
CV[27] = loadImage("7-spades.jpg");
CV[28] = loadImage("8-club.jpg");
CV[29] = loadImage("8-diamond.jpg");
CV[30] = loadImage("8-heart.jpg");
CV[31] = loadImage("8-spades.jpg");
CV[32] = loadImage("9-club.jpg");
CV[33] = loadImage("9-diamond.jpg");
CV[34] = loadImage("9-heart.jpg");
CV[35] = loadImage("9-spades.jpg");
CV[36] = loadImage("10-club.jpg");
CV[37] = loadImage("10-diamond.jpg");
CV[38] = loadImage("10-heart.jpg");
CV[39] = loadImage("10-spades.jpg");
CV[40] = loadImage("jack-club.jpg");
CV[41] = loadImage("jack-diamond.jpg");
CV[42] = loadImage("jack-heart.jpg");
CV[43] = loadImage("jack-spade.jpg");
CV[44] = loadImage("queen-club.jpg");
CV[45] = loadImage("queen-diamond.jpg");
CV[46] = loadImage("queen-heart.jpg");
CV[47] = loadImage("queen-spade.jpg");
CV[48] = loadImage("king-club.jpg");
CV[49] = loadImage("king-diamond.jpg");
CV[50] = loadImage("king-heart.jpg");
CV[51] = loadImage("king-spade.jpg");

return CV;
}
public void table() {

  background(0); //sætter baggrunden til sort
  fill(102, 51, 0); //farver firkanten firkant brun
  rect(120, 150, 800, 700); //tegner firkanten
  fill(0, 128, 43); //farver firkanten grøn 
  rect(130, 160, 780, 680); //tegner firkanten
}

public void deal() {
  for (int p = 0; p < ch; p++) { //
    image(CV[PApplet.parseInt(random(PLAYERCARDARRAY.length))], 430 + p * 70, 620, 100, 180);
    image(CV[PApplet.parseInt(random(PLAYERCARDARRAY.length))], 430 + p * 70, 220, 100, 180);
  }
}

public void hit() {
  ch++;

  for (int p = 2; p < ch; p++) {
    image(CV[PApplet.parseInt(random(PLAYERCARDARRAY.length))], 490 + p * 70, 620, 100, 180);
  }
}
  public void settings() {  size(1000, 1000); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Blackjack.Blackjack" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
