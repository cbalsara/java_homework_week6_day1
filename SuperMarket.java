import java.util.*;

public class SuperMarket{

// instance variable 
  private String name;
  private ArrayList<Apple>stockCount;

// java constructor 
  public SuperMarket(String nameOfSupermarket){
    this.name = nameOfSupermarket;
    this.stockCount = new ArrayList<Apple>();
  }

  public String nameOfShop(){
    return this.name;
  }

public int numberInStock(){
  return stockCount.size();
}

public void add(Apple apples){
  stockCount.add(apples);
}
 

// had to change the length into .size(); as the stockCount is now an ArrayList
  public boolean stockCountFull(){
    return numberInStock() == stockCount.size(); 
  }

  public void empty(){
    stockCount.clear();  
  }

}