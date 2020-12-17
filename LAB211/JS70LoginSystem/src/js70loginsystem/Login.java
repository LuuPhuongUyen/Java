/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package js70loginsystem;

import java.util.*;

/**
 *
 * @author PC
 */
public class Login {

    private final Scanner in = new Scanner(System.in);

    private final String ACCOUNT_NUMBER_VALID = "^\\d{10}$";
    private final char[] chars = {'1', 'A', 'a', 'B', 'b', 'C',
        'c', '2', 'D', 'd', 'E', 'e', 'F', 'f', '3', 'G', 'g', 'H', 'h',
        'I', 'i', 'J', 'j', 'K', 'k', 'L', 'l', '4', 'M', 'm', 'N', 'n',
        'O', 'o', '5', 'P', 'p', 'Q', 'q', 'R', 'r', 'S', 's', 'T', 't',
        '6', '7', 'U', 'u', 'V', 'v', 'U', 'u', 'W', 'w', '8', 'X', 'x',
        'Y', 'y', 'Z', 'z', '9'};

    public int checkInputIntLimit(int min, int max, Locale language) {
        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine());
                if (result < min || result > max) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException ex) {
                getLanguage(language, "checkInputIntLimit");
                System.out.println();
            }
        }
    }

    public String checkInputString(Locale language) {
        while (true) {
            String result = in.nextLine();
            if (result.length() == 0) {
                getLanguage(language, "checkString");
                System.out.println();
            } else {
                return result;
            }
        }
    }

    public int checkInputAccount(Locale language) {
        while (true) {
            String result = in.nextLine();
            if (result.matches(ACCOUNT_NUMBER_VALID)) {
                return Integer.parseInt(result);
            }
            getLanguage(language, "checkInputAccount");
            System.out.println();
        }
    }

    public String checkInputPassword(Locale language) {
        String result;
        while (true) {
            result = checkInputString(language);
            if (isValidPassword(result, language)) {
                return result;
            }
        }
    }

    public boolean isValidPassword(String password, Locale language) {
        int passLength = password.length();
        if (passLength < 8 || passLength > 31) {
            getLanguage(language, "checkPasswordLength");
            System.out.println();
            return false;
        } else {
            int countDigit = 0;
            int countLetter = 0;
            for (int i = 0; i < passLength - 1; i++) {
                if (Character.isDigit(password.charAt(i))) {
                    countDigit++;
                } else if (Character.isLetter(password.charAt(i))) {
                    countLetter++;
                }
            }
            if (countDigit < 1 || countLetter < 1) {
                getLanguage(language, "checkValidPassword");
                System.out.println();
                return false;
            }
        }
        return true;
    }

    public boolean checkInputCaptcha(String captcha, Locale language) {
        System.out.println(captcha);
        getLanguage(language, "enterCaptcha");
        String captchaInput = checkInputString(language);
        for (int i = 0; i < captchaInput.length(); i++) {
            if (!captcha.contains(Character.toString(captchaInput.charAt(i)))) {
                return false;
            }
        }
        return true;
    }

    public String generateCaptchaText() {
        String captcha = "";
        final int LENGTH = 6;
        StringBuilder sb = new StringBuilder();
        int index = 0;
        for (int i = 0; i < LENGTH; i++) {
            index = (int) (Math.random() * (chars.length - 1));
            sb.append(chars[index]);
        }
        return sb.toString();
    }

    public void getLanguage(Locale curLocate, String key) {
        ResourceBundle rb = ResourceBundle.getBundle("js70loginsystem/" + curLocate, curLocate);
        String value = rb.getString(key);
        System.out.print(value);
    }

    public void login(Locale language) {
        getLanguage(language, "enterAccountNumber");
        int accountNumber = checkInputAccount(language);
        getLanguage(language, "enterPassword");
        String pass = checkInputPassword(language);
        String captcha = generateCaptchaText();
        while (true) {
            if (checkInputCaptcha(captcha, language)) {
                getLanguage(language, "loginSuccess");
                System.out.println();
                return;
            } else {
                getLanguage(language, "IncorrectCaptcha");
                System.out.println();
            }
        }
    }
}
