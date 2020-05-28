public class Question8
{
    
    
    void check(String str,char ch)
    {
        int c = 0,code,i,s;
        str = str.toLowerCase();
        int len = str.length();
        for(code = 97;code<122;code++)
        {
            c = 0;
            for(i=0;i<len;i++)
            {
                ch = str.charAt(i);
                s = (int)ch;
                if(s==code)
                {
                    c= c+1;
                }
            }
            ch = (char)code;
            if(c!=0)
            System.out.println("Frequency of " + ch+"is"+ c);
        }
    }
    public void check(String s1) {
s1 = s1.toLowerCase();
for (int i = 0; i < s1.length(); i++) {
char currentChar = s1.charAt(i);
if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o'
|| currentChar == 'u') {
System.out.println(currentChar + " " );
}
}
}
}

            
            
     