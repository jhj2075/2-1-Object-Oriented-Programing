package java_3;

public class ArgsAdd_3_12 {
    public static void main(String[] args) {
        int sum = 0;

            for (int i = 0; i < args.length; i++) {
                try {
                    int j = Integer.parseInt(args[i]);
                    sum += j;
                }
                catch (NumberFormatException e){
                    continue;
                }
            }
        System.out.println(sum);
    }
}
