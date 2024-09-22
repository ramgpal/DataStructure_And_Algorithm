class PrintName {
    // Recursive function to print name n times
    public static void printName(int count, int n) {
        if(count > n) {
            return;
        }
        System.out.println("Hi, this is Ram");
        printName(count+1, n);
    }
    public static void main(String[] args) {
        int count = 1;
        printName(count, 5);
    }
}