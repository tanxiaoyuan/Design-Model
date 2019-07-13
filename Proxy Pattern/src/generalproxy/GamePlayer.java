package generalproxy;

public class GamePlayer implements IGamePlayer {
    private String name;
    public GamePlayer(IGamePlayer gamePlayerProxy, String name) throws Exception {
        if(gamePlayerProxy == null){
             throw new Exception("不能创建真实角色");
        }else{
            this.name = name;
        }

    }
    @Override
    public void login() {
        System.out.println(this.name+"登录...");
    }

    @Override
    public void killBoss() {
        System.out.println(this.name+"打怪...");
    }

    @Override
    public void upgrade() {
        System.out.println(this.name+"升级...");
    }
}
