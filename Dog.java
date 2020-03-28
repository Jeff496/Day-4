class Dog {
  // class nae and file name must be the same
  // class names are uppercase.
  // To make objects using a class, you need a constructor
  // Before making a constructor, you want to have your instance variables
  private int legs;
  private String name;
  private static int total = 0;
  // static variables share the value across all objects

  // this refers to the object (think of it as a placeholder)
  // Anytime you need to access a method, an instance variable, or anything pertaining to the object, you nedd to have the object referenced first (eg this)
  
  //The constructor must match the name of the class
  //The empty constructor
  public Dog(){
    this.legs = 4;
    this.name = "Clifford";
    total = total + 1;
  }

  // Parameterized constructor
  public Dog (int legs, String name) {
    this.legs = legs;
    this.name = name;
    total = total + 1;
  }
  //blue word means it's a keyword in Java (you cannot use them for variables)

  //These are called getters or (accesesors)
  public int getLegs(){
    return this.legs;
  }
  public String getName(){
    return this.name;
  }
  public static int getTotal(){
    return total;
  }

  // These are also called setters (or mutators)
  public void setLegs(int legs) {
    this.legs = legs;
  }
  public void setName(String name){
    this.name = name;
  }

  // Those 3 things (instance variables, getters/setters) make up a class and should always be present in the least.
  // This is the bare minimum that you should have for a class.
  public void introduction(){
    System.out.println("Hi my name is " + this.name + ". Nice to meet you.");
  }
  //method that attacks another Dog
  //int, string, objects - nouns
  //methods verbs
  //want a noun
  public void attack(Dog foe){
    int foeLegs = foe.getLegs();
    foeLegs = foeLegs - 1;
    foe.setLegs(foeLegs);
  }
}