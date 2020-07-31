
import java.util.Arrays;


public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {8,3,7,9,1,2,4};
        System.out.println(Arrays.toString(array));
        
        MainProgram.sort(array);
    }

    public static int smallest(int[] array) {
        int menor = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < menor) {
                menor = array[i];
            }
        }
        return menor;
    }

    public static int indexOfSmallest(int[] array) {
        int pos = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == smallest(array)) {
                pos = i;
            }
        }
        return pos;
    }

    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int aux = array[startIndex];
        int pos = -1;
        for (int i = startIndex; i < array.length; i++) {
            if (array[i] <= aux) {
                aux = array[i];
                pos = i;
            }
        }
        return pos;
    }
    
    public static void swap(int[] array, int index1, int index2){
        int aux1 = array[index1];
        array[index1] = array[index2];
        array[index2] = aux1;     
    }
    
    public static void sort(int[] array){
        for(int i = 0; i < array.length; i++){
            if(array[i] > array[indexOfSmallestFrom(array, i)]){
                swap(array, i, indexOfSmallestFrom(array, i));
            }
            
        
        System.out.println(Arrays.toString(array));
    }
    }

}
