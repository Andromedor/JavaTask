package Laba1;


public class Main  {
    public static void main(String[] args) {

        Massive massive = new Massive();
        massive.PrintArray(); // 1 задание

        System.out.println("\nArray with step");
        try
        {
            massive.showArray(massive.FillArray(2, 14, 4));
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}


