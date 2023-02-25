public class Parcel {
  private double breadth;
  private double length;
  private double height;
  private double volume;
  private double weight;

  Parcel(double breadth, double length, double height) {
    this(breadth, length, height, 0.0);
  }
  Parcel(double breadth, double length, double height, double volume) {
    this(breadth, length, height, volume, 0.0);
  }
  Parcel(double breadth, double length, double height, double volume, double weight) {
    this.breadth = breadth;
    this.length = length;
    this.height = height;
    if(volume != 0.0) {
      this.volume = volume;
    } else {
      this.volume = (breadth*length*height)/1000;
    }
    if(weight != 0.0) {
      this.weight = weight;
    } else {
      this.weight = ((breadth*length*height)/1000)*0.961;
    }
  }

  public double getBreadth() {
    return breadth;
  }
  public double getLength() {
    return length;
  }
  public double getHeight() {
    return height;
  }
  public double getVolume() {
    return volume;
  }
  public double getWeight() {
    return weight;
  }
  public void setVolume(double volume) {
    this.volume = volume;
  }
  public void setWeight(double weight) {
    this.weight = weight;
  }
  @Override
  public String toString() {
    String rString = getBreadth() + ", " +
                     getLength() + ", " +
                     getHeight() + ", " +
                     getVolume() + ", " +
                     getWeight() + " (BxLxH, V[dm^3], W[kg])";
    System.out.println(rString);
    return rString;
  }
}
