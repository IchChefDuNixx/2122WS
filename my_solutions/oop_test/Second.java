class Second {
  public static void main(String[] args) {
    Circle defaultCircle = new Circle();
    Circle circle1 = new Circle("pog", 1, 2, 3);

    System.out.println(defaultCircle.x + defaultCircle.name + defaultCircle.y + defaultCircle.radius);
    System.out.println(circle1.x + circle1.name + circle1.y + circle1.radius);
  }
}
