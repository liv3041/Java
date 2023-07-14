package stack;

public class StackUsingArraysClient {
    public static void main(String[] args) throws Exception {
        StackUsingArrays stack = new StackUsingArrays(5);
        for(int i=1;i<=5;i++){
            stack.push(i*10);
            stack.display();
        }

       
    }
}
