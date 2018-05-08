int x = mouseX;
int y = mouseY;
void setup(){ 
size(700, 700);
  PImage face = loadImage("face.jpg");
image(face, 0, 0);
fill(206, 196, 106);
}
void draw(){
 if (mousePressed)
   println(mouseX +", "+ mouseY);


   fill(mouseX,mouseY,mouseX); 
 



ellipse(610,218,20,20);

ellipse(504,219,20,20);
fill(0,0,0);
ellipse(610,218,5,5);
fill(0,0,0);
ellipse(504,219,5,5);

}