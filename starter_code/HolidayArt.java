import java.util.Random;

/**
 * Holiday ASCII Art Generator
 * 
 * Your task: Create a festive Christmas tree using ASCII characters!
 * 
 * Basic tree structure:
 * * <- Star on top
 * *** <- Tree branches (odd numbers of *)
 * *****
 * *******
 * ||| <- Trunk
 */
public class HolidayArt {

    public static void main(String[] args) {
        int height = 5;
        if (args.length != 0)
        {
            height =Integer.parseInt(args[0]);
        }

        printTree(height);
    }

    /**
     * Prints a Christmas tree with the given height.
     * 
     * @param height Number of branch levels (not including star and trunk)
     */
    public static void printTree(int height) {
        //
        // Steps:
        // 1. Print the star on top (centered)
        // 2. Loop through each level of branches
        // - Calculate spaces needed for centering
        // - Calculate stars needed (1, 3, 5, 7, ...)
        // 3. Print the trunk (centered)
        //
        
        int center = height;
        String tree = " ".repeat(--center) + "+" + "\n";
        Random random = new Random();
        
        for(int i = 1; i < height; i++) {
            tree += " ".repeat(--center);

            int branch = (2 * i) + 1;
            int decor = random.nextInt(4);
            StringBuilder decoratedBranch = new StringBuilder();
            switch (decor) {
                case 0:
                    decoratedBranch.repeat("*", branch);
                    tree += decoratedBranch;
                    break;
                case 1:
                    decoratedBranch.repeat("*", branch);
                    decoratedBranch.replace((branch/2), (branch/2) + 1, "o");
                    tree += decoratedBranch;
                    break;
                case 2:
                    decoratedBranch.repeat("*", branch);
                    decoratedBranch.replace((branch/2) - 1, (branch/2), "o");
                    decoratedBranch.replace((branch/2) + 1, (branch/2) + 2, "o");
                    tree += decoratedBranch;
                    break;
                case 3:
                    decoratedBranch.repeat("*", branch);
                    decoratedBranch.replace(1, 2, "o");
                    decoratedBranch.replace((branch/2), (branch/2) + 1, "o");
                    decoratedBranch.replace(branch - 2, branch -1, "o");
                    tree += decoratedBranch;
                    break;
            }
            
            tree += "\n";
        }

        tree += " ".repeat(height - 2) + "|||" + "\n";

        IO.print(tree);
    }
}
