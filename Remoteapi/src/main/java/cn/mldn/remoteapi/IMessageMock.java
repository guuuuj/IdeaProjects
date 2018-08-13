package cn.mldn.remoteapi;

/**
 * @Description:
 * @Author: Gj
 * @system name:
 * @copyright：（）
 * @Date: Created in  2018-08-13
 */
public class IMessageMock implements IMessage{

    public String echo(String msg) {
        return "nothing";
    }
}
