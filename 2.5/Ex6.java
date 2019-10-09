
public class Ex6    {
    public static void main(String[] args)  {
        box(6, 3);
    }

    public static void box(int x,int y)    {
        for(int n = 0; n < 3; n++)  {
            for(int i = 0; i < x; i++)   {
                System.out.print("$");
            }
            System.out.println("");
        }
    }

}
