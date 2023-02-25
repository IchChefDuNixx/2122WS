public class Sort {
  public static Parcel[] copy(Parcel[] inputArray) {
    Parcel[] sortedArray = new Parcel[inputArray.length];
    for(int i = 0; i < inputArray.length; i++) {
      sortedArray[i] = inputArray[i];
    }
    return sortedArray;
  }

  public static Parcel[] heightSort(Parcel[] inputArray) {
    Parcel[] sortedArray = copy(inputArray);
    int swapCount = 0;
    do{
      swapCount = 0;
      for(int i = 0; i < inputArray.length-1; i++) {
        if(inputArray[i].getHeight() > inputArray[i+1].getHeight()) {
          sortedArray[i] = inputArray[i+1];
          sortedArray[i+1] = inputArray[i];
          inputArray[i] = sortedArray[i];
          inputArray[i+1] = sortedArray[i+1];
          swapCount++;
        }
      }
    }while(swapCount != 0);
    return sortedArray;
  }

  public static Parcel[] heightSortPrint(Parcel[] inputArray) {
    Parcel[] sortedArray = heightSort(inputArray);
    for(int i = 0; i < inputArray.length; i++) {
      sortedArray[i].toString();
    }
    return sortedArray;
  }

  public static Parcel[] volumeSort(Parcel[] inputArray) {
    Parcel[] sortedArray = copy(inputArray);
    int swapCount = 0;
    do{
      swapCount = 0;
      for(int i = 0; i < inputArray.length-1; i++) {
        if(inputArray[i].getVolume() > inputArray[i+1].getVolume()) {
          sortedArray[i] = inputArray[i+1];
          sortedArray[i+1] = inputArray[i];
          inputArray[i] = sortedArray[i];
          inputArray[i+1] = sortedArray[i+1];
          swapCount++;
        }
      }
    }while(swapCount != 0);
    return sortedArray;
  }

  public static Parcel[] volumeSortPrint(Parcel[] inputArray) {
    Parcel[] sortedArray = volumeSort(inputArray);
    for(int i = 0; i < inputArray.length; i++) {
      sortedArray[i].toString();
    }
    return sortedArray;
  }

  public static Parcel[] weightSort(Parcel[] inputArray) {
    Parcel[] sortedArray = copy(inputArray);
    int swapCount = 0;
    do{
      swapCount = 0;
      for(int i = 0; i < inputArray.length-1; i++) {
        if(inputArray[i].getWeight() > inputArray[i+1].getWeight()) {
          sortedArray[i] = inputArray[i+1];
          sortedArray[i+1] = inputArray[i];
          inputArray[i] = sortedArray[i];
          inputArray[i+1] = sortedArray[i+1];
          swapCount++;
        }
      }
    }while(swapCount != 0);
    return sortedArray;
  }

  public static Parcel[] weightSortPrint(Parcel[] inputArray) {
    Parcel[] sortedArray = weightSort(inputArray);
    for(int i = 0; i < inputArray.length; i++) {
      sortedArray[i].toString();
    }
    return sortedArray;
  }
}
