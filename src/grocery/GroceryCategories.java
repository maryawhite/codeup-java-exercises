package grocery;

import java.util.ArrayList;

public class GroceryCategories {
    private String categoryName;
    public ArrayList<String> categories;

    //constructor
    public GroceryCategories(String categoryName) {
        this.categoryName = categoryName;
        this.categories = new ArrayList<>();
    }

    //getters and setters
    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public static void main(String[] args) {

//        GroceryCategories category1 = new GroceryCategories("Dairy");
//        GroceryCategories category2 = new GroceryCategories("Produce");
//        GroceryCategories category3 = new GroceryCategories("Frozen");
//        GroceryCategories category4 = new GroceryCategories("Bakery");
//        GroceryCategories category5 = new GroceryCategories("Deli");
//        GroceryCategories category6 = new GroceryCategories("Meat/Seafood");


//        ArrayList<String> categories = new ArrayList<>();
//        categories.add("1. Dairy");
//        categories.add("2. Produce");
//        categories.add("3. Frozen");
//        categories.add("4. Bakery");
//        categories.add("5. Deli");
//        categories.add("6. Meat/Seafood");
//
//        System.out.println(categories);

    }


}
