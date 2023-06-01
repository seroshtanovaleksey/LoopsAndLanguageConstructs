public class Main {
    public static void main(String[] args) {
        int n = 15;
        for (int i = 0;i <= n;i++){
            String str = "";
            if(i != 0) {
                if (i % 3 == 0) {
                    str = "fizz";
                }
                if (i % 5 == 0) {
                    str = str + "buzz";
                }
            }
            if(str == ""){
                str = Integer.toString(i);
            }
            System.out.println(str);
        }
    }
}