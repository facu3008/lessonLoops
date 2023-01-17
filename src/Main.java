import java.util.*;

public class Main {

    public static void main(String[] args)
    {
        Integer array[]  = {2,3,1,5,6};
        System.out.println("Array inicial: ");
        for(int i=0; i<array.length; i++)
            System.out.print(array[i] +  " ");
        System.out.println("");
        System.out.println("Array al reves:");
        for(int i=array.length-1;i>=0;i--)
            System.out.print(array[i] + " ");
        System.out.println("");
        System.out.println("Multiplicar por numero siguiente");
        for(int i=0; i<array.length; i++)
            if (i <array.length-1 )
            System.out.print(array[i]*array[i+1] +  " ");
            else System.out.print(array[i]*array[0] +  " ");
        System.out.println("agrego comentario:");
    }


}