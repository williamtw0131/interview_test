import java.util.*;

class solution2
{
  public static void main(String[] args)
  {
    ArrayList<Integer> s = new ArrayList<Integer>();
    //s = [1, 2, 3, 4, 5];
    for (int i = 1; i < 6; i++)
    {
      s.add(i);
    }
    ArrayList<Integer> m = new ArrayList<Integer>();
    //m = [99, 98, 97, 96, 95];
    for (int i = 1; i < 6; i++)
    {
      m.add(100 - i);
    }

    int length = s.size();
    for (int i = 0; i < length; i++)
    {
      int sum = s.get(i) + m.get(i);
      System.out.format("%d + %d = %d", s.get(i), m.get(i), sum);
      System.out.println();
      int mul = s.get(i) * m.get(i);
      System.out.format("%d * %d = %d", s.get(i), m.get(i), mul);
      System.out.println();
    }
  }
}
