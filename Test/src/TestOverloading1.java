class TestOverloading1{  
public static void main(String[] args){  
System.out.println(add(11,11));  
System.out.println(add(11,11,11));  
main(10);
}
public static void main(int c ){  
System.out.println(add(11,11));  
System.out.println(add(11,11,11));  
}
static int add(int a,float b){
return (int) (a+b);
}  
static float add(int a,int b,float c){
return a+b+c;
}  

static int add(int a,int b,int c){
return a+b+c;
}   
}  
