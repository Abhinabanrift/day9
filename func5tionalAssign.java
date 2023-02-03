public class func5tionalAssign {


   
    
    public static void main(String[] args) {
        Func2 f = new Func2();
        System.out.println(f.add(2, 3));
        System.out.println(f.cube(2));
        System.out.println(f.square(2));
        System.out.println(Func.div(6, 2));
        System.out.println(Func.mul(6, 2));

    }
}

@FunctionalInterface
interface Func{
    int cube(int x);
    default int square(int x){
        return x*x;
    }
    default int add(int x,int y){
        return x+y;
    }
    static int sub(int x,int y){
        return x-y;
    }
    static int mul(int x,int y){
        return x*y;
    }
    static double div(double x,int y){
        return x/y;
    }
    
}

class Func2 implements Func {
    @Override
    public int cube(int x){
        return x * x * x;
    }
    
}

