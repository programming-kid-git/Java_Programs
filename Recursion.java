public class Recursion
{
    public static void main(String args[])
    {
       // Storing all Indexes using Recursion...
       int[] arr = {1,6,2,1,1,8,4,1};
       int[] res = presenceindex(arr ,  1 , 0 , 0);
       for(int i =0;i<res.length;i++)
       {
            System.out.print(res[i]+" ");
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
}   