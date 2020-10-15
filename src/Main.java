public class Main {
    public static void main(String[] args) {
        Cashback tinkoff=new Cashback();
        int res=tinkoff.calculate(2900_00,'Y','N');
        System.out.println(res+" cashback");
    }
}
