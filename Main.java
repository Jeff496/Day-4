class Main {
  public static void main(String[] args) {
    Dog clifford = new Dog();
    Dog bolt = new Dog(4, "Bolt");
    bolt.introduction();

    bolt.attack(clifford);
    System.out.println(clifford.getLegs());
    
    Cat whiskers = new Cat();
    whiskers.greet(bolt);
    
    // Dog bolt = new Dog(4, "Bolt");
    // System.out.println(bolt.getName());
    //methods should always have the parenthesis
    // Dog cloud = new Dog(4, "Cloud");
    // ClassName objectName = new Constructor();
    // Whenever you want to use a method you need to use the objectName.
    // System.out.println(clifford.getTotal());
  }
  // Classses and objects
  // In java, classes are like blueprints.
  // Blueprints for objects(following the blueprints).
  //Java is object oriented language.
  
}