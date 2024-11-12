public class Main {
    public static void main(String[] args) {

        Doctor myDoctor = new Doctor();
        myDoctor.name = "Alejandro Rodríguez";
        myDoctor.showName();
        myDoctor.showID();
        System.out.println(myDoctor.id);

        Doctor myDoctorAnn = new Doctor();
        myDoctor.showID();
        System.out.println(myDoctor.id);

    }
}
