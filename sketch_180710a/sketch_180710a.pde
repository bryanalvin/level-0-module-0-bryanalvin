int score=0;
int xspeed=15;
int yspeed=30;
int x=50;
int y=50;






void setup(){
  size(600,400);
  
  
  
  
  
}
  void draw(){
  background(200,48,430);
  fill(17,245,231);
  ellipse(x,y,50,50);
  x=x+xspeed;
if(x > width){
 xspeed=-xspeed;
}
 y=y+yspeed;
if(y>height){  
 yspeed=-yspeed;
  
if(x<0){  
 xspeed=-xspeed;
if(y>0){  
yspeed=-yspeed;  
}
  int getDistance(int xclick,int yclick,int ellipsex,int xellipsey){
  
  }
 return(int) Math.sqrt(xClick*xClick+ yClick* yClick)- 
  (int)Math.sqrt(ellipseX*ellipseX +ellipsey*ellipsey);
  
}

int d= getDistance(mousex,mousey, x, y);
if(d>-50&& d< 50){




  








void mousePressed(){
  
  
  
  
  
  
  
  
}