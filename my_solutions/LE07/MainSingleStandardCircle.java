public class MainSingleStandardCircle {
  public static void main(String[] args) {

   Circle circle1 = new Circle();

   circle1.name = "yo";
   circle1.radius = 50;
   circle1.xPos = 200;
   circle1.yPos = 200;
   circle1.colour = 0;

   Circle circle2 = new Circle("kek", 1, 5, 5, 1);

   System.out.println(circle1.xPos + ", " + circle1.yPos);
   Circle.relocate(circle1, 50, 50);
   System.out.println(circle1.xPos + ", " + circle1.yPos);
   Circle.relocate(circle1, -100, -100);
   System.out.println(circle1.xPos + ", " + circle1.yPos);

   System.out.println("\n" + circle1.radius);
   System.out.println(Circle.getRadius(circle1));
   Circle.setRadius(circle1, 20);
   System.out.println(Circle.getRadius(circle1));
   }
}
