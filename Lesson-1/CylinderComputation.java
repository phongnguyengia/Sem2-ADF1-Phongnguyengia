public class CylinderComputation {
    public static void main(String[] args){

        double radius, height, surfaceArea, baseArea, volume;
        radius = 4;
        height = 6;
        final double PI = 3.14;
        surfaceArea =  2 * PI * radius * height;
        baseArea =  PI * radius * radius;
        volume = PI * radius * radius * height;
        System.out.print("The surfaceArea is ");
        System.out.println(surfaceArea);
        System.out.print("The baseArea is ");
        System.out.println(baseArea);
        System.out.print("The volume is ");
        System.out.println(volume);

    }
}
