class Operators {

    public static void main(String a[])
    {
        int num1 = 10;
        int num2 = 20;

        int num3 = num1 + num2; 

        num3 /= 2;

        num3++; // num3 = num3 + 1;

        char letter = 'a';
        letter++;
        System.out.println(letter);

        System.out.println(num3);
        System.out.println(num1 + num2 + num3);

        int number1 = 7;
        int number2 = 3;
        int result1 = number1++; //first assigns the value of number1 to result1, then increments number1 by 1 POST-INCREMENT
        int result2 = ++number2; //first increments number2 by 1, then assigns the value of number2 to result2 PRE-INCREMENT
        System.out.println(result1);
        System.out.println(result2);

        int x = 5;
        int y = 10;
        boolean r1 = x > y; // GREATER than --RESULT : false
        boolean r2 = x < y; // LESS than --RESULT : true
        boolean r3 = x == y; // EQUAL to --RESULT : false
        boolean r4 = x != y; // NOT EQUAL to --RESULT : true
        boolean r5 = x >= y; // GREATER than or EQUAL to --RESULT : false
        boolean r6 = x <= y; // LESS than or EQUAL to --RESULT : true
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);
        System.out.println(r6);
    }

}