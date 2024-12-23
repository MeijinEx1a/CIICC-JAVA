public class Tasksheet113 {
    public static void main(String[] args) {
        int check_number=10;
        String message;
    
        while (check_number!=0){
            System.out.println((message = (check_number%2==0) ? check_number+" is even number" : check_number+" is odd number"));
            check_number--;
        }
    }
}
