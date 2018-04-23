int x = mouseX;
int y = mouseY;
void setup(){ 
size(700, 700);
  PImage face = loadImage("face.jpg");
image(face, 4, 4);
}
void draw(){
 if (mousePressed)
   println(mouseX +", "+ mouseY);
  fill(13, 22, 250);
ellipse(x, y, 10, 10);
}