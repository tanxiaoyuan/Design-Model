import java.util.ArrayList;
import java.util.List;

/*
* 开闭原则：对扩展开发，对修改关闭。
* */
public class Main {

    public static void main(String[] args){
        List<IBook> bookList = new ArrayList<>();
        bookList.add(new OffNovelBook("天龙八部","金庸",4000));
        bookList.add(new OffNovelBook("神雕侠侣","金庸",3000));
        for(IBook book: bookList){
            System.out.println("书籍名称:"+book.getName()+" 作者:"+book.getAuthor()+" 价格:"+book.getPrice()
            );
        }
    }
}
