/*
* 组合模式：将对象组合成树型结构以表示“部分—整体”的层次结构，
* 使得用户对单个对象和组合对象的使用具有一致性。
* */
public class Main {
    public static void main(String[] args){
        Composite root = new Composite();
        Composite branch = new Composite();
        root.add(branch);
        Leaf leaf = new Leaf();
        branch.add(leaf);
        disPlay(root);
    }

    public static void disPlay(Composite root){
        for(Component c:root.getChildren()){
            if(c instanceof Leaf){
                c.doSomething();
            }else{
                disPlay((Composite) c);
            }
        }
    }

}
