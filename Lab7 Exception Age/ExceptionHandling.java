import java.util.Scanner;

class WrongAge extends Exception {
    WrongAge(String message) {
        super(message);
    }

}

class InputScanner {
    static Scanner sc = new Scanner(System.in);
}

class Father extends InputScanner {
    int fatherAge;

    Father() throws WrongAge {
        System.out.println("Enter Father's age");
        fatherAge = sc.nextInt();
        if (fatherAge < 0) {
            throw new WrongAge("Age cannot be negative");

        }
    }

    void display() {
        System.out.println("Father's age is " + fatherAge);
    }

}

class Son extends Father {
    int sonAge;

    Son() throws WrongAge {
        System.out.println("Enter son's age");
        sonAge = sc.nextInt();
        if (sonAge > fatherAge) {
            throw new WrongAge("Son's age cannot be greater than father's age");
        } else if (sonAge < 0) {
            throw new WrongAge("Age cannot be negative");
        }

    }

    void display() {
        System.out.println("Son's age is " + sonAge);
    }

}

public class ExceptionHandling {
    public static void Main(String args[]) {
        try{
            Son son= new Son();
            son.display();
        }
        catch(WrongAge e){
            System.out.println("Exception "+ e.getMessage());
        }


    }
}