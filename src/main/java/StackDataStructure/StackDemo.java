package StackDataStructure;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) throws Exception {
        StackUsingArray st = new StackUsingArray(5);

        st.push(11);
        st.push(22);
        st.push(33);
        st.push(44);
        st.push(78);
        //st.push(8);

        st.display();

        System.out.println("Size: " + st.getSize());
        System.out.println("Peek: "+ st.peek());
        System.out.println("pop: " + st.pop());
        System.out.println("Peek: "+ st.peek());
        System.out.println("Size: " + st.getSize());

        st.display();

        while(!st.isEmpty()){
            int top = st.peek();
            System.out.print(top + " ");
            st.pop();
        }


    }
}
