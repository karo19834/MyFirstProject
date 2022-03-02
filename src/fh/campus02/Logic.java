package fh.campus02;

public class Logic {
    public static void main(String[] args) {
        boolean sunny=true;
        boolean raining=false;
        //logische operatoren
        System.out.println( sunny && raining);
        boolean conf=true;
        boolean exa=false;
        System.out.println( conf || exa);
        boolean part1 = 1>3 && !(3-1<5) ;
        boolean part2 = 2 == 4*4;
        System.out.println( part1 || part2);
        boolean partOne= 6 >= 2*3 || 2-3 <0;
        boolean partTwo =1*1 == 1 && 1 !=1+1;
        boolean result = partOne && partTwo;
        System.out.println(result);

    }
}
