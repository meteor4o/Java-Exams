package com.company;

import java.util.Scanner;

public class StringManipulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        StringBuilder sb = new StringBuilder();

        while (!input.equals("End")) {
            String[] tokens = input.split(" ");
            String key = tokens[0];
            switch (key) {
                case "Add":
                    sb.append(tokens[1]);
                    break;

                case "Upgrade":
                    char c = tokens[1].charAt(0);
                    if (sb.indexOf(String.valueOf(c)) > -1)
                        for (int i = 0; i < sb.length(); i++) {
                            if (sb.charAt(i) == c) {
                                char newChar  = (char)(c + 1);
                                sb.setCharAt(i, newChar);
                            }
                        }
                    break;

                case "Print":
                    System.out.println(sb);
                    break;

                case "Index":
                    char d = tokens[1].charAt(0);
                    if (sb.indexOf(String.valueOf(d)) > -1) {
                        for (int i = 0; i < sb.length(); i++) {
                            if (sb.charAt(i) == d) {
                                System.out.print(i + " ");

                            }
                        }
                        System.out.println();
                    } else {
                        System.out.println("None");
                    }
                    break;
                case "Remove":
                    String removed = tokens[1];
                    String text = sb.toString();
                    int index = text.indexOf(removed);

                    while (index != -1) {
                        text = text.replace(removed, "");
                        index = text.indexOf(removed);
                    }
                    sb.setLength(0);
                    sb.append(text);
                    break;
            }

            input = sc.nextLine();
        }
    }
}
