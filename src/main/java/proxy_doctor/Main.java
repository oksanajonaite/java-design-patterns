package proxy_doctor;

public class Main {

    public static void main(String[] args) {

        Doctor doctor = new DoctorProxy();

        System.out.println("Case 1:");
        doctor.giveAdvice("I have a cold and headache");

        System.out.println("\nCase 2:");
        doctor.giveAdvice("Chest pain and shortness of breath");
    }
}
