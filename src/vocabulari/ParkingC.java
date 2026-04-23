package vocabulari;

public class ParkingC {

    // Composició : atributs d'una altra classe
    Vehicle[] vehicles;
    int numVehicles;

    public ParkingC(){
        vehicles = new Vehicle[10];
        numVehicles = 0;
    }

    public ParkingC(int nv){
        vehicles = new Vehicle[nv];
        numVehicles = 0;
    }

    // Mètode de composició dels vehicles al parking
    public void addMoto(String matricula, int nr, int cilindrada){
        Vehicle v = new Moto(matricula, nr, cilindrada);
        vehicles[numVehicles] = v;
        numVehicles++;
    }

    public void print(){

    }

}
