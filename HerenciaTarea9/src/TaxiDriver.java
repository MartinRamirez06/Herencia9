public class TaxiDriver {
    public static void main(String[] args) {

        Vehiculo vehiculo1=new Vehiculo("Ford","Automatico","Clasico");
        System.out.println(vehiculo1);
        vehiculo1.acelerar();
        vehiculo1.frenar();

        Automovil auto1= new Automovil("Chevolet","Manual","Clasico",4,300,40);
        System.out.println(auto1);
        auto1.acelerar();
        auto1.frenar();
        auto1.abrirPuerta();
        auto1.cerrarPuerta();

        Taxi taxi1=new Taxi("NISSAN","Manual","Tsuru",4,300,100,"KJS0845",5,8.45);
        System.out.println(taxi1);
        taxi1.acelerar();
        taxi1.frenar();
        taxi1.abrirPuerta();
        taxi1.cerrarPuerta();
        taxi1.ponerMusica();
        taxi1.SaltarTopes();

    }
}

