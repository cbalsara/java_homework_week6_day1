import java.util.*;

public class SuperMarket{

// instance variable 
  private String name;
  private ArrayList<Apple>stockCountApple;
  private ArrayList<Pear>stockCountPear;

// java constructor 
  public SuperMarket(String nameOfSupermarket){
    this.stockCountApple = new ArrayList<Apple>();
    this.stockCountPear = new ArrayList<Pear>();
    this.name = nameOfSupermarket;
  }

  public String nameOfShop(){
    return this.name;
  }

public int numberInStockApple(){
  return stockCountApple.size();
}

public int numberInStockPear(){
  return stockCountPear.size();
}

public void add(Apple apples){
  stockCountApple.add(apples);
}

public void add(Pear pears){
  stockCountPear.add(pears);
}
 

// had to change the length into .size(); as the stockCount is now an ArrayList
  public int stockCountFull(){
    return stockCountApple.size() + stockCountPear.size();
  }

  public void empty(){
    stockCountApple.clear();
    stockCountPear.clear();  
  }

}