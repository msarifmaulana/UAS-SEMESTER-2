package GooglePlay;

public class GooglePlay {


    TypeToken<List<Datum>> token = new TypeToken<List<Datum>>() {};
    List<Datum> listObject = gson.fromJson(data, token.getType());

    public void setData(int[] data) { this.data = data; }

    private int partition (int start, int end)
    {
        int pivot = this.data[end];
        int i = (start - 1);
        for (int j = start; j <= end - 1; j++)
        {

            if (this.data[j] < pivot)
            {
                i++;
                int t = this.data[i];
                this.data[i] = this.data[j];
                this.data[j] = t;
            }
        }
        int t = this.data[i+1];
        this.data[i+1] = this.data[end];
        this.data[end] = t;
        return (i + 1);
    }

    public void quickSort(int start,int end)
    {
        if (start < end)
        {
            int p = partition(start, end);
            quickSort(start, p - 1);
            quickSort(p + 1, end);
        }
    }


    public void printArr(int n)
    {
        int i;
        for (i = 0; i < n; i++)
            System.out.println(this.data[i] + " ");
    }

    public static void main(String[] args) {
        int[] dataArray = { 13, 18,27, 2, 19, 25 };
        int n = dataArray.length;
        System.out.println("""
                Before sorting array elements are -\s
                """);
        quicksort _myQS = new quicksort();
        _myQS.setData(dataArray);
        _myQS.printArr(n);
        _myQS.quickSort(0, n - 1);
        System.out.println("\nAfter sorting array elements are - ");
        _myQS.printArr(n);
        System.out.println();


    }
}
