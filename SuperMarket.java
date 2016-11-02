import java.util.*;

public class SuperMarket{

// instance variable 
  // this will eventaully look like private ArrayList<Purchasable> stockCount;
  private String name;
  private ArrayList<Purchasable> stockCount;

// java constructor 
// these two below will go and look like this.stockCount = new ArrayList<Purchasable>();
  public SuperMarket(String nameOfSupermarket){
    this.stockCount = new ArrayList<Purchasable>();
    this.name = nameOfSupermarket;
  }

  public String nameOfShop(){
    return this.name;
  }

public int numberInStock(){
  return this.stockCount.size();
}

// public int numberInStockPear(Purchasable pears){
//   return this.stockCountPear.size();
// }

// public void add(Apple apples){
//   this.stockCountApple.add(apples);
// }

public void add(Purchasable fruit){
  this.stockCount.add(fruit);
}
 
// had to change the length into .size(); as the stockCount is now an ArrayList
  public int stockCountFull(){
      return stockCount.size();
  //   return this.stockCountApple.size() + this.stockCountPear.size();
  }

  public void empty(){
    this.stockCount.clear();  
  }

}