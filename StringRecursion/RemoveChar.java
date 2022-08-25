package StringRecursion;

public class RemoveChar {

    // Remove the repeated charater and print the remaining string

    // Time Complexity - Length of the String
    public static void main(String[] args) {

        System.out.println(removeParticularChar("bssappdb"));
    }

    static void removeChar(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        if (ch == 'a') {
            removeChar(p, up.substring(1));
        } else {
            removeChar(p + ch, up.substring(1));
        }
    }

    static String removeCh(String up) {
        if (up.isEmpty()) {
            return " ";
        }

        char ch = up.charAt(0);

        if (ch == 'a') {
            return removeCh(up.substring(1));
        } else {
            return ch + removeCh(up.substring(1));
        }
    }

    static String removeParticular(String up) {
        if (up.isEmpty()) {
            return " ";
        }

        // char ch = up.charAt(0);

        if (up.startsWith("apple")) {
            return removeCh(up.substring(5));
        } else {
            return up.charAt(0) + removeParticular(up.substring(1));
        }
    }

    static String removeParticularChar(String up) {
        if (up.isEmpty()) {
            return " ";
        }

        // char ch = up.charAt(0);

        if (up.startsWith("app") && !up.startsWith("apple")) {
            return removeCh(up.substring(3));
        } else {
            return up.charAt(0) + removeParticularChar(up.substring(1));
        }
    }
}
