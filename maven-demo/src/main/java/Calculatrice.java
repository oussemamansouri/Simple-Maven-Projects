public class Calculatrice {
   
        public int Somme (int a, int b) {
        int res = 0;
        try {
        System.out.print("In somme(" + a + ", " + b + ")");
        res = a+ b;
        System.out.print("Out somme() : " + res);
        } catch (Exception e) {System.out.print("Erreur : " + e);}
        return res;
        }
       
        public int division (int a, int b) {
            int res = 0;
            try {
            System.out.print("In division(" + a + ", " + b + ")");
            res = a/b;
            System.out.print("Out division() : " + res);
            } catch (Exception e) {System.out.print("Erreur : " + e);}
            return res;
            }

}