package forceproxy;

public class GamePlayerProxy implements IGamePlayer {
    private IGamePlayer gamePlayer;
    public GamePlayerProxy(IGamePlayer gamePlayer){
        this.gamePlayer = gamePlayer;
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

    @Override
    public IGamePlayer getGameProxy() {
        return this;
    }
}
