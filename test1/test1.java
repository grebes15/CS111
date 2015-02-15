public class test1
{   
    public static void main(String[] args)
{
    int i, j, k;
    for (i = 0; i < 4; i++)
	{
	    j = i;
	    while (j <= 3)
		{
		    for ( k = i; k <= j; k++)
			System.out.println ("i = " + i + "k = " + k + "j = " + j);
		    j = j + 2;
		}
	}
}
}