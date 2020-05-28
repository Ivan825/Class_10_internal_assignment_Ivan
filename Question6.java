public class Question6
{
    public static void main (String a)
    {
        String [] s = a.split("");
        String shortest = s[0];
        String longest = "";
        
        for(String s1:s)
        {
            if(s1.length()<shortest.length())
            {
                shortest = s1;
            }
            if(s1.length()>longest.length())
            {
                longest = s1;
            }
        }
        System.out.println("The shortest word is "+ shortest);
        System.out.println("The longest word is "+ longest);
    }
}