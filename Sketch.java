import processing.core.PApplet;
import java.util.Random;

public class Sketch extends PApplet {
	
  public void settings() {
    size(400, 400);
  }

  public void setup() {
    background(210, 255, 173);
  }

  // Generation for the random drawing
  Random myRandom = new Random();
  int randomWidth = myRandom.nextInt(500);
  int randomHeight = myRandom.nextInt(500);
  
  public void draw() {

    // Changes background colour if the randomized number part of the parameters
    if (randomWidth < 100 || randomHeight < 100) {
      background(100,100,100);
    } 
    if (randomWidth < 300 && randomWidth > 100) {
      background(123,32,293);
    }
    
    // The head of the cat
    fill(255,165,0);
    ellipse(randomWidth / 2f, randomHeight / 1.818f, randomWidth / 1.6f, randomHeight / 1.6f);

    // The eyes of the cat
    fill(0);
    ellipse(randomWidth / 2.67f, randomHeight / 2.353f, randomWidth / 10f, randomHeight / 10f);
    ellipse(randomWidth / 1.6f, randomHeight / 2.353f, randomWidth / 10f, randomHeight / 10f);

    // The left whiskers of the cat
    line(randomWidth / 2f, randomHeight / 1.6f, randomWidth / 4.21f, randomHeight / 1.905f);
    line(randomWidth / 2f, randomHeight / 1.6f, randomWidth / 4.21f, randomHeight / 1.67f);
    line(randomWidth / 2f, randomHeight / 1.6f, randomWidth / 4.21f, randomHeight / 1.481f);

    // The right whiskers of the cat
    line(randomWidth / 1.95f, randomHeight / 1.6f, randomWidth / 1.33f, randomHeight / 1.9f);
    line(randomWidth / 1.95f, randomHeight / 1.6f, randomWidth / 1.33f, randomHeight / 1.67f);
    line(randomWidth / 1.95f, randomHeight / 1.6f, randomWidth / 1.36f, randomHeight / 1.48f);

    // The nose of the cat
    fill(101,67,33);
    rect(randomWidth / 2.05f, randomHeight / 1.63f, randomWidth / 26.67f, randomHeight / 26.67f);

    // The ears of the cat
    triangle(randomWidth / 5f, randomHeight / 2.26f, randomWidth / 2.96f, randomHeight / 3.48f, randomWidth / 6.15f, randomHeight / 4f);
    triangle(randomWidth / 1.26f, randomHeight / 2.26f, randomWidth / 1.16f, randomHeight / 3.81f, randomWidth / 1.48f, randomHeight / 3.33f);
    
    // Finds the current hour and minute and stores it in a variable
    int currentHour = hour();
    int currentMinutes = minute();
    
    // Displays the hour and minute as a text
    fill(0,0,0);
    textSize(50);
    text(currentHour + ":" + currentMinutes, 250, 395);

  }
  
}