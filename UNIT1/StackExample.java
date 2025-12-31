import java.util.Stack;

public class StackExample{
    public static void main(String[] args) {
        Stack <Integer> st=new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);

        int poppedElement = st.pop();  
System.out.println("Popped: " + poppedElement); 
System.out.println(st);

int topElement = st.peek();  
System.out.println("Top element: " + topElement); 

if(st.empty()) {
    System.out.println("Stack is empty");
} else {
    System.out.println("Stack is not empty");
}
int pos = st.search(10);
System.out.println("Position of 10: " + pos); 



    }
}