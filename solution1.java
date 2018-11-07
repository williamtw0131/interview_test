import java.io.*;
import java.util.*;

class solution1
{
  public static void main(String[] args)
  {
    // creat a arraylist to store all the appearing words without dulipcate
    ArrayList words = new ArrayList();
    // store by HashSet (key-value pair), (won't be any duplicate automatically)
    Map<Character, Integer> word_time = new HashMap<Character, Integer>();

    String so = new String("nahxatoamktbkoydvxoqbkkhvmadbu");
    // get the length of so string
    int len = so.length();
    // iterate through the string "so"
    // make a none duplicate arraylist and hashset at the same time
    for (int i = 0; i < len; i++)
    {
      // character c at position s[i]
      char c = so.charAt(i);
      // if c not in "words" arraylist
      if (words.contains(c) == false)
      {
        // add c into arraylist
        words.add(c);
      }

      // if c is in the hashset
      if (word_time.containsKey(c))
      {
        // get the correspond value of that key
        int count = word_time.get(c);
        // modify the value (add 1)
        word_time.put(c, ++count);
      }
      // if the hashset didn't contain that key
      else
      {
        // add that key-value as letter-1
        word_time.put(c, 1);
      }
    }

    // find the most appear letter
    int maxima = 0;
    int length = words.size();
    // iterate through the hashset with key from arraylist
    for (int i = 0; i < length; i++)
    {
      // if maxima <= value found by the key
      if (maxima <= word_time.get(words.get(i)))
      {
        // assign the value to maxima
        maxima = word_time.get(words.get(i));
      }
    }
    // go through again to find the key with maxima value
    for (int i = 0; i < length; i++)
    {
      if (maxima == word_time.get(words.get(i)))
      {
        //System.out.println(words.get(i));
        //System.out.println(maxima);
        System.out.format("char: %s count: %d", words.get(i), maxima);
        System.out.println();
      }
    }

  }
}
