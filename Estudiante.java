package package1;

public class Estudiante {
   String nombre;
    int edad;
    double notaFinal = 0/10;
    
    public void mostrarInformacion() {
    System.out.println("Nombre: " + nombre);
    System.out.println("Edad: " + edad);        
    System.out.println("Nota Final: " + notaFinal);

    }

    
    public void desaprobo (){
        if (notaFinal  <  6) {
            System.out.println("El estudiante desaprobo.");
        } else {
            System.out.println("El estudiante aprobó.");
        }
    }


    public Estudiante(String nombre, int edad, double notaFinal) {
        this.nombre = nombre;
        this.edad = edad;
        this.notaFinal = notaFinal;
    }
    
}
