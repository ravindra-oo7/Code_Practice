public class SingletonClass2 {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstence();
        Singleton singleton2 = Singleton.getInstence();

        System.err.println(singleton1);
        System.err.println(singleton2);

    }
}
class Singleton {

    // Step2: Private Field referencing instence of this class 
    private static Singleton instence;

    // Step3: creating obj of this class and storing it in instence 
    static{
        instence = new Singleton();
    }

    // Step1: Private Constructor
    private Singleton(){
        System.err.println("Inside Singleton Ctor");
    }

    // Step4: public static method to get singleton object
    public static Singleton getInstence(){
        return instence;
    }

}