public class Circle {
  String name;
  int x;
  int y;
  int radius;

  public Circle() {
    this.name = "default";
    this.x = 0;
    this.y = 0;
    this.radius = 1;
  }
  public Circle(String name, int x, int y, int radius) {
    this.name = name;
    this.x = x;
    this.y = y;
    this.radius = radius;
  }

}
