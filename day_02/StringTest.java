class StringTest {
    public static void main(String[] args) {
        String s1 = "Hello World!";
        int i1 = 1001;
        String info = s1 + i1 + true;
        System.out.println(info);


        //***************************
        // 练习
        char c = 'a'; // 'a' => 97
        int num = 10;
        String str = "hello";

        System.out.println(c + num + str); // 107hello
        System.out.println(c + str + num); // ahello10
        System.out.println(c + (num + str)); // a10hello
        System.out.println((c + num) + str); // 107hello
        System.out.println(str + c + num); // helloa10
    }
}