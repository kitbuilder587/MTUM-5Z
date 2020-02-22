public class Frac {
    int a;
    int b;
    public Frac(){
    }
    public Frac(int a, int b){
        this.a = a;
        this.b = b;
    }
    public static Frac min(Frac a, Frac b){
        if(a.a * b.b < a.b * b.a){
            return a;
        }else if(a.a * b.b == a.b * b.a){
            return b;
        }else{
            return a;
        }
    }

}
