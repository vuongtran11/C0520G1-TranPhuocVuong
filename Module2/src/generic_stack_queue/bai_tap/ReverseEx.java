package generic_stack_queue.bai_tap;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ReverseEx {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }
        System.out.println("Before reverse: " + list);

        Stack<Integer> stack = new Stack<Integer>();
        while (list.size() > 0) {
            stack.push(list.remove(0));
        }
        while (stack.size() > 0) {
            list.add(stack.pop());
        }
        System.out.println("After reverse: " + list);
    }

    /*   int arr[] = new int[] { 1,2,3,5,7 };
        Stack stack_push = new Stack();
        {
            int size = 0;
            for (int i = 0; i < arr.length; i++) {
                stack_push.push(arr[i]);
            }
            System.out.println("Before Push :" + stack_push);
            stack_push.push(6);
            stack_push.push(7);
            System.out.println("After Push :" + stack_push);
        }

        Stack stack_pop = new Stack();
        {
            System.out.println("Pop : ");
            int size = -1;
            for (int i = 0; i <arr.length; i++) {
                arr[i] = (int) stack_push.get(i);
                stack_pop.pop(arr[i]);
                System.out.print(arr[i] + "\t");
            }
            System.out.println("\n" + "Pop :" + stack_pop);
        }
    }*/
}
