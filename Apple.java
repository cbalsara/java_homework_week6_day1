public class Apple{

// instance variable
private String colour;
private String brand;
private char size; 

// java constructor. this should always be public, never private or it cant be accesed in the test file!!!
public Apple(String red, String crab, char m){
  this.colour = red;
  this.brand = crab;
  this.size = m; 
}

public String colourOfApple(){
  return this.colour;
}

public String brandOfApple(){
  return this.brand;
}

public char sizeOfApple(){
  return this.size;
}

}