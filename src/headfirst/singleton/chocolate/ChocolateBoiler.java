package headfirst.singleton.chocolate;

public class ChocolateBoiler {
  private boolean empty;
  private boolean boiled;
  private static ChocolateBoiler uniquteInstance;
  private static int numCalled=0;
  private ChocolateBoiler() {
    empty=true;
    boiled=false;
  }
  public static ChocolateBoiler getInstance() {
    if(uniquteInstance ==null){
     uniquteInstance=new ChocolateBoiler(); 
    } 
    System.out.println("number called"+numCalled++);
    return uniquteInstance;
  }
  public void fill() {
    if(isEmpty()){
      System.out.println("it is now empty and is being filled...");
     empty=false;
     boiled=false;
    }
  }
  public void drain() {
  if (!isEmpty() && isBoiled()) {
   // drain the boiled milk and chocolate
   empty = true;
  }
 }
  public void boil() {
  if (!isEmpty() && !isBoiled()) {
   // bring the contents to a boil
   boiled = true;
  }
 }
  public boolean isEmpty() {
  return empty;
 }
 
 public boolean isBoiled() {
  return boiled;
 }
}
