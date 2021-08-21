//@FunctionalInterface
interface Drawable{  
    public void draw(); 
    @Override
    boolean equals(Object var1);
//    public void draw1();  only one abstract method in functional interface
}  
//lamda expression is implementation of functional interface
public class LambdaExpressionExample {  
    public static void main(String[] args) {  
        int width=10;  
  
        //without lambda, Drawable implementation using anonymous class  
        Drawable d=new Drawable(){  
            public void draw(){System.out.println("Drawing "+width);}  
        };  
        d.draw();  
    }  
}  