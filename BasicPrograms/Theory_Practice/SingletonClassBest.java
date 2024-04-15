package Theory_Practice;

public class SingletonClassBest {
    public static void main(String[] args) 
    {
        Singleton singleton1 = Singleton.getSingObject();
        Singleton singleton2 = Singleton.getSingObject();

        System.err.println(singleton1);
        System.err.println(singleton2);

        
    }
}

class Singleton{

    private static Singleton singletonObj;

    static {
        singletonObj = new Singleton();
    }

    private Singleton(){
        System.err.println("Inside singleton Ctor by Ravi");
    }

    public static Singleton getSingObject(){
        if (singletonObj==null){

            singletonObj = new Singleton();
        }
        return singletonObj;
    }
}