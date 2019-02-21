

import com.caisl.bridge.*;

/**
 * BridgeTest
 *
 * @author caisl
 * @since 2017-05-03
 */
public class BridgeTest {
    public static void main(String args[]){
        Bridge bridge = new MyBridge();

        Sourceable source1 = new SourceSub1();
        bridge.setSource(source1);
        bridge.method();

        Sourceable source2 = new SourceSub2();
        bridge.setSource(source2);
        bridge.method();
    }
}
