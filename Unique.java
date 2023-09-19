public class Unique
{
    public static void main(String[] args)
    {
        // Input strings to test the function.
        String example = "owen";
        String fail = "multiple";
        
        System.out.println(UniquenessTest(example));
        System.out.println(UniquenessTest(fail));
    } 
  public static boolean UniquenessTest(String str)
  {
      // First for loop runs through characters of input string.
      for(int i = 0; i < str.length(); i++)
      {
          int counter = 0;
          // Counter will be used to count repeat appearances of letters. Resets for every new 'i' value. 
          // Second for loop runs through the input string again to compare with character from intial for loop. 
          for(int j = 0; j < str.length(); j++)
          {
              if(str.charAt(i) == str.charAt(j))
              {
                  counter++;
                  // If the letters compared are the same, the counter increases by one. 
              }
          }
          if(counter > 1)
          {
              // At any point, if the counter reaches more than one, meaning there was more than one appearance of the letter in the word, the program returns false.
              return false;
          }
      }
      // If counter never hits more than one for any of the letters, the program returns true. 
      return true;
  }
}
