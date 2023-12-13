package papers.paper2.t4.pregunta1;

public class Payment {

    // Atributs

    private FoodItem[] fi = new FoodItem[100];
    private int fiCount;
    private static double foodTax = 0.2;

    private DrinkItem[] di = new DrinkItem[100];
    private int diCount;
    private static double drinkTax = 0.1;

    // Constructor
    public Payment() {
        fiCount = 0;
        diCount = 0;
    }

    // Getter
    public DrinkItem getDi(int x) {
        return di[x];
    }

    // están incluidos todos los otros métodos accesor y mutador
    public int getFiCount() {
        return this.fiCount;
    }

    public int getDiCount() {
        return this.diCount;
    }

    public FoodItem getFi(int i){
        return this.fi[i];
    }

    public static double getFoodTax() {
        return foodTax;
    }

    public static double getDrinkTax() {
        return drinkTax;
    }

    // Pregunta 1.e
    public void addFoodItem(FoodItem f) {
        fi[fiCount] = f;
        fiCount++;
    }

    public void addDrinkItem(DrinkItem d) {
        di[diCount] = d;
        diCount++;
    }

    // Pregunta 2.d
    public static double findPrice(Item[] pl, String c) {
        int x = 0;
        double price = 0.0;
        boolean found = false;
        while (!found) {
            if ((pl[x].getCode()).equals(c)) {
                price = pl[x].getPrice();
                found = true;
            }
            x++;
        }
        return price;
    }

    // Pregunta 2.e
    public double calculateBill( Item[ ] pl) {
        double total = 0.0;
        // Càlcul de menjars
        for (int x = 0; x < fiCount; x++) {
            String c = fi[x].getItemCode();
            double price = findPrice(pl, c);
            total = total + fi[x].getQuantity() * price * (1 + foodTax);
        }
        // Càlcul de begudes
        for (int y = 0; y < diCount; y++) {
            String c = di[y].getItemCode();
            double price = findPrice(pl, c);
            total = total + di[y].getQuantity() * price * (1 + drinkTax);
        }
        return total;
    }
}

