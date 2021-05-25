public class TestStringBuffer {
    public static void main(String[] args) throws Exception {
        long start = System.currentTimeMillis();
        String txt = "";
        for (int i = 0; i < 90000; i++) {
            txt += i;
        }
        long end = System.currentTimeMillis();
        long diff = end - start;
        System.out.printf("Sem StringBuffer: Demorou %d millisegundos!", diff);
        

        long inicio = System.currentTimeMillis();
        StringBuffer texto = new StringBuffer();
        for (int i = 0; i < 90000; i++) {
            texto.append(i);
        }
        long fim = System.currentTimeMillis();
        long dif = fim - inicio;
        System.out.printf("\n\nCom StringBuffer: Demorou %d millisegundos!", dif);
    }
}