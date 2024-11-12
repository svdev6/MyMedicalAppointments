import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        Doctor myDoctor = new Doctor();
        myDoctor.name = "Alejandro Rodríguez";
        myDoctor.showName();
        myDoctor.showID();

        Doctor myDoctorAnn = new Doctor();
        myDoctor.showID();

        showMenu();
    }
}
