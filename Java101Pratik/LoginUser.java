package Java101Pratik;

import java.util.Scanner;

public class LoginUser {
    public static void main(String[] args) {
        String userName, password, passwordRenew, newPassword;
        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız: ");
        userName = input.nextLine();
        System.out.print("Şifreniz: ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş yaptınız");
        } else {
            System.out.println("Bilgileriniz Yanlış !");
            System.out.println("Şifrenizi yenilemek ister misiniz ?(Evet/Hayır)");
            passwordRenew = input.nextLine();
            if (passwordRenew.equals("Evet")) {
                System.out.print("Lütfen yeni şifrenizi giriniz: ");
                newPassword = input.nextLine();
                if (newPassword.equals(password)) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                } else {
                    System.out.println("Şifre oluşturuldu");
                }
            }

        }

    }
}
