/*
* 责任链模式：使多个对象都有机会处理请求，从而避免了请求的发送者和接受者之间的耦合的关系。
* 将这些对象连成一条链，并沿着这条链传递该请求，直到有对象处理它为止。
* */
public class Main {
    public static void main(String[] args){
        Request request = new Request();
        request.setLevel(Level.THREE);
        new Client().echoRequest(request);
    }
}
