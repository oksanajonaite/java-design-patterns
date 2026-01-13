package proxy_doctor;

public class RealDoctor implements Doctor {
    @Override
    public void giveAdvice(String symptoms) {
        System.out.println("Diagnosis for symptoms: " + symptoms);
        System.out.println("Please schedule tests and start treatment.");
    }
}
