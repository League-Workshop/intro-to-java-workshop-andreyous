void setup(){
  size(500,500);
}
void draw(){
fill(#F7F700);
ellipse(250,250,500,500);
fill(#000000);
ellipse(150,350,50,50);
ellipse(350,350,50,50);
fill(#FF0505);
ellipse(250,100,100,100);
if(mousePressed){
  fill(#FFFFFF);
  ellipse(250,100,100,100);
}
}
