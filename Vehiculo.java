package Package2.java;

public class Vehiculo {
    String marca;
    int modelo;
    double kilometros;
     public void mostrarInformacion(){
    System.out.println("Marca: " + marca);
    System.out.println("Modelo: " + modelo);
    System.out.println("Kilometros: " + kilometros);

     }
   public void recorrer (int kilometros)
    {
         this.kilometros += kilometros;
         System.out.println("El vehiculo ha recorrido " + kilometros + " kilometros.");
    }
     public void proximoServicio ( ){
        if (kilometros >= 1400) {
            System.out.println("El servicio se realiza a los " + 10.000 + " kilometros.");
        } else {
            System.out.println("si tiene 22.500 el servicio se realiza a los ." + 22.500 + " kilometros.");

        }
        
     }
     public Vehiculo(String marca, int modelo, double kilometros) {
        this.marca = marca;
        this.modelo = modelo;
        this.kilometros = kilometros;
     }
     
}
