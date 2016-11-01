import java.util.*;

public class SuperMarket{

// instance variable 
  // this will eventaully look like private ArrayList<Purchasable> stockCount;
  private String name;
  private ArrayList<Apple>stockCountApple;
  private ArrayList<Pear>stockCountPear;

// java constructor 
// these two below will go and look like this.stockCount = new ArrayList<Purchasable>();
  public SuperMarket(String nameOfSupermarket){
    this.stockCountApple = new ArrayList<Apple>();
    this.stockCountPear = new ArrayList<Pear>();
    this.name = nameOfSupermarket;
  }

  public String nameOfShop(){
    return this.name;
  }

public int numberInStockApple(){
  return this.stockCountApple.size();
}

public int numberInStockPear(){
  return this.stockCountPear.size();
}

public void add(Apple apples){
  this.stockCountApple.add(apples);
}

public void add(Pear pears){
  this.stockCountPear.add(pears);
}
 

// had to change the length into .size(); as the stockCount is now an ArrayList
  public int stockCountFull(){
    return this.stockCountApple.size() + this.stockCountPear.size();
  }

  public void empty(){
    this.stockCountApple.clear();
    this.stockCountPear.clear();  
  }

}