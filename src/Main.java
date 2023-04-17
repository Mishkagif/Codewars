public class Main {
    public static void main(String[] args) {

        class SecondOcurrence {
            public static int secondSymbol(String str, char c) {
                //DO YOUR MAGIC!!

                return str.indexOf (c,str.indexOf(c)+1);
            }
        }

    }

}
