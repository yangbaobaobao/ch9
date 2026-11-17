public class Stats {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Usage: java Stats <numbers>");
            return;
        }

        int count = args.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        long sum = 0;

        for (int i = 0; i < count; i++) {
            int num = Integer.parseInt(args[i]);
            sum += number;
            if (num < min)
                min = number;
            if (num > max)
                max = number;
        }

        System.out.println("Count: " + count);
        System.out.println("Sum: " + sum);
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Avg: " + (double)sum/count);
    }
}
