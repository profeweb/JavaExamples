package generica;

public class MainParkingGeneric {
    public static void main(String[] args) {

        // Cream parking genèric de cotxes
        ParkingGeneric<Cotxe> parkCotxes = new ParkingGeneric<>(5);
        parkCotxes.entrada(new Cotxe("12345HX", 4));

        // Cream parking genèric de bicicletes
        ParkingGeneric<Bicicleta> parkBicis = new ParkingGeneric<>(10);
        parkBicis.entrada(new Bicicleta("8474HJK", "Orbea"));
    }
}
