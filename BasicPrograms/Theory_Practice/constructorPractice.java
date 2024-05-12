public class constructorPractice{

        private int value;

        public constructorPractice(int value) {
            this.value = value;
        }
    
        // public constructorPractice() {

        // }
    
        public static void main(String[] args) {
            constructorPractice obj1 = new constructorPractice();           //No defualt constructor provided by java if we explicitly define any constructor.
            constructorPractice obj2 = new constructorPractice(10);     // Invokes parameterized constructor
        }
    
    
}