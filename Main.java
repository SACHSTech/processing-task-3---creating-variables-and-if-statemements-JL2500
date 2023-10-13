import processing.core.PApplet;

/**
 * A program that sketches a random cat at a random location.
 * @JulianLi
 *
 */
class Main {
  public static void main(String[] args) {
    
    String[] processingArgs = {"MySketch"};
	  Sketch mySketch = new Sketch();
	  PApplet.runSketch(processingArgs, mySketch);
  }
  
}