import static org.junit.Assert.assertEquals;
import org.junit.*;

public class SuperMarketTest{
  SuperMarket superMarket;
  Apple apples;

  @Before
  public void before() {
    superMarket = new SuperMarket("Asda");
    apples = new Apple("red", "crab", 'm');
  }

  @Test
  public void name(){
    assertEquals( "Asda", superMarket.nameOfShop() );
  }

  @Test 
  public void appleColour(){
    assertEquals( "red", apples.colourOfApple() );
  }



}