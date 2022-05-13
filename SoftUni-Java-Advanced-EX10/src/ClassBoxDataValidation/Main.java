package box;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        int width=sc.nextInt();
        int height=sc.nextInt();

        Box box=new Box(length,width,height);

        System.out.printf("Surface Area - %.2f%n",box.calculateSurfaceArea());
        System.out.printf("Lateral Surface Area - %.2f%n",box.calculateLateralSurfaceArea());
        System.out.printf("Volume - %.2f",box.calculateVolume());
    }
}
