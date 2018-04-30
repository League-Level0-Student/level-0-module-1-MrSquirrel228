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
  if(mouseX>mouseY ){
   fill(); 
  }
  if(mouseY>mouseY){
  
  }
    fill(13, 22, 250);
ellipse(x, y, 10, 10);
 fill(#3B67E8);
ellipse(610,218,20,20);
fill(#3B67E8);
ellipse(504,219,20,20);
fill(0,0,0);
ellipse(610,218,5,5);
fill(0,0,0);
ellipse(504,219,5,5);

}