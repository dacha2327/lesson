public class Main {
    public static void main(String[] args){
        generateRandomAge(45);


    }
    public static int generateRandomAge(int start){
        int a = 0;

        int b = 100;

        int end = a + (int) (Math.random() * ((b - a) + 1));

        if (end < 65) {
            System.out.println("You can go for a walk because your age:" + end);

        } else if (end < 6) {
            System.out.println("You can't go for a walk because your age:" + end);

        } else if (end > 65) {
            System.out.println("You can't go for a walk because your age:" + end);
        }
        return end;

    }
}

