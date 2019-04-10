class Main {

	public static void main(String[] args) {
		multiplication();
		prime(100);
	}

	static void multiplication () {
		for (int x = 1; x <= 10; x++) {
			for (int y = 1; y <= 10; y++) {
				System.out.println(x + " * " + y + " = " + x*y);
			}
		}
	}

	static void prime(int input) {
		for (int i = 2; i <= input; i++) {
			boolean isPrime = true;
			for (int j = 2; j < i && isPrime; j++) {
				if ((i % j) == 0) {
					isPrime = false;
				}
			}
			if (isPrime) {
				System.out.println(i + " ist eine Primzahl!");
			}
		}
	}



}