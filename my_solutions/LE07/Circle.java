class Circle {

     String name;
     int radius;
     int xPos;
     int yPos;
     int colour;

    public Circle() {
      this.name = "default";
      this.radius = 1;
      this.xPos = 0;
      this.yPos = 0;
      this.colour = 0;
    }

    public Circle(String name, int radius, int xPos, int yPos, int colour) {
      this.name = name;
      this.radius = radius;
      this.xPos = xPos;
      this.yPos = yPos;
      this.colour = colour;

    }

    static void relocate(Circle inputCircle, int xOffset, int yOffset) {
      inputCircle.xPos += xOffset;
      inputCircle.yPos += yOffset;
    }

    static int getRadius(Circle inputCircle) {
      return(inputCircle.radius);
    }

    static void setRadius(Circle inputCircle, int newRadius) {
      inputCircle.radius = newRadius;
    }
}
