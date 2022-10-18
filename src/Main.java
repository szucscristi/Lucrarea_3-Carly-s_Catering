// Lucrarea 3 - Carly's Catering
import java.util.Scanner;
import javax.swing.*;

public class Main {
    
    //the name of the global variable should be INVITATI
    
    static int invitati; // variabila globala
    public static void main(String[] args)
    {
        //int invitati;
        chenar();
        invitati=invitati();
        System.out.print("Invitati: "+invitati+"\n");
        rezultate();
    }
    public static int invitati() // prima instructiune
    {
        int NrInvitati; //please use camel case
        Scanner inputDevice = new Scanner(System.in);
        System.out.print("Introduceti numarul invitatilor: ");
        NrInvitati=inputDevice.nextInt();
        inputDevice.nextLine();// not necessary
        //inputDevice.close();
        return NrInvitati;
    }
    public static void chenar() // a doua instructiune
    {
        JFrame frame= new JFrame(); // sau fara jframe dar trebuie minimizat intelliJ
        frame.setAlwaysOnTop(true); //
        JOptionPane.showMessageDialog(frame, "Carly’s makes the food that makes it a party."); // sau cu null
    }
    public static void rezultate()
    {
        int nrinvitati,PretTotal;
        nrinvitati=invitati;
        PretTotal=35*nrinvitati;
        if(nrinvitati>=50)
            System.out.print("Evenimentul este unul mare\n" +"Pretul total: "+PretTotal+" lei");
        else
            System.out.print("Evenimentul este unul mic\n"+"Pretul total: "+PretTotal+"lei");
    }
}
