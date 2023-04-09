public class Number {

    String Base16;
    String Base10;
    String Base8;
    String Base2;

    int intBase10;

    public Number(String input, int base){
        if (base == 16)
            this.Base16 = input;
        else if (base == 10)
            this.Base10 = input;
        else if (base == 8)
            this.Base8 = input;
        else if (base == 2)
            this.Base2 = input;
        else
            System.out.println("Wrong base. Number must be in base 2, 8, 10 or 16 ");

        Convert(input, base);

    }
        public void Convert(String input, int base){
        int length = input.length();
        double b = 0;
        if (base == 2)
            for(int i = 0; i < length; i++) {
                char x = input.charAt(i);
                double a = x - '0';
                b = b + a * Math.pow(2, (length - (i+1)));






            }
        String str = Double.toString(b);
        this.Base10 = str;
        this.setIntBase10((int) b);




    }

    public String getBase16() {
        return Base16;
    }

    public void setBase16(String base16) {
        Base16 = base16;
    }

    public String getBase10() {
        return Base10;
    }

    public void setBase10(String base10) {
        Base10 = base10;
    }

    public String getBase8() {
        return Base8;
    }

    public void setBase8(String base8) {
        Base8 = base8;
    }

    public String getBase2() {
        return Base2;
    }

    public void setBase2(String base2) {
        Base2 = base2;
    }

    public int getIntBase10() {
        return intBase10;
    }

    public void setIntBase10(int intBase10) {
        this.intBase10 = intBase10;
    }

    @Override
    public String toString() {
        return "Number{" +
                "Base16='" + Base16 + '\'' +
                ", Base10='" + Base10 + '\'' +
                ", Base8='" + Base8 + '\'' +
                ", Base2='" + Base2 + '\'' +
                ", intBase10=" + intBase10 +
                '}';
    }
}
