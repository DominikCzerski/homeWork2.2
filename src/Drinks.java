public class Drinks {

    public static void main(String[] args) {
        Drink mochito = new Drink();
        String mochitoName = mochito.name = "Mochito";
        double mochitoPrice = mochito.price = 12.20;
        boolean isAlcoholic = mochito.alcoholic = true;

        mochito.ingredients = new Ingredients();
        String mochitoIngredientName = mochito.ingredients.name = "Lemon";
        int mochitoIngredientQuantity = mochito.ingredients.quantity = 1;
        String mochitoIngredient2Name = mochito.ingredients.name = "Water";
        int mochitoIngredient2Quantity = mochito.ingredients.quantity = 2;
        String mochitoIngredient3Name = mochito.ingredients.name = "Vodka";
        int mochitoIngredient3Quantity = mochito.ingredients.quantity = 3;

        int ingredientCount = mochitoIngredientQuantity + mochitoIngredient2Quantity + mochitoIngredient3Quantity;

        System.out.println("First drink I will present to you is called: " + mochitoName + "." + "\n"
                + "It consist of:" + "\n"
                + "1. " + mochitoIngredientName + " x" + mochitoIngredientQuantity + "\n"
                + "2. " + mochitoIngredient2Name + " x" + mochitoIngredient2Quantity + "\n"
                + "3. " + mochitoIngredient3Name + " x" + mochitoIngredient3Quantity + "\n"
                + "Quantity of all ingredients is " + ingredientCount + "." + "\n"
                + "Price of this drink is " + mochitoPrice + " USD." + "\n"
                + "You may ask if it is an alcoholic drink, the answer would be " + isAlcoholic + "." + " It is an alcoholic drink.");

    }
}
