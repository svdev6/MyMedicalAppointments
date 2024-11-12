public class Doctor {
    // Atributos
    static int id = 0; // Autoincrementar
    String name;
    String speciality;

    Doctor() {
        System.out.println("Construyendo el objeto Doctor");
        id++;
    }

    Doctor(String name) {
        System.out.println("El nombre del doctor es: " + name);
    }

    // Comportamientos
    public void showName(){
        System.out.println(name);
    }
    public void showID() {
        System.out.println("El ID del doctor es: " + id);
    }

}
