public class Unique
{
    public static void main(String[] args)
    {
        String example = "owen";
        String fail = "multiple";
        
        System.out.println(UniquenessTest(example));
        System.out.println(UniquenessTest(fail));
    } 
  public static boolean UniquenessTest(String str)
  {
      for(int i = 0; i < str.length(); i++)
      {
          int counter = 0;
          for(int j = 0; j < str.length(); j++)
          {
              if(str.charAt(i) == str.charAt(j))
              {
                  counter++;
              }
          }
          if(counter > 1)
          {
              return false;
          }
      }
      return true;
  }
}
