// public class Sample {

//     class Superclass {
//         void display() {
//             System.out.println("Superclass display() method");
//         }
//     }

//     class Subclass extends Superclass {
//         @Override
//         void display() {
//             System.out.println("Subclass display() method");
//         }
//     }

//     public static void main(String[] args) 
//     {
//         Sample sample = new Sample();
//         Subclass obj = sample.new Subclass();
//         obj.display(); // Calls subclass method

//         ((Superclass) obj).display(); // this will also call display() method of subclass
//     }
// }



class Superclass {
    void display() {
        System.out.println("Superclass display() method");
    }
}

class Subclass extends Superclass {
    @Override
    void display() {
        System.out.println("Subclass display() method");
    }
    
    void callSuperclassDisplay() {
        // Call superclass method directly
        super.display();
    }
}

public class Sample {
    public static void main(String[] args) {
        Subclass obj = new Subclass();
        obj.display(); // Calls subclass method
        obj.callSuperclassDisplay(); // Calls superclass method directly
    }
}


