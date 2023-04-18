public class Automovil extends Vehiculo {

    protected int numDePuertas;
    protected double velocidadMaxima;
    protected double caballosDeFuerza;


    public Automovil() {
    }

    public Automovil(String marca, String tipoDeConduccion, String modelo, int numDePuertas, double velocidadMaxima, double caballosDeFuerza) {
        super(marca, tipoDeConduccion, modelo);
        this.numDePuertas = numDePuertas;
        this.velocidadMaxima = velocidadMaxima;
        this.caballosDeFuerza = caballosDeFuerza;
    }

    public int getNumDePuertas() {
        return numDePuertas;
    }

    public void setNumDePuertas(int numDePuertas) {
        this.numDePuertas = numDePuertas;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public double getCaballosDeFuerza() {
        return caballosDeFuerza;
    }

    public void setCaballosDeFuerza(double caballosDeFuerza) {
        this.caballosDeFuerza = caballosDeFuerza;
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "numDePuertas=" + numDePuertas +
                ", velocidadMaxima=" + velocidadMaxima +
                ", caballosDeFuerza=" + caballosDeFuerza +
                ", Marca='" + Marca + '\'' +
                ", TipoDeConduccion='" + TipoDeConduccion + '\'' +
                ", Modelo='" + Modelo + '\'' +
                '}';
    }
    public void abrirPuerta(){
        System.out.println("Se esta abruiendo la puerta");
    }
    public void cerrarPuerta(){
        System.out.println("Se esta cerrando las puertas");
    }

    @Override
    public void acelerar() {
        System.out.println("El automovil "+Marca+Modelo+" esta acelerando");
    }

    @Override
    public void frenar() {
        System.out.println("El Automovil "+ Marca + Modelo+" esta frenando");
    }
}
