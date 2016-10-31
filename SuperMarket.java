public class SuperMarket{

// instance variable 
  private String name;
  private Apple[] stockCount;

// java constructor 
  public SuperMarket(String nameOfSupermarket){
    this.name = nameOfSupermarket;
    this.stockCount = new Apple[12];
  }

  public String nameOfShop(){
    return this.name;
  }

public int NothingThere(){
  int count = 0;

  for(Apple quantity: stockCount) {
    if (quantity != null) {
      count ++;
    }
  }
  return count;
}

}