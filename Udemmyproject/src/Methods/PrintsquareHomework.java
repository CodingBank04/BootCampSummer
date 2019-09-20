package Methods;

public class PrintsquareHomework {
    static void printsquare(int n)
    {
        int i, j;

        for (i = 1; i <= n; i++)
        {
            for (j = 1; j <= n; j++)
            {
                if (i == 1 || i == n ||
                        j == 1 || j == n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }
    public static void main(String args[])

    {
        PrintsquareHomework.printsquare(4);

    }
}


