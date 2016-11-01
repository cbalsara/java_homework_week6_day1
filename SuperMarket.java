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

public int numberInStock(){
  int count = 0;

  for(Apple quantity: stockCount) {
    if (quantity != null) {
      count ++;
    }
  }
  return count;
}

public void add(Apple apples){
  if( stockCountFull() ) {
    return;
  }
  int nextEmptySpot = numberInStock();
  stockCount[nextEmptySpot] = apples;
  }

  public boolean stockCountFull(){
    return numberInStock() == stockCount.length; 
  }

  public void empty(){
    for (int i = 0; i< stockCount.length; i++) {
      stockCount[i] = null;
    }
  }
}