class Cat{
  private int legs;
  private String name;

  public Cat(){
    this.legs = 4;
    this.name = "Whiskers";
  }

  public Cat(int legs, String name) {
    this.legs = legs;
    this.name = name;
  }

  public int getLegs() {
    return this.legs;
  }

  public String getName() {
    return this.name;
  }

  public void setLegs(int legs) {
    this.legs = legs;
  }

  public void setName(String name) {
    this.name = name;
  }
  //cat greets dog
  public void greet(Dog friend) {
    System.out.println("Hello " + friend.getName() + " my friend.");
  }
}