package exp2a;

public class stringoperations {

	public static void main(String[] args) {
		// 1. String Creation and Basic Operations
        String str1 = "Apple";
        String str2 = new String("Banana");
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        // 2. Length and Character Access
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Character at index 2: " + str1.charAt(2));

        // 3. String Comparison
        String str3 = "apple";
        System.out.println("Equals: " + str1.equals(str3));
        System.out.println("Equals Ignore Case: " + str1.equalsIgnoreCase(str3));

        // 4. String Searching
        String sentence = "Java Programming Language";
        System.out.println("Index of 'Programming': " + sentence.indexOf("Programming"));
        System.out.println("Contains 'Java': " + sentence.contains("Java"));

        // 5. Substring Operations
        System.out.println("Substring (0-4): " + sentence.substring(0, 4));

        // 6. String Modification
        String modified = sentence.replace("Java", "Python");
        System.out.println("After replace: " + modified);
        System.out.println("Uppercase: " + sentence.toUpperCase());
        System.out.println("Lowercase: " + sentence.toLowerCase());

        // 7. Whitespace Handling
        String str4 = "   Hello World   ";
        System.out.println("Before trim: '" + str4 + "'");
        System.out.println("After trim: '" + str4.trim() + "'");

        // 8. String Concatenation
        String concat = str1 + " " + str2;
        System.out.println("Concatenation using +: " + concat);
        System.out.println("Concatenation using concat(): " + str1.concat(str2));

        // 9. String Splitting
        String fruits = "Apple,Banana,Orange";
        String[] arr = fruits.split(",");
        System.out.println("After splitting:");
        for (String f : arr) {
            System.out.println(f);
        }

        // 10. StringBuilder Demo
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        sb.insert(5, " Java");
        sb.replace(0, 5, "Hi");
        System.out.println("StringBuilder result: " + sb);

        // 11. String Formatting
        String name = "John";
        int age = 20;
        String formatted = String.format("Name: %s, Age: %d", name, age);
        System.out.println("Formatted String: " + formatted);

        // 12. Validate Email
        String email = "example@gmail.com";

        if (email.contains("@") && email.startsWith("example") && email.endsWith(".com")) {
            System.out.println("Valid Email");
        } else {
            System.out.println("Invalid Email");
        }
    }
}