package DesignPattern.ObserverJavaUtilImpl;

import java.util.Observable;
import java.util.Observer;


public class Internet implements Observer { //Watcher


@Override
public void update(Observable arg0, Object interest) {
    System.out.println("Internet: Interest Rate updated, new Rate is: "
            + interest);
	
}
}
