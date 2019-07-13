package forceproxy;
/*
* 强制代理：必须通过真实角色才能查找到代理角色，否则不能访问。
* 只有通过真实角色指定的代理类才可以访问，也就是说由真实角色管理代理角色。
* */
public class Main {
    public static void main(String[] args){
        IGamePlayer gamePlayer = new GamePlayer("张三");
        IGamePlayer gamePlayerProxy = gamePlayer.getGameProxy();
        gamePlayerProxy.login();
        gamePlayerProxy.killBoss();
        gamePlayerProxy.upgrade();
    }
}
