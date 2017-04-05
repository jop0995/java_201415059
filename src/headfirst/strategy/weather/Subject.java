  package headfirst.observer.weather;
  
  public interface Subject{
    
    public void registerObserver(Observer 0);
    public void removeObserver(Observer 0);
    public void notifyObservers();
  }
    