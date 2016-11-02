import static org.junit.Assert.*;
import org.junit.*;

public class SuperMarketTest{
  SuperMarket superMarket;
  Apple apples;
  Pear pears;

  @Before
  public void before() {
    superMarket = new SuperMarket("Asda");
    apples = new Apple("red", "crab", 'm');
    pears = new Pear();
  }

  @Test
  public void name(){
    assertEquals( "Asda", superMarket.nameOfShop() );
  }

  @Test 
  public void appleColour(){
    assertEquals( "red", apples.colourOfApple() );
  }

  @Test
  public void typeOfBrand(){
    assertEquals( "crab", apples.brandOfApple());
  }

@Test 
public void sizeOfApple(){
  assertEquals( 'm', apples.sizeOfApple());
}

@Test
public void superMarketEmpty(){
  assertEquals( 0, superMarket.numberInStock() );
}

@Test
public void addAppleToMarket(){
  superMarket.add(apples);
  assertEquals( 1, superMarket.numberInStock() );
}

@Test 
public void addPearToMarket(){
  superMarket.add(pears);
  assertEquals( 1, superMarket.numberInStock() );
}

@Test
public void numberInStockEmptied(){
  superMarket.add(apples);
  superMarket.add(pears);
  superMarket.empty();
  assertEquals( 0, superMarket.numberInStock() );
}

@Test 
public void canRefund(){
  superMarket.add(apples);
  Purchasable fruit = superMarket.refund();
  assertNotNull(fruit);
}


}