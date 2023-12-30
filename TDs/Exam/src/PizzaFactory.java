public class PizzaFactory {
    PizzaFactory(){};

    public Pizza createItaliennePizza(String type){
        switch (type){
            case "Frommage" : return new PizzaFrommage();
            case "Fruit de Mer" : return new PizzaFruitdeMer();
            case "Vegetarienne" : return new PizzaVegetarienne();
            default: return null ;
        }
    }
    public Pizza createAlgeriennePizza(String type){
        switch (type){
            case "Frommage" : return new PizzaFrommage();
            case "Fruit de Mer" : return new PizzaFruitdeMer();
            case "Vegetarienne" : return new PizzaVegetarienne();
            default: return null ;
        }
    }

    public Pizza createPizza(String region , String type) {
        Pizza P = null;
        if(region == "Italienne")
            P = createItaliennePizza(type);
        else if(region == "Algerienne")
            P = createAlgeriennePizza(type);
        else
            System.out.println("No Pizza With In this Region");
        return P ;
    }

}
