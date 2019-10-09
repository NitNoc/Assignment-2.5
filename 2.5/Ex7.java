import java.util.Scanner;

public class Ex7  {
    static int out = 0;
    static int side = 0;
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        String ask = "y";
        while(ask.equals("y"))   {
            //for(int i = 0; i >= 0; i++) {
            n = 0;
            out = 0;
            System.out.print("How many D6's do you want to roll? ");
            n = sc.nextInt();
            System.out.print("How many sides do these dice have? ");
            side = sc.nextInt();
            System.out.println("");
            System.out.print("You rolled ");
            for(int j = 1; j <= n; j++ )    {
                roll();
            }
            System.out.println("");
            System.out.println(out + " ");
            System.out.println("");
            System.out.print("Again ? [y,n] ");
            ask = sc.next();
            //}
        }
        if(ask.equals("n")) {
            System.out.println("Good-bye?");
        }
    }
    public static void roll()   {
        double rng = 0;
        rng = Math.random() * side + 1;
                int f = (int) rng;
                System.out.print(f + " ");
                out = f + out;
    }
}
