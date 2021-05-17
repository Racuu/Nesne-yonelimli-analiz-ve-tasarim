import java.util.ArrayList;
import java.util.List;

public class Observer implements ISubject {

      private List<IObserver> subscribers = new ArrayList<>();

      public void notify(String message) {
    	  System.out.println(message);
          for(IObserver subscribers: subscribers) {
        	  subscribers.update(message);
          }
      }
  }