int x = mouseX;
int y = mouseY;
void setup() {
size(500, 500);
  background(200, 200, 200);
    noStroke();
    fill (255, 84, 84);
    ellipse(150, 200, 150, 150);
    ellipse(212, 200, 150, 150);
    fill (26, 134, 30);
    rect(176, 103, 12, 32);
}
void draw() {   
    if (mousePressed){
    fill(255, 255, 255);
    ellipse (mouseX, mouseY, 60, 60);
}}
        