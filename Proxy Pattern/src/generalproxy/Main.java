package generalproxy;
/*
* 普通代理：客户端只能访问代理角色，不能访问真实角色。在该模式下，
* 调用者不用知道真实的角色是谁，屏蔽了真实角色的变更对高层的影响。
* */
public class Main {
    public static void main(String[] args){
        IGamePlayer gamePlayer = new GamePlayerProxy("张三");
        gamePlayer.login();
        gamePlayer.killBoss();
        gamePlayer.upgrade();
    }
}
