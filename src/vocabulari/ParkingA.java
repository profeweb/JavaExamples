package vocabulari;

public class ParkingA {

    // Agregació : atributs d'una altra classe (Vehicle)
    Vehicle[] vehicles;
    int numVehicles;

    public ParkingA(){
        vehicles = new Vehicle[10];
        numVehicles = 0;
    }

    public ParkingA(int nv){
        vehicles = new Vehicle[nv];
        numVehicles = 0;
    }

    // Mètode d'agregació dels vehicles al parking
    public void addVehicle(Vehicle v){
        vehicles[numVehicles] = v;
        numVehicles++;
    }

    // Dependència o ús (quan una classe té un mètode que retorna o utilitza paràmetres d'una altra classe)
    public boolean mesGran(ParkingC altreParking){
        return this.vehicles.length > altreParking.vehicles.length;
    }

    public ParkingC converteix(){
        ParkingC pc = new ParkingC(this.vehicles.length);
        for(int i=0; i<numVehicles; i++){
            String matricula = vehicles[i].matricula;
            int numRodes = vehicles[i].numRodes;
            int cilindrada = ((Moto)vehicles[i]).getCilindrada();
            pc.addMoto(matricula, numRodes, cilindrada);
        }
        return pc;
    }

    public void print(){

    }

}
