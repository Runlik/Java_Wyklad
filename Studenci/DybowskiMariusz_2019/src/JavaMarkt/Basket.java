package JavaMarkt;

import java.util.ArrayList;
import java.util.Collections;

public class Basket {
    private ArrayList<Product> items;
    private ArrayList<Discount> discounts;
    private Product promoItem = new Product("PromoCup", "Promotional Cup", 0);
    private boolean isPromoItemFlag = false;
  //  private int discount30; //-1 jeśli nie wybrano produktu do rabatu. W przeciwnym razie indeks produktu


    Basket(){
        this.items = new ArrayList<>();
        this.discounts = new ArrayList<>();
    }

    private void sortItems(){
        this.items.sort(Product::comparePrice);
        Collections.sort(this.items, Collections.reverseOrder(Product::compareTo));
    }

    public void addItem(Product item){
        this.items.add(item);
        this.checkPromoItem();
        this.checkDiscounts();
        this.sortItems();
    }

    public void addDiscount(Discount discount){
        this.discounts.add(discount);
    }

    private void checkPromoItem(){
        if (this.getTotalPrice() > 200 && !this.isPromoItemFlag()) {
            this.items.add(promoItem);
            this.isPromoItemFlag = true;
        }
        else if (this.isPromoItemFlag() && this.getTotalPrice() <=200){
            this.items.remove(promoItem);
            this.isPromoItemFlag = false;
        }

    }

    public void removeItem(Product item){
        while(this.items.remove(item));
        this.checkPromoItem();
        this.checkDiscounts();

    }

    public void removeItem(int index){
        this.items.remove(index);
        this.checkPromoItem();

        this.checkDiscounts();

    }

    public void removeItems(String code){
        for(Product item:this.getItems()){
            if (item.getCode().equals(code)) {

                this.removeItem(item);
            }
        }
    }

    public ArrayList<Product> findNMax(int n){
        ArrayList<Product> temporary = this.getItems();
        ArrayList<Product> result = new ArrayList<>();

        for(int i = 0; i<n; i++) {
            result.add(temporary.get(i));
        }
        return result;
    }

    public ArrayList<Product> findNMin(int n){
        ArrayList<Product> temporary = this.getItems();
        ArrayList<Product> result = new ArrayList<>();

        for(int i = temporary.size()-1; i>= temporary.size() - n - 1 ; i--) {
            result.add(temporary.get(i));
        }
        return result;
    }

    public Product findMin(){
        return this.findNMin(1).get(0);
    }

    public Product findMax(){
        return this.findNMax(1).get(0);
    }

    public double getTotalPrice(){
        double result = 0.0;
        for(Product item:this.getItems())
            result += item.getDiscountedPrice();
        return result;
    }

    public double getTotalDiscountedPrice(){
        double result = 0.0;
        for(Product item:this.getItems())
            result += item.getDiscountPrice();
        return result;
    }

    private void setDiscounts(){}

    private void checkDiscounts() {}

    private void applyDiscount(){}

    private void retractDiscount(){}



    private void removeDiscount(){}


    public void print(){
        System.out.println(String.format("%12s | %20s | %7s | %7s ", "Code", "Name", "Price", "Discount"));
        System.out.println("--------------------------------------------------------");
        for(Product item:this.getItems())
            System.out.println(item.toString());

    }



    public boolean isPromoItemFlag() {
        return this.isPromoItemFlag;
    }

    public Product getPromoItem() {
        return this.promoItem;
    }

/**
 * zwraca kopię koszyka
 * */
    public ArrayList<Product> getItems() {
        return new ArrayList<>(this.items);
    }

//    public int getDiscount30() {
//        return this.discount30;
//    }


}



class Discount {
    String name;
    int scope; //  0==wszystkie przedmioty
    int value;
    int indexOfProduct;

    public Discount(String name, int scope, int value) {
        this.name = name;
        this.scope = scope;
        if(value <100 && value>0){
            this.value = value;
        }
        this.indexOfProduct = -1;
    }

    public int getValue() {
        return value;
    }

    public int getIndexOfProduct() {
        return indexOfProduct;
    }

    public void setIndexOfProduct(int indexOfProduct) {
        this.indexOfProduct = indexOfProduct;
    }

    public String getScope() {
        return scope;
    }

}
