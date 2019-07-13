package forceproxy;

public class GamePlayer implements IGamePlayer {
    private String name;
    private IGamePlayer playerProxy;
    public GamePlayer(String name){
        this.name = name;
    }
    @Override
    public void login() {
        if(isProxy()){
            System.out.println(this.name+"登录...");
        }else{
            System.out.println("请使用指定代理访问...");
        }
    }

    @Override
    public void killBoss() {
        if(isProxy()){
            System.out.println(this.name+"打怪...");
        }else{
            System.out.println("请使用指定代理访问...");
        }
    }

    @Override
    public void upgrade() {
        if(isProxy()){
            System.out.println(this.name+"升级...");
        }else{
            System.out.println("请使用指定代理访问...");
        }
    }

    @Override
    public IGamePlayer getGameProxy() {
        this.playerProxy = new GamePlayerProxy(this);
        return this.playerProxy;
    }

    private boolean isProxy(){
        if(this.playerProxy == null){
            return false;
        }else{
            return true;
        }
    }
}
