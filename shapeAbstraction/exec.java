package shapeAbstraction;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class exec {
    public static void main(String[] args){
        
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of shapes:");
        int numberShapes = sc.nextInt();
        List<Shape> formatShape = new ArrayList<>();

        for(int i =0; i < numberShapes;i++ ){
            System.out.println("Shape #"+(i+1)+" data");
            System.out.print("Rectangle or Circle (r/c)?");
            char shape = sc.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED):");
            Color color = Color.valueOf(sc.next());
            
            if(shape == 'r'){
                System.out.print("Width:");
                Double width = sc.nextDouble();
                
                System.out.print("Height:");
                Double height = sc.nextDouble();
                Shape rectangle = new Rectangle(color, width,height);
                formatShape.add(rectangle);
            }
            else{
                System.out.print("Radius:");
                Double radius = sc.nextDouble();
                Shape circle = new Circle(color, radius);
                formatShape.add(circle);

            }

            System.out.println("Shape areas:");
            for(Shape shapeRC: formatShape){
                System.out.println(shapeRC.area());
                
            }

        }
        

        sc.close();
    }
    
}
