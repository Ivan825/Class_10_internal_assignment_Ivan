public class Question7
{
    public static void main(int avg_mrks)
    {
        String stream ;
        if(avg_mrks>=90)
        {
            stream = "Science with computers";
        }
        else if(avg_mrks>=80 && avg_mrks<90)
        {
            stream = "Science without computers";
        }
        else if(avg_mrks>=70 && avg_mrks<80)
        {
            stream = "Commerce with Maths";
        }
        else if(avg_mrks>=60 && avg_mrks<70)
        {
            stream = "Commerce without Maths";
        }
        else
        {
            
            stream = "Not applicable for any stream.";
        }
        System.out.println(stream);
    }
}
            