
PImage face; 
void setup() {
  size(500, 500);
  face = loadImage("zombieEyes.png");
  face.resize(width, height);
}
void draw() {

   

 
fill(#F00A0A);

image(face, 0, 0);

ellipse(400, 60, 50, 50);



}
