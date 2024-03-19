final class CheckStatic {
    static int fees() {
        int var = 10;
        var = var++; // assign first then increment
        var = var--;//
        var = ++var;
        var = --var;
        System.out.println(var);
        return 100;
    }
}