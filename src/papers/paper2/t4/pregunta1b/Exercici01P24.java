package papers.paper2.t4.pregunta1b;

public class Exercici01P24 {
    public static void main(String[] args) {

        // Crea array de 50 objectes Payment
        Payment[] tables = new Payment[50];

        // Pregunta 2.a

        tables[1] = new Payment();
        tables[2] = new Payment();

        FoodItem a = new FoodItem("f102", "", 5f, 2);
        FoodItem b = new FoodItem("f100", "", 3.5f, 1);
        DrinkItem c = new DrinkItem("d102", "", 4f, 3);

        tables[1].addFoodItem(a);
        tables[1].addFoodItem(b);
        tables[2].addDrinkItem(c);
        tables[2].addDrinkItem(new DrinkItem("d103", "", 2.3f, 1));

        System.out.println(tables[1].getFiCount());
        System.out.println(Payment.getFoodTax());
        System.out.println(tables[2].getDi(1).getCode());

        // Pregunta 2.b
        tables[40] = new Payment();
        System.out.println(tables[40].getDiCount());

        // Pregunta 2.c
        tables[2].addFoodItem(a);
        tables[2].addFoodItem(a);
        tables[2].addFoodItem(b);
        System.out.println(tables[2].getFi(2).getCode());


        // Creació de l'Array de Items
        Item[ ] pl = new Item[200];

        // Emplenam l'Array de Items amb menjars i begudes
        pl[0] = new Item("f001", "Patatilla", 1.50);
        pl[1] = new Item("f002", "Olives", 2.20);
        pl[2] = new Item("d001", "Llimonada", 1.75);
        pl[3] = new Item("d002", "Aigua", 0.55);
        //...

        FoodItem patatilles = new FoodItem("f001", "", 4f, 2);
        FoodItem olives = new FoodItem("f002", "", 2f, 3);
        DrinkItem aigues = new DrinkItem("d002", "", 1.5f, 2);

        // La taula 10 demana coses
        tables[10] = new Payment();
        tables[10].addFoodItem(patatilles);
        tables[10].addFoodItem(olives);
        tables[10].addDrinkItem(aigues);

        // Pregunta 3
        double finalBill = tables[10].calculateBill(pl);
        System.out.println("El total de la taula 10 és "+finalBill);

    }
}
