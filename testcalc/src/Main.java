import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println(calc(" "));
    }
    public static String calc(String input) {
        Scanner calculation = new Scanner(System.in);
        System.out.println("Введите выражение:");
        String str1 = calculation.nextLine();
        String[] massiv = str1.split(" ");
        if (massiv.length>3) {
            System.out.println("throws Exception //т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
            System.exit(1);
        }
        if (massiv.length<3) {
            System.out.println("throws Exception //т.к. строка не является математической операцией");
            System.exit(1);
        }
        int y = 0;
        int z = 0;
        boolean g = true;
        boolean m = true;
        try {
            switch (massiv[0]) {
                case "I":
                    y = Roman.valueOf(massiv[0]).ordinal();
                    g = false;
                    break;
                case "II":
                    y = Roman.valueOf(massiv[0]).ordinal();
                    g = false;
                    break;
                case "III":
                    y = Roman.valueOf(massiv[0]).ordinal();
                    g = false;
                    break;
                case "IV":
                    y = Roman.valueOf(massiv[0]).ordinal();
                    g = false;
                    break;
                case "V":
                    y = Roman.valueOf(massiv[0]).ordinal();
                    g = false;
                    break;
                case "VI":
                    y = Roman.valueOf(massiv[0]).ordinal();
                    g = false;
                    break;
                case "VII":
                    y = Roman.valueOf(massiv[0]).ordinal();
                    g = false;
                    break;
                case "VIII":
                    y = Roman.valueOf(massiv[0]).ordinal();
                    g = false;
                    break;
                case "IX":
                    y = Roman.valueOf(massiv[0]).ordinal();
                    g = false;
                    break;
                case "X":
                    y = Roman.valueOf(massiv[0]).ordinal();
                    g = false;
                default:
                    y = Integer.parseInt(massiv[0]);
                    g = true;
                    if (y<1 || y>10) {
                        System.out.println("throws Exception //т.к. нужно ввести число от 1 до 10");
                        System.exit(1);
                    }
            }
            switch (massiv[2]) {
                case "I":
                    z = Roman.valueOf(massiv[2]).ordinal();
                    m = false;
                    break;
                case "II":
                    z = Roman.valueOf(massiv[2]).ordinal();
                    m = false;
                    break;
                case "III":
                    z = Roman.valueOf(massiv[2]).ordinal();
                    m = false;
                    break;
                case "IV":
                    z = Roman.valueOf(massiv[2]).ordinal();
                    m = false;
                    break;
                case "V":
                    z = Roman.valueOf(massiv[2]).ordinal();
                    m = false;
                    break;
                case "VI":
                    z = Roman.valueOf(massiv[2]).ordinal();
                    m = false;
                    break;
                case "VII":
                    z = Roman.valueOf(massiv[2]).ordinal();
                    m = false;
                    break;
                case "VIII":
                    z = Roman.valueOf(massiv[2]).ordinal();
                    m = false;
                    break;
                case "IX":
                    z = Roman.valueOf(massiv[2]).ordinal();
                    m = false;
                    break;
                case "X":
                    z = Roman.valueOf(massiv[2]).ordinal();
                    m = false;
                    break;
                default:
                    z = Integer.parseInt(massiv[2]);
                    m = true;
                    if (z<1 || z>10) {
                        System.out.println("throws Exception //т.к. нужно ввести число от 1 до 10");
                        System.exit(1);
                    }
            }
        } catch (NumberFormatException e) {
            System.out.println("throws Exception //т.к. нужно ввести число от 1 до 10");
            System.exit(1);
        }
        if (g != m) {
            System.out.println("throws Exception //т.к. используются одновременно разные системы счисления");
            System.exit(1);
        }
        String sign = massiv [1];
        int x = 0;
        switch (sign){
            case "+":
                x = y+z;
                break;
            case "-":
                x = y-z;
                break;
            case "*":
                x = y*z;
                break;
            case "/":
                x = y/z;
                break;
        }
        if (g == false && x<1) {
            System.out.println("throws Exception //т.к. в римской системе нет отрицательных чисел и числа ноль");
            System.exit(1);
        }
        if (g == false) {
            String str = Roman.values()[x]+"";
            return str;
        } else {
            String ok = x+"";
            return ok;
        }
    }
}
