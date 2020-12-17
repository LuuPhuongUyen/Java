/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package js8countword;

/**
 *
 * @author PC
 */
public class Content {

    public void count(String content) {
        if (content == null || content.isEmpty()) {
            System.err.println("Empty!");
        } else {
            String[] words = content.split("\\s");
            int[] w = new int[words.length];
            int[] c = new int[256];
            for (int i = 0; i < words.length; i++) {
                for (String word : words) {
                    if (words[i].equals(word)) {
                        w[i]++;
                    }
                }
            }
            for (int i = 0; i < words.length; i++) {
                for (int j = 0; j < words.length; j++) {
                    if (words[i].equals(words[j])) {
                        if (i != j) {
                            words[i] = "";
                        }
                    }
                }
            }
            for (int i = 0; i < words.length; i++) {
                if (!"".equals(words[i])) {
                    System.out.print(words[i] + "=" + w[i] + "  ");
                }
            }
            char ch[] = new char[content.length()];
            content = content.replaceAll("\\s+", "");
            for (int i = 0; i < content.length(); i++) {
                c[content.charAt(i)]++;
            }
            for (int i = 0; i < content.length(); i++) {
                ch[i] = content.charAt(i);
                int flag = 0;
                for (int j = 0; j <= i; j++) {
                    if ((content.charAt(i) == ch[j])) {
                        flag++;
                    }
                }
                if (flag == 1) {
                    System.out.print(content.charAt(i) + "=" + c[content.charAt(i)] + "  ");
                }
            }
        }
    }
}
