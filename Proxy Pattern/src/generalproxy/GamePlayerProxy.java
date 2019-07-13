package generalproxy;

public class GamePlayerProxy implements IGamePlayer {

    private IGamePlayer gamePlayer;
    public GamePlayerProxy(String name){
        try {
            gamePlayer = new GamePlayer(this,name);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Override
    public void login() {
        this.gamePlayer.login();
    }

    @Override
    public void killBoss() {
        this.gamePlayer.killBoss();
    }

    @Override
    public void upgrade() {
        this.gamePlayer.upgrade();
    }
}
