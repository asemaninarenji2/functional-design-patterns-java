public class OrderYourJewel {
  Jewel firstOrder = new Jeweller(Jewel::ring).make(new Jewel("Silver"));
  Jewel myOrder = new Jeweller(Jewel::feature).make(new Jeweller(Jewel::ring).make(new Jewel("GOLD")));
  Jewel yourOrder = new Jeweller(Jewel::feature).make(new Jeweller(Jewel::bracelet).make(new Jewel("Platinum")));
  System.out.println("first order is: " + firstOrder.getType());
  System.out.println("my order is: " + myOrder.getType());
  System.out.println("first order is: " + yourOrder.getType());
  
}
