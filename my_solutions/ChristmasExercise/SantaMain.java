public class SantaMain {
    public static void main(String[] args) {
      Parcel[] storage = CreateStorage.create(5,10);
      Sort.heightSortPrint(storage);
      System.out.println("-");
      Sort.volumeSortPrint(storage);
      System.out.println("-");
      Sort.weightSortPrint(storage);
      System.out.println("");
  }
}
