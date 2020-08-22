/* Please, do not rename it */
class Problem {

    public static void main(String[] args) {
        String operator = args[0];
        // write your code here
        if (args[0].equals("MAX")) {
            int max = 0;
            for (int i = 1; i < args.length; i++) {
                if (Integer.parseInt(args[i]) >= max) {
                    max = Integer.parseInt(args[i]);
                }
            }
            System.out.println(max);
        } else if (args[0].equals("MIN")) {
            int min = Integer.parseInt(args[1]);
            for (int i = 1; i < args.length; i++) {
                if (Integer.parseInt(args[i]) <= min) {
                    min = Integer.parseInt(args[i]);
                }
            }
            System.out.println(min);
        } else {
            int sum = 0;
            for (int i = 1; i < args.length; i++) {
                sum += Integer.parseInt(args[i]);
            }
            System.out.println(sum);
        }
    }
}