class Main{
    public static void main(Strings[] args){
        int a=10;
        int b=5;
        System.out.println("===============Guess the answers==============");
        System.out.println("unary opreator:"+ (a++));
        System.out.println("unary operator:"+ (++a));
        System.out.println("Binary operator");
        System.out.println("1+2"+1+2);
        System.out.println("1+2"+(1+2));
        System.out.println(1+2+"=3");
        int increment = ++a * b++;
        System.out.println(increment);
        System.out.println("Ternary operator");
        int largestNumber=(a>b)?a:b;
        System.out.println("largest of 2 numbers:" +largestNumber);


    }
}