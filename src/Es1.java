public class Es1 {
    public int moltiplicazione(int n1, int n2) {
        return n1*n2;
    }
    public String concatena(String str1, int n1) {
        return str1+n1;
    }
    public String[] inseriscilnArray(String[] arrayDiStringhe, String word) {
        String[] arrayMappato = new String[6];
        arrayMappato[0] = arrayDiStringhe[0];
        arrayMappato[1] = arrayDiStringhe[1];
        arrayMappato[2] = word;
        arrayMappato[3] = arrayDiStringhe[2];
        arrayMappato[4] = arrayDiStringhe[3];
        arrayMappato[5] = arrayDiStringhe[4];
        return arrayMappato;
    }

}
