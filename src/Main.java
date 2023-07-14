import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of elements !!!");
        int size=scanner.nextInt();
        int array[]=new int[size];
        System.out.println("Enter the Array Elements !!!!");
        for(int i=0;i<size;i++){
            array[i]=scanner.nextInt();
        }

        int Equilibrium=prefixSum(array,size);
        System.out.println(Equilibrium);
    }

    //prefix sum function
    private static int prefixSum(int[] array, int size) {
        int[] prefix=new int[size];
        prefix[0]=array[0];
        for(int i=1;i<size;i++){
            prefix[i]=prefix[i-1]+array[i];
        }
        int count=0;
        int ind=-1;
        for(int i=1;i<size;i++){
            if(prefix[i-1]==prefix[size-1]-prefix[i]){
                count++;
                return i;
            }
        }
        return ind;
    }

}