package webElementsExcercise;

public class RandomString {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String character = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int length = 10;
        for (int i =0; i < length; i++){
            int index = (int) (Math.random() * character.length());
            sb.append(character.charAt(index));

        }
        System.out.println(sb);
    }
}
