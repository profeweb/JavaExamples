package poo.parking;

public class MainParking {

    public static void main(String[] args) {

        Vehicle[] vehicles = new Vehicle[5];

        vehicles[0] = new Cotxe("1234CL", Cotxe.TIPUS.DIESEL);
        vehicles[1] = new Cotxe("7529KA", Cotxe.TIPUS.GASOLINA);
        vehicles[2] = new Moto("9726XZ", 49);
        vehicles[3] = new Cotxe("7251AE)", Cotxe.TIPUS.ELECTRIC);
        vehicles[4] = new Moto("2134HQ", 75);


        vehicles[0].rodar();
        vehicles[0].rodar();
        vehicles[1].rodar();
    }

    public static String matriculaVehicleMesKms(Vehicle[] vehicles){
        float kmsMax = 0;
        String matriculaMax = "";
        for(int i=0; i<vehicles.length; i++) {
            if(vehicles[i].getNumKms() > kmsMax){
                kmsMax = vehicles[i].getNumKms();
                matriculaMax = vehicles[i].getMatricula();
            }
        }
        return matriculaMax;
    }

    public static int numCotxesElectrics(Vehicle[] vehicles){
        int n= 0;
        for(int i=0; i<vehicles.length; i++){
            if(vehicles[i] instanceof Cotxe){
                Cotxe ci = (Cotxe) vehicles[i];
                if(ci.getTipus()== Cotxe.TIPUS.ELECTRIC){
                    n++;
                }
            }
        }
        return n;
    }

    public static Moto motoAmbMesCilindrada(Vehicle[] vehicles){
        int maxCilindrada = 0;
        Moto motoMaxCilindrada = null;
        for(int i=0; i<vehicles.length; i++){
            if(vehicles[i] instanceof Moto){
                Moto mi = (Moto) vehicles[i];
                if(mi.getCilindrada() > maxCilindrada){
                    maxCilindrada = mi.getCilindrada();
                    motoMaxCilindrada = mi;
                }
            }
        }
        return motoMaxCilindrada;
    }


}
