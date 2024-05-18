public class string_methods {
    public static void main(String[] args) {
        String a = "Purple"; //simple method
        String b = new String("blue"); // is method mein string ka ek object hota hai just like scanner
        System.out.println(a);
        System.out.println(b);

        // length method
        int c = a.length();
        System.out.println(c);

        //toLowerCase method                           //strings are immutable, yahan changes karne pr vo new strings
        String d = a.toLowerCase();                    //bankar print ho rhi hain, the original string is still the same
        System.out.println(d);

        //toUpperCase method
        String e = b.toUpperCase();
        System.out.println(e);

        //trim method
        String nonTrimmedString = "    AANA    ";
        System.out.println(nonTrimmedString);
        //one way of using the method
        String trimmedString = nonTrimmedString.trim();
        System.out.println(trimmedString);
        //another way of using the method
        System.out.println(nonTrimmedString.trim());

        //substring method
        System.out.println(d.substring(3));           //substring(0) likhne pr poori string print kr deta hai
        System.out.println(d.substring(3,5));                   //usse better string he call kr wao (avoid redundancy)

        //replace method
        System.out.println(e.replace("U", "O"));
        System.out.println(e.replace('U','y'));      //remember -> java is case sensitive
        System.out.println(d.replace("ple","ble")); //har occurrence ko change karega

        //startsWith endsWith method
        System.out.println(d.startsWith("pur"));
        System.out.println(d.endsWith("le"));

        //charAt method
        System.out.println(e.charAt(3));                //returns character at index number

        //indexOf method
        System.out.println(d.indexOf("ple"));               //first occurrence of given character/string
        String f = "popopop";
        System.out.println(f.indexOf("pop",3));     //it will start searching from given index
        System.out.println(f.indexOf("of"));                     //it will return -1 if no match is found

        //lastIndexOf method
        System.out.println(f.lastIndexOf("p"));               //indexing aage se he aur us index se search bhi aage se
        System.out.println(f.lastIndexOf("p",3));

        //equals method
        System.out.println(f.equals("popopop"));

        //equalsIgnoreCase
        System.out.println(f.equalsIgnoreCase("PoPoPoP"));



    }
}
