
package workshopregistration;


public class Workshopregistration {

    
    public static void main(String[] args) {
        Registration workshop = new Registration();

        try {
            workshop.registerParticipant("Asma", 16);
        }
        catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
    
}

class InvalidAgeException extends Exception {

    public InvalidAgeException(String message) {
        super(message);
    }
}

class Registration {

    void registerParticipant(String name, int age)
            throws InvalidAgeException {

        if (age < 18) {
            throw new InvalidAgeException(
                "Registration denied for " + name +
                ": Must be at least 18 years old (provided age: " + age + ")"
            );
        } else {
            System.out.println("Registration successful for " + name);
        }
    }
}


