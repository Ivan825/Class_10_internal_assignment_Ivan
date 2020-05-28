public class Question2
{
    
    void salary(String employee,float bsal)
    {
        float tsal = bsal + (bsal*50/100);
        System.out.println("Name: "+employee+" Salary: "+tsal);
    }
    
    public static void main(String args[])
    {
        Question2 Myobj1 = new Question2();
        Myobj1.salary("Ivan",1500);
    }
}