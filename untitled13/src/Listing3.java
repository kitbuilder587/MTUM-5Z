public class Listing3 {
    public static void main(String[] args) {
        Frac max = new Frac();
        Frac out = new Frac();
        max.a = 1;
        max.b = 1;
        out.a = 1;
        out.b = 1;
        for(int q = 1;q<100;q++){
            Frac res = new Frac();
            int p = 0;
            if(4.0f*q/7 - Math.ceil(4.0*q/7) == 0){
                p = 3*q/7+1;
            }else{
                p = (int) Math.ceil(4.0*q/7);
            }
            res.a = 7*p - 4*q;
            res.b = 7*q;
            System.out.println(p + "/" + q);
            if( Frac.min(res,max) == res){
                out = new Frac(p,q);
                max = res;
            }

        }
        System.out.println("Res: " +out.a + "/" +out.b);
        max = new Frac();
        out = new Frac();
        max.a = 1;
        max.b = 1;
        out.a = 1;
        out.b = 1;
        for(int q = 1;q<100;q++){
            Frac res = new Frac();
            int p = 0;
            if(4.0f*q/7 - Math.floor(4.0*q/7) == 0){
                p = 4*q/7+1;
            }else{
                p = (int) Math.floor(4.0*q/7);
            }
            res.a = -7*p + 3*q;
            res.b = 7*q;
            System.out.println(p + "/" + q);
            if( Frac.min(res,max) == res){
                out = new Frac(p,q);
                max = res;
            }

        }
        System.out.println("Res: " +out.a + "/" +out.b);
    }
}
