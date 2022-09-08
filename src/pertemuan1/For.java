package pertemuan1;

public class For {
    public static void main(String[] args) {
        int array[] = {33,4,5,23,1,5,6};
        int total = 0;

        for (int i=0; i<array.length;i++)
        {
            total +=array[i];
        }
        System.out.println(total);
    }
}