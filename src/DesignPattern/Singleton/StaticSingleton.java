package DesignPattern.Singleton;

/**
* Singleton pattern example with static factory method
*/

public class StaticSingleton{
    //initailzed during class loading
    private static final StaticSingleton INSTANCE = new StaticSingleton();
  
    //to prevent creating another instance of Singleton
    private StaticSingleton(){}

    public static StaticSingleton getSingleton(){
        return INSTANCE;
    }
}

