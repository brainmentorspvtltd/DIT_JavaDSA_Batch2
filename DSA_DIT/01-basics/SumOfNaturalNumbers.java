class Sum {
    void approach_1(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            sum += i;
            // sum = sum + i;
        }
        System.out.println("Sum is : " + sum);
    }

    void approach_2(int n) {
        // Math formula for sum of n natural number...
        int sum = n * (n + 1) / 2;
        System.out.println(sum);
    }

    void approach_3(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                sum++;
            }
        }
        System.out.println(sum);
    }

}