
class  c16 {
    public static void main(String[] args) {

        // 1️⃣ Split Example
        String str = "hello java cpp";
        String arr[] = str.split(" ");

        for (String s : arr) {
            System.out.println(s);
        }

        System.out.println("----------------");

        // 2️⃣ Palindrome Example
        String a = "abc";
        String rev = "";

        for (int i = a.length() - 1; i >= 0; i--) {
            rev += a.charAt(i);
        }

        if (a.equals(rev)) {
            System.out.println("ji haii (Palindrome)");
        } else {
            System.out.println("nhi hai (Not Palindrome)");
        }

        System.out.println("----------------");

        // 3️⃣ == vs equals()
        String s1 = new String("hello");
        String s2 = new String("hello");

        System.out.println(s1 == s2);        // false (different objects)
        System.out.println(s1.equals(s2));   // true (same content)

        System.out.println("----------------");

        // 4️⃣ trim() + equals()
        String s3 = "hello java";
        String s4 = "   hello java   ";

        System.out.println(s3 == s4);             // false
        System.out.println(s3.equals(s4));        // false
        System.out.println(s3.equals(s4.trim())); // true

        System.out.println("----------------");

        // 5️⃣ String Methods
        System.out.println(s3.length());        // length()
        System.out.println(s3.charAt(1));       // charAt()
        System.out.println(s3.toUpperCase());   // toUpperCase()
        System.out.println(s3.indexOf("z"));    // indexOf()
        System.out.println(s3.substring(2));    // substring()
        System.out.println(s3.substring(1, 3)); // substring(start, end)
        System.out.println(s3.trim());          // trim()

        // 6️⃣ split() (correct way to print array)
        String words[] = s3.split(" ");
        for (String w : words) {
            System.out.println(w);
        }

        System.out.println("----------------");

        // 7️⃣ Check vowel or not
        char c = 'i';
        System.out.println("Is vowel: " + "aeiouAEIOU".contains(c + ""));
    }
}
