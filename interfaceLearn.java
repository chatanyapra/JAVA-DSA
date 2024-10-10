import java.util.Scanner;

interface name {
    void nm();
}

interface salary extends name {
    void sal();
}

class popNew implements salary {
    String name;
    int salary;
    Scanner sc = new Scanner(System.in);

    @Override
    public void nm() {
        System.out.println("Enter your name-- ");
        name = sc.nextLine();
    }

    @Override
    public void sal() {
        System.out.println("Enter your salary-- ");
        salary = sc.nextInt();
    }

    public void print() {
        System.out.println("Your name is- " + name);
        System.out.println(name + " is earning " + salary + "/mon");
    }
}

class interfaceLearn {
    public static void main(String[] args) {
        popNew nw = new popNew();
        nw.nm();
        nw.sal();
        nw.print();
    }
}