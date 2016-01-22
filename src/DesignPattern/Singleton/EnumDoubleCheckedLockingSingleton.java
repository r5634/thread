package DesignPattern.Singleton;

public class EnumDoubleCheckedLockingSingleton{


    private volatile EnumDoubleCheckedLockingSingleton INSTANCE;
 
    private EnumDoubleCheckedLockingSingleton(){}
 
    public EnumDoubleCheckedLockingSingleton getInstance(){
        if(INSTANCE == null){
           synchronized(EnumDoubleCheckedLockingSingleton.class){
               //double checking Singleton instance
               if(INSTANCE == null){
                   INSTANCE = new EnumDoubleCheckedLockingSingleton();
               }
           }
        }
        return INSTANCE;
    }
}

