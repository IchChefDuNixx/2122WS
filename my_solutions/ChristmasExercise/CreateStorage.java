import java.util.*;
import static java.lang.Math.*;

public class CreateStorage {
  public static Parcel[] create(int numberOfParcelAttributes, int numberOfParcels) {
    double breadth;
    double length;
    double height;
    double volume;
    double weight;
    double[] initArray = new double[numberOfParcelAttributes];
    Parcel[] storage = new Parcel[numberOfParcels];

    Random randomGen = new Random();

    for(int j = 0; j < numberOfParcels; j++) {
      int randomValueCount = abs(randomGen.nextInt(3))+3;
      //System.out.println(randomValueCount);
      for(int i = 0; i < randomValueCount; i++) {
      int randomA = abs(randomGen.nextInt(100));
      double randomB = abs(randomGen.nextDouble());
      double randomProduct = randomA*randomB;
      //System.out.println(randomProduct);
      initArray[i] = randomProduct;
    }
    storage[j] = new Parcel(initArray[0], initArray[1], initArray[2], initArray[3], initArray[4]);
  }

  //System.out.println("");
  return storage;
  }

  public static Parcel[] createPrint(int numberOfParcelAttributes, int numberOfParcels){
    Parcel[] storage = create(numberOfParcelAttributes, numberOfParcels);
  for(int i = 0; i < numberOfParcels; i++) {
    storage[i].toString();
  }
  //System.out.println("");
  return storage;
  }
}
