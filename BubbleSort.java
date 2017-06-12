public class BubbleSort{

  //use this to print the array so the code doesnt look so cluttered
  public static void printArry(int[] bubArray){
    for(int x = 0; x < bubArray.length; x++){
      System.out.print(bubArray[x]+" ");
    }
    System.out.println(" ");
  }

  public static void main(String[] args){
    BubbleSort bubSort = new BubbleSort();
    int countIterationi = 0;
    int countIterationj = 0;
    int[] bubArray = {5,1,12,-5,16,0};
    int temp = 0;

    //by using -1 I can decrease the amount of iterations for i by 1 and still get same result.
    //originally intended for an expected out of bounds but that doesnt happen
    for(int i = 0; i < bubArray.length-1; i ++){
      //start one ahead of i (which is 1 instead of 0) we can then get to 0 by saying j-1
      for(int j = 1; j < bubArray.length - i; j++){
        //if the previous (j-1) is greater than the current(j), swap elements
        if(bubArray[j-1] > bubArray[j]){
          //save the previous element in temp
          temp = bubArray[j -1];
          //place the current element in the previous' spot
          bubArray[j -1] = bubArray[j];
          //put the previous element in the current element's old spot
          bubArray[j] = temp;

          bubSort.printArry(bubArray);
        }
        countIterationj++;
      }
        countIterationi++;
    }
      System.out.println("iterations of j should be product of i * i ");
      System.out.println("number of iterations for j= "+countIterationj + " number of iterations for i= "+countIterationi);
    }
  }
