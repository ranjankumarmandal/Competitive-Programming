//Capitalise first letter of every word

class Capitalise {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String captStr = capitalise(str);
        System.out.println(captStr);
    }

    // TODO: Implement this method
    static String capitalise(String str) {
        StringBuffer s = new StringBuffer();
 
        char ch = ' ';
        for (int i = 0; i < str.length(); i++) {
             
            if (ch == ' ' && str.charAt(i) != ' ')
                s.append(Character.toUpperCase(str.charAt(i)));
            else
                s.append(str.charAt(i));
            ch = str.charAt(i);
        }
 
        return s.toString().trim();
    }
}
