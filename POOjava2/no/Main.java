class no {
    int value;
    no(int value) {
        this.value = value;
    }
}

public class Main {
    public static void main (String[] args) {
        no numero = new no(40);
        System.out.println(numero.value);
    }
}