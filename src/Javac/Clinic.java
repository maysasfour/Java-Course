package Javac;

public class Clinic {
    public static void main(String[] args) {
        Patient patient1 = new Patient("mays",23,"feratin");
        Patient patient2 = new Patient("reem",21,"Vitamin D");

        Doctor doctor = new Doctor("Mohammed","Surgery");
        doctor.add_patient(patient1);
        doctor.add_patient(patient2);
        doctor.list_Patients();
        patient2.setAge(40);
        System.out.println(doctor.patients.get(0));

    }
}
