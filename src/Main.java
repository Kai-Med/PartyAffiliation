void main() {
  System.out.println("Enter your political affiliation (D, R, I, or Other):");
  String affiliation = "W";
  if (affiliation.equals("D")) {
    System.out.println("You get a Democratic Donkey.");
  } else if (affiliation.equals("R")) {
    System.out.println("You get a Republican Elephant.");
  } else if (affiliation.equals("I")) {
    System.out.println("You get an Independent Person.");
  } else {
    System.out.println("You get Other.");
  }
}