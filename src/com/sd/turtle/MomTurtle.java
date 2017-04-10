package com.sd.turtle;

import java.util.Observer;
import java.util.Observable;
import java.awt.geom.Point2D.Double;
import ch.aplu.turtle.*;

public class MomTurtle extends Turtle implements Observer{
  Double babyCurpos; // import∏¶ «ÿ¡ÿ Double(x,y)Ω÷
  public MomTurtle(){
    setColor("red");
    label("mom turtle");
  }
  public void update(Observable o, Object arg){
    System.out.println("update() called, count is " + ((Integer)arg).intValue()); 
    babyCurpos = ((BabyTurtle)o).myCurpos;
    moveTo(babyCurpos);
  }
}