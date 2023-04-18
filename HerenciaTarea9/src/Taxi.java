public class Taxi extends Automovil{
    private String placas;
    private int capacidadDePersonas;
    private double banderazo;

    public Taxi() {
    }

    public Taxi(String marca, String tipoDeConduccion, String modelo, int numDePuertas, double velocidadMaxima, double caballosDeFuerza, String placas, int capacidadDePersonas, double banderazo) {
        super(marca, tipoDeConduccion, modelo, numDePuertas, velocidadMaxima, caballosDeFuerza);
        this.placas = placas;
        this.capacidadDePersonas = capacidadDePersonas;
        this.banderazo = banderazo;
    }

    public String getPlacas() {
        return placas;
    }

    public void setPlacas(String placas) {
        this.placas = placas;
    }

    public int getCapacidadDePersonas() {
        return capacidadDePersonas;
    }

    public void setCapacidadDePersonas(int capacidadDePersonas) {
        this.capacidadDePersonas = capacidadDePersonas;
    }

    public double getBanderazo() {
        return banderazo;
    }

    public void setBanderazo(double banderazo) {
        this.banderazo = banderazo;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "placas='" + placas + '\'' +
                ", capacidadDePersonas=" + capacidadDePersonas +
                ", banderazo=" + banderazo +
                ", numDePuertas=" + numDePuertas +
                ", velocidadMaxima=" + velocidadMaxima +
                ", caballosDeFuerza=" + caballosDeFuerza +
                ", Marca='" + Marca + '\'' +
                ", TipoDeConduccion='" + TipoDeConduccion + '\'' +
                ", Modelo='" + Modelo + '\'' +
                '}';
    }

    public void ponerMusica(){
        System.out.println("El taxi esta reproduciendo musica");
    }
    public void SaltarTopes(){
        System.out.println("El taxi salio volando por saltar un tope");
    }

    @Override
    public void acelerar() {
        System.out.println("El taxi "+Marca + Modelo +" esta acelerando");
    }

    @Override
    public void frenar() {
        System.out.println("El taxi "+Marca + Modelo +" esta frenando");
    }

    @Override
    public void abrirPuerta() {
        System.out.println("El taxi "+Marca + Modelo +" esta abriendo su puerta");
    }

    @Override
    public void cerrarPuerta() {
        System.out.println("El taxi "+Marca + Modelo +" esta cerrando su puerta");
    }
}
