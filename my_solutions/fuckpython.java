import java.util.Arrays;

public class fuckpython {
  public static void main(String[] args) {

  //Jobs, ID, Time, Prio
  int[] A = {1, 10, 3};
  int[] B = {2, 6, 5};
  int[] C = {3, 4, 2};
  int[] D = {4, 2, 1};
  int[] E = {5, 8, 4};

  int[] Jobs = new int[15];
  int i = 0;
    for(int j = 0; j < 3; j++) {
    Jobs[i] = A[j];
    i++;
    }
    for(int j = i % 3; j < 3; j++) {
    Jobs[i] = B[j];
    i++;
    }
    for(int j = i % 3; j < 3; j++) {
    Jobs[i] = C[j];
    i++;
    }
    for(int j = i % 3; j < 3; j++) {
    Jobs[i] = D[j];
    i++;
    }
    for(int j = i % 3; j < 3; j++) {
    Jobs[i] = E[j];
    i++;
    }
  //System.out.println(Arrays.toString(Jobs));

  int[] IDs = new int[5];
  for(i = 0; i < 5; i++) {
    IDs[i] = Jobs[i*3];
  }
  //System.out.println(Arrays.toString(IDs));

  int[] Time = new int[5];
  for(i = 0; i < 5; i++) {
    Time[i] = Jobs[i*3+1];
  }
  //System.out.println(Arrays.toString(Time));

  int[] Prio = new int[5];
  for(i = 0; i < 5; i++) {
    Prio[i] = Jobs[i*3+2];
  }
  //System.out.println(Arrays.toString(Prio));

  schedule("Prio", Jobs);
  schedule("FCFS", Jobs);
  schedule("SJF", Jobs);
  schedule("cock", Jobs);
  }

  public static void schedule(String scheduleType, int[] inputArray) {
    int[] num = new int[5];
    int[] name = new int[5];

    if(scheduleType == "Prio") {
        for(int i = 0; i < 5; i++) {
          num[i] = inputArray[i*3+2];
          name[i] = inputArray[i*3];
        }
      int tempNum;
      int tempName;

      for (int i = 0; i < num.length; i++)
              {
                  for (int j = i + 1; j < num.length; j++)
                  {
                      if (num[i] > num[j])
                      {
                          tempNum = num[i];
                          tempName=name[i];

                          num[i] = num[j];
                          name[i] = name[j];

                          num[j] = tempNum;
                          name[j] = tempName;
                      }
                  }
              }

      System.out.println("avg. retention time: " + calculatePrioScheduling(inputArray));

    }else if(scheduleType == "FCFS") {

      for(int i = 0; i < 5; i++) {
        name[i] = inputArray[i*3];
      }

      System.out.println("avg. retention time: " + calculateFCFS(inputArray));

    }else if(scheduleType == "SJF") {
      System.out.println("avg. retention time: " + calculateShortestFirst(inputArray));

      for(int i = 0; i < 5; i++) {
        num[i] = inputArray[i*3+1];
        name[i] = inputArray[i*3];
      }
    int tempNum;
    int tempName;

    for (int i = 0; i < num.length; i++)
            {
                for (int j = i + 1; j < num.length; j++)
                {
                    if (num[i] > num[j])
                    {
                        tempNum = num[i];
                        tempName=name[i];

                        num[i] = num[j];
                        name[i] = name[j];

                        num[j] = tempNum;
                        name[j] = tempName;
                    }
                }
            }

    }else{
      System.out.println("Error: no matching scheduleType");
    }
    System.out.println("job order: " + Arrays.toString(name));
  }

  public static double calculatePrioScheduling(int[] inputArray) {
    double retentionTime = 0;
      for(int i = 0; i < 5; i++) {
        switch(inputArray[i*3+2]) {
          case 1:
          retentionTime = retentionTime + 5*inputArray[i*3+1];
          break;
          case 2:
          retentionTime = retentionTime + 4*inputArray[i*3+1];
          break;
          case 3:
          retentionTime = retentionTime + 3*inputArray[i*3+1];
          break;
          case 4:
          retentionTime = retentionTime + 2*inputArray[i*3+1];
          break;
          case 5:
          retentionTime = retentionTime + 1*inputArray[i*3+1];
          break;
        }
      }
    retentionTime = retentionTime/5;
    return retentionTime;
  }

  public static double calculateFCFS(int[] inputArray) {
    double retentionTime = 0;
    for(int i = 0; i < 5; i++) {
      retentionTime = retentionTime + (5-i)*inputArray[i*3+1];
    }
    retentionTime = retentionTime/5;
    return retentionTime;
  }

  public static double calculateShortestFirst(int[] inputArray) {
    int[] timeArray = new int[5];
    for(int i = 0; i < 5; i++) {
      timeArray[i] = inputArray[i*3+1];
    }
    int[] sortedTimeArray = new int[5];
    for(int i = 0; i < 5; i++) {
      sortedTimeArray[i] = timeArray[i];
    }
    Arrays.sort(sortedTimeArray);
    double retentionTime = 0;
    for(int i = 0; i < 5; i++) {
      for(int j = 0; j < 5; j++) {
        if(sortedTimeArray[i] == timeArray[j]) {
          retentionTime = retentionTime + (5-i)*timeArray[j];
        }
      }
    }
    retentionTime = retentionTime/5;
    return retentionTime;
  }
}
