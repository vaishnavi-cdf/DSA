public class GasStation
{
     static void approach_1(int G[],int c[])
     {
        int Start=0,loss=0,rem=0;
        for(int i=0;i<G.length;i++)
        {
            rem=rem+G[i]-c[i];
            if(rem<0)
            {
                Start=i+1;
                loss=loss+rem;
                rem=0;
            }
        }
        if(loss+rem>=0)
        {
            System.out.println(Start);
        }

     }
     public static void main(String[] args)
     {
         int G[]={1,2,3,4,5};
         int C[]={3,4,5,1,2};
        approach_1(G,C);
}
}