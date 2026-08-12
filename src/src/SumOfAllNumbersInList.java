class SumAllNumbers
{
    void sum()
    {
      int[] numbers = {10,80,90,87,66};

      int sum = 0;

      for(int i = 0; i < numbers.length; i++)
      {
          sum = sum + numbers[i];
      }

      System.out.println("Sum is: " + sum);

    }
}

public class SumOfAllNumbersInList
{
    public static void main(String[] args)
    {
        SumAllNumbers obj = new SumAllNumbers();

        obj.sum();
    }
}


//Formula / Logic
//sum = 0
//
//for each number:
//    sum = sum + number
//
//For {10, 20, 30}:
//
//10 + 20 + 30 = 60



//Using ArrayList
//ArrayList<Integer> numbers = new ArrayList<>();
//
//numbers.add(10);
//numbers.add(20);
//numbers.add(30);
//
//int sum = 0;
//
//for (int number : numbers) {
//    sum = sum + number;
//}
//
//System.out.println("Sum: " + sum);
//
//The main pattern to remember for Java questions is:
//
//int sum = 0;
//
//for (int number : numbers) {
//    sum += number;
//}