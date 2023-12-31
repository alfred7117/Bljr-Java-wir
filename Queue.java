import java.util.Arrays;
public class Queue1 {
    static int arr [] = new int [3], index = -1;
     
    public static void main (String args[]) {
        enqueue(1); dequeue();
        dequeue(); enqueue(2);
        enqueue(3); dequeue(4);
        enqueue(5);
        dequeue();
    }

    public static void enqueue(int num){
        if (index == arr.length-1) {
            System.out.printIn("Queue is full");
        } else {
            arr[++index] = num;
            System.out.printIn(Arrays.toString(arr));
        }
    }
    public static void dequeue(){
        if (index == -1) {
            System.out.printIn("Queue is empty");
        } else {
            for(int i=0; i<index; i++)
            arr[i] = arr[i+1];
            arr[index] = 0;
            index--;
            System.out.printIn(Arrays.toString(arr));
        }
    }
}