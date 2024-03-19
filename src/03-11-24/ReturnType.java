import java.util.Scanner;

class ReturnType {
    //setters are generally void
    private String name;

    void setName(String name) {
        this.name = name;
        //  System.out.println("this is show method and name is\t"+name);
    }

    String getName() {
        return this.name;
    }

    void showTable() {
//        //2 * 1 = 2
//        int var = 2;
//        for (int i = 1; i <= 10; i++)
//            System.out.println(var + " * " + i + " = " + var * i);
        String word = "australia";
        int i, flag = 0;
        String input, guess;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("\nEnter Your Guess: ");
            input = sc.nextLine();
            for (i = 0; i < word.length(); i++) {
                if (word.charAt(i) == input.charAt(0)) {
                    flag = 1;
                }
            }
            if (flag == 1) {
                System.out.println("This letter is present in the word");
            } else {
                System.out.println("This letter is not present in the word");
            }
            System.out.println("Do want to guess again(y/n):");
            guess = sc.nextLine();
            flag = 0;
        } while (guess.equals("y") || guess.equals("Y"));
    }

    public static void main(String[] args) {
        //ReturnType - name of class
        //returnType - instance
        //new - using for assigning a new memory
        //ReturnType - its a constructor
        ReturnType returnType = new ReturnType();
        returnType.setName("Rahul Singh");
        System.out.println(returnType.getName());
        returnType.showTable();
        final int value = 199;
        System.out.println(CheckStatic.fees());
    }
}