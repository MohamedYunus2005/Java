public class returnname {
    String getname(String a) {
        return "Yunus";
    }

    public static void main(String[] args) {
        returnname obj1 = new returnname();
        String name = obj1.getname(null);
        System.out.println(name);
    }
}
