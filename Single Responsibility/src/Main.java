/*
* Simple Responsibility Principle(SRP)
* 单一职责原则要求一个接口或类只有一个原因引起变化，也就是一个接口或类只有一个职责，
* 他就负责一件事。
* */
public class Main {
    public static void main(String[] args){
        Phone phone = new Phone();
        phone.dial("123456");
        phone.transferData(phone);
        phone.hangUp();
    }
}
