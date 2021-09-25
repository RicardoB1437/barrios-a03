package baseline;

public class Table
{
    public int[] makeRow(int baseNum)
    {
        int arr[] = new int[12];

        //for loop through 12 times and multiply baseNum by i
        for(int i=0;i<12;i++)
        {
            arr[i] = baseNum * (i+1);
        }
        return arr;
    }

    public void makeTable()
    {
        Table table = new Table();

        //for loop through 12 times and call makeRow(i)
        int arr[] = new int[12];
        for(int i=0;i<12;i++)
        {
            arr = table.makeRow(i+1);
            for(int j=0;j<12;j++)
            {
                String space = "     "; //4 spaces
                if(arr[j] >= 10 && arr[j] < 100)
                {
                    space = "    "; //3 spaces
                    System.out.printf("%d%s", arr[j], space);

                }
                else if(arr[j] >= 100)
                {
                    space = "   "; //2 spaces
                    System.out.printf("%d%s", arr[j], space);
                }
                else
                    System.out.printf("%d%s", arr[j], space);
            }
            System.out.println();
        }
    }

}
