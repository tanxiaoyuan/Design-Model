package objectadapter;

import java.util.Map;

public class OuterUserInfo implements IUserInfo{
    IOuterUserHomeInfo outerUserHomeInfo;
    IOuterUserBaseInfo outerUserBaseInfo;
    public OuterUserInfo(IOuterUserHomeInfo outerUserHomeInfo, IOuterUserBaseInfo outerUserBaseInfo){
        this.outerUserBaseInfo = outerUserBaseInfo;
        this.outerUserHomeInfo = outerUserHomeInfo;
    }

    @Override
    public Map getUserInfo() {
        return null;
    }
}
