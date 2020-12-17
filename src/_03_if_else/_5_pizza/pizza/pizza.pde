PImage pepperoni;
PImage olive;
PImage pizzaBox; 
import ddf.minim.*;  

void setup() {
  size(1920, 1080);
  fill(#FCE2A8);
  ellipse(width / 2, height / 2, 500, 500);
 
  pepperoni = loadImage("pepperoni.png");
  olive = loadImage("olive.png");
  pizzaBox = loadImage("box.jpg");
  olive.resize(70, 70);
  pizzaBox.resize(1920, 1080); 
  background(pizzaBox);
 




}

void draw() {

  fill(#FF1222);
 
  ellipse(width / 2, height / 2, 450, 450);

  image(pepperoni, 800, 600);
  image(olive, 830, 400);

  if (mousePressed && (mouseButton == RIGHT)) {
    image(olive, 839, 670);
  }
  

  if (mousePressed && (mouseButton == LEFT)) {
    image(pepperoni, 900, 340);
  










}
}
