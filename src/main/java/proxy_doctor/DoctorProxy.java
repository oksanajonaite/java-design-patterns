package proxy_doctor;

public class DoctorProxy implements Doctor {

    private RealDoctor realDoctor;

    @Override
    public void giveAdvice(String symptoms) {
        if (isSimple(symptoms)) {
            System.out.println("Symptoms are simple.");
            System.out.println("Recommendation: rest, drink water, take vitamins.");
            return;
        }
            System.out.println("Symptoms are serious.");
            realDoctor = new RealDoctor();
            realDoctor.giveAdvice(symptoms);
    }

    private boolean isSimple(String symptoms) {
        return symptoms.toLowerCase().contains("cold")
                || symptoms.toLowerCase().contains("headache");
    }
}
