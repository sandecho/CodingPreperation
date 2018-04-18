//Write a program to reverse an array or string


public class ArrayProblem2 {

    void reverse(int arr[]) {
        int len = arr.length;
        for(int i=0; i<len/2; i++)
        {
            int temp = arr[i];
            arr[i] = arr[len-1-i];
            arr[len-1-i]=temp;
        }
    }

    void display(int arr[]) {

        for(int i=0; i< arr.length; i++) {
            System.out.print(arr[i]+ "  ");
        }
        System.out.println("");
    }


    public static void main(String args[]) {

        int arr[] = new int[13];
        for(int i=0; i<13; i++)
            arr[i]=i+1;

        ArrayProblem2 prob = new ArrayProblem2();
        prob.display(arr);

        prob.reverse(arr);
        prob.display(arr);
    }
}

