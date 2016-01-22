package DesignPattern.ObserverJavaUtilImpl;

import java.util.Observable;
import java.util.Observer;

public class Newspaper implements Observer { //Watcher

	@Override
	public void update(Observable o, Object interest) {
        System.out.println("Newspaper: Interest Rate updated, new Rate is: "
                + interest);
		
	}
}
