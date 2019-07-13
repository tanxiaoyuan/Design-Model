import java.util.List;

public class GroupLeader {
    private List<Girl> girlList;
    public GroupLeader(List<Girl> girlList){
        this.girlList = girlList;
    }
    public void countGirls(){
        System.out.println("女生数量是："+girlList.size());
    }
}
