int x = mouseX;
int y = mouseY;
void setup(){
noStroke();
size(700,700);
fill(206, 196, 106);
ellipse(450, 450, 500, 500);
fill(250, 28, 20);
ellipse(450, 450, 400,400);
fill(250, 236, 81);
ellipse(450, 450, 380, 380);
}
void draw(){
if(mousePressed){
   double Tim =Math.random();
 if(Tim > .5){
  fill(255, 255, 255);
    ellipse (mouseX, mouseY, 60, 60);
  PImage pepperoni = loadImage("pepperoni.ppm.gif");
image(pepperoni, mouseX, mouseY);
}
else{
    fill(255, 255, 255);
    ellipse (mouseX, mouseY, 60, 60);
  PImage pepperoni = loadImage("");
image(pepperoni, mouseX, mouseY);

}}}