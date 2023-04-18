public class Vehiculo {
    protected String Marca;
    protected String TipoDeConduccion;
    protected String Modelo;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String tipoDeConduccion, String modelo) {
        Marca = marca;
        TipoDeConduccion = tipoDeConduccion;
        Modelo = modelo;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getTipoDeConduccion() {
        return TipoDeConduccion;
    }

    public void setTipoDeConduccion(String tipoDeConduccion) {
        TipoDeConduccion = tipoDeConduccion;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "Marca='" + Marca + '\'' +
                ", TipoDeConduccion='" + TipoDeConduccion + '\'' +
                ", Modelo='" + Modelo + '\'' +
                '}';
    }

    public void acelerar() {
        System.out.println("Estas acelerando aaaaaaaaa!!!!!");
    }

    public void frenar() {
        System.out.println("Estas frenando");
    }
}