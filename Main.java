import java.util.Scanner;
public class Main {
    public static void main(String[] args) {



                int fat;double size,bodyMass;

                Scanner inp=new Scanner(System.in);

                System.out.println("Lütfen boyunuzu(metre cinsinden) giriniz:");
                size=inp.nextDouble();
                System.out.println("Lütfen kilonuzu giriniz:");
                fat=inp.nextInt();

                bodyMass=(fat/(size*size));

                System.out.print("Vücut Kitle İndeksiniz :" + bodyMass);


            }
        }

