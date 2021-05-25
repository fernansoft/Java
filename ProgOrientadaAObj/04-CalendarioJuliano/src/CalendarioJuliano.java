import javax.swing.JOptionPane;

public class CalendarioJuliano {
    public static void main(String[] args) throws Exception {
        long day, month, year;
        day = Long.parseLong(JOptionPane.showInputDialog(null, "Informe o dia da data desejada:"));
        month = Long.parseLong(JOptionPane.showInputDialog(null, "Informe o mes da data desejada:"));
        year = Long.parseLong(JOptionPane.showInputDialog(null, "Informe o ano da data desejada:"));
        JOptionPane.showMessageDialog(null, "O resultado em data juliana para a data informada é: \n"+ calcCalendarioJuliano(day, month, year));
    }

    public static long calcCalendarioJuliano(long dia, long mes, long ano){
        long resultado = (long)(1461*(ano+4800+(mes-14)/12))/4+(367*(mes-2-12 *
        ((mes-14)/12)))/12-(3*((ano+4900+(mes-14)/12)/100))/4+dia-32075;
        return resultado;
    }
}
