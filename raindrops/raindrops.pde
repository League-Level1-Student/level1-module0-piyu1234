int y=0;
int score;
int x=390;

void draw()   {
background(242, 0, 157);
fill(0, 218, 242);
stroke(0, 48, 242);
rect( mouseX,  600,  78,  90);

fill(0, 0, 0);
textSize(16);
text("Score: " + score, 20, 20);
if (y>800)  { 
y=0;
}








ellipse(x, y, 70, 70);
  y+=8;
  



if (x > mouseX && x < mouseX+100)
          score++;
     else if (score > 0) 
          score--;
     println("Your score is now: " + score);
     
}   
     
    void setup()  {         
     
     size(800, 800);
     
     
     
     
     
    }


     
     
  


  
  

    
  
  
  
  