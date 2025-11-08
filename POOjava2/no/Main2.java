
class no {
    int value;
    no(int value) {
        this.value = value;
    }
}

public class Main2 {
    public static void main (String[] args) {
        no numero = new no(100000);
        System.out.println(numero.value);
    }
}

