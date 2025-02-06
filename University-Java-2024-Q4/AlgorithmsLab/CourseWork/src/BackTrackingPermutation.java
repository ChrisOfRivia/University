public class BackTrackingPermutation {

    private static void permute(String str, String result) {
        if (str.isEmpty()) {
            System.out.println(result);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char chosen = str.charAt(i);
            String remaining = str.substring(0, i) + str.substring(i + 1);
            permute(remaining, result + chosen);
        }
    }

    public static void main(String[] args) {
        String input = "Ivialo";
        System.out.println("Permutations of " + input + ":");
        permute(input, "");
    }
}
