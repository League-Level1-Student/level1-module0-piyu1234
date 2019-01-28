import ddf.minim.*;
Minim minim;  
AudioPlayer song;

PImage pictureOfRecord; 
int pinkawesome=0;

void setup(){
size(600,600); 
pictureOfRecord= loadImage("Pinkrecord.png");
pictureOfRecord.resize(400,400); 
minim = new Minim(this);
song = minim.loadFile("GirlsLikeYou.mp3", 512);










}

void draw(){
  
if (mousePressed) {
 song.play();

 
}
else{
song.pause();
}
  

if (mousePressed) {  
pinkawesome=pinkawesome+600000000;
}

println(pinkawesome);
rotateImage(pictureOfRecord,pinkawesome);
  image(pictureOfRecord, 0, 0);
}

void rotateImage(PImage image, int amountToRotate) {
     translate(width/2, height/2);
     rotate(amountToRotate*TWO_PI/360);
     translate(-image.width/2, -image.height/2);
}