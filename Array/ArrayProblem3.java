//Write a program to reverse an array or string recursively


public class ArrayProblem3 {

    void reverse(int arr[], int start, int end) {

        if(start<end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end]=temp;
            end--;
            start++;
            reverse(arr, start, end);
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

        ArrayProblem3 prob = new ArrayProblem3();
        prob.display(arr);

        prob.reverse(arr, 0, arr.length-1);
        prob.display(arr);
    }
}

