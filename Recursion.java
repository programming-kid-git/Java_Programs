import java.util.ArrayList;

public class Recursion
{
    public static void main(String args[])
    {
        /*
       // Storing all Indexes using Recursion...
       int[] arr = {1,6,2,1,1,8,4,1};
       int[] res = presenceindex(arr ,  1 , 0 , 0);
       for(int i =0;i<res.length;i++)
       {
            System.out.print(res[i]+" ");
       } 
       */
       // Getting all Subsequence of Strings...
       String inp = "abc";
       ArrayList<String> subsequenceouptut = subsequence(inp);
       for(int i =0;i<subsequenceouptut.size();i++)
       {
           System.out.print(subsequenceouptut.get(i));
       }

    }
    public static int[] presenceindex( int[] arr , int key  , int vindex , int count)
    {
        if(vindex == arr.length)
        {
            int[] output = new int[count];
            return output;
        }       
        if(arr[vindex] == key)
        {
            int[] output = presenceindex(arr , key , vindex+1 , count+1);
            output[count] = vindex;
            return output;
        }
        else
        {
            int output[] = presenceindex(arr , key , vindex+1 , count);
            return output;
        }
    }
    public static ArrayList<String> subsequence(String inp)
    {

        if(inp.length() == 0)
        {
            ArrayList<String> result = new ArrayList<String>();
            result.add(" ");
            return result;
        }
        char ch = inp.charAt(0);
        String remainingstring  = inp.substring(1);

        ArrayList<String> dummy = subsequence(remainingstring);

        ArrayList<String> result = new ArrayList<>();

        for(int i=0 ;i<dummy.size();i++)
        {
                result.add(dummy.get(i));
                result.add(ch+dummy.get(i));
        }
        return result;
    }
}   