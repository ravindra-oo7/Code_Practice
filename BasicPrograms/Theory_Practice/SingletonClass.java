package Theory_Practice;

public class SingletonClass{
    public static void main(String[] args)
    {
        Singleton obj1 = Singleton.getSingleton();
        Singleton obj2 = Singleton.getSingleton();

        System.out.println(obj1);
        System.out.println(obj2);
    }
}

class Singleton{
   
        // Step 1: Create Static Object 
        static Singleton singleton=new Singleton();

        // Step 2: Private Constructor
        private Singleton()
        {
        System.err.println("This is Singleton class Object 007");
        }

        // Step 3: static method
        //Create Method to get Instance of the this class.
        //The Class should be public such that it will be accessible anywhere
        //this method should be static such that we can call it on class name
        public static Singleton getSingleton() {
            return singleton;
        }


}