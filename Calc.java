public class Calc {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.err.println("Usage: java Calc <add|mult|max|min> <numbers> ");
            return;
        }

        String command = args[0];
        boolean add = command.equals("add");
        boolean mult = command.equals("mult");
        boolean max = command.equals("max");
        boolean min = command.equals("min");

        if (!add && !mult && !max && !min) {
            System.err.println("Unknown operation: " + command);
            return;
        }

        long result = 0;
        if (mult)
            result = 1;
        else if (max)
            result = Integer.MIN_VALUE;
        else if (min)
            result = Integer.MAX_VALUE;

        for (int i = 1; i < args.length; i++) {
            int num = Integer.parseInt(args[i]);
            if (add)
                result += num;
            else if (mult)
               result *= num;
            else if (max)
               result = Math.max(result, num);
            else
                result = Math.min(result, num);
        }

        System.out.println(result);
    }
}
