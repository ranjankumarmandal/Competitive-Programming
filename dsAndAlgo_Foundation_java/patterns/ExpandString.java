package dsAndAlgo_Foundation_java.patterns;

public class ExpandString {
	static void printCharSeq(char c, int num) {
		while (num > 1) {
			System.out.print(c);
			num--;
		}
	}

	void convert(String str) {
		char c[] = str.toCharArray();
		for (int i = 0; i < c.length; i++) {
			int val = 0;
			if ((c[i] >= '0' && c[i] <= '9')) {
				// val=c[i]-48;
				try {
					if (c[i + 1] >= '0' && c[i + 1] <= '9') {
						String a1 = String.valueOf(c[i] - 48);
						String a2 = String.valueOf(c[i + 1] - 48);
						val = Integer.parseInt(a1 + a2);
						// System.out.println(val);
						printCharSeq(c[i - 1], val);
						i++;
					} else {
						val = c[i] - 48;
						printCharSeq(c[i - 1], val);
					}
				} catch (ArrayIndexOutOfBoundsException ex) {
					val = c[i] - 48;
					printCharSeq(c[i - 1], val);
				}
			} else {
				System.out.print(c[i]);
				// printCharSeq(c[i], val);
			}
		}
	}
	public static void main(String args[]){
		String expand="a100b0c1d1";
		System.out.println("Given String:"+expand);
		ExpandString egs = new ExpandString();
		egs.convert(expand);
		String a1 = "4", a2 = "5";
		int val = Integer.parseInt(a1 + a2);
		System.out.println(val);
	}

}
