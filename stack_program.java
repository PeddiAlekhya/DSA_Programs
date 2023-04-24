import java.util.Scanner;

public class stack_program{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of stack : ");
       int size = sc.nextInt();

       int[] arr = new int[size];
       System.out.println("Enter the choice : 1 for push \n 2 for pop \n 3 for display ");
       int choice = sc.nextInt();
       switch (choice) {
        case 1:
            st. push();
            break;
        case 2:
            st.pop(); 
            break;
        case 3:
            st.display(arr);
            break;
        default:
            System.out.println("Enter the valid choice");
            
       }
    }
}
class stack_value{
    int top = -1;
    void push(int size){
        int[] arr =new int[size];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input number : ");
        int input = sc.nextInt();
        if(top==size-1){
            System.out.println("stack is full");
        }else{
             top += 1;
             arr[top] = input;
        }  
    }
    void pop(){

    }
    void display(int[] arr){
         if (top == -1) {
            System.out.println("stack is an empty");
         }else{
            for (int i = 0; i <= top; i++){
                System.out.print(arr[i] + " ");
            }
         }
    }