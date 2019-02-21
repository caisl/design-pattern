
package builder;

import com.caisl.builder.Toy;

import java.util.ArrayList;

/**
 * BuilderTest
 *
 * @author caisl
 * @since 2017-04-27
 */
public class BuilderTest {
    public static void main(String[] hh) {
        ArrayList hands = new ArrayList<String>();
        hands.add("left");
        hands.add("right");
        ArrayList legs = new ArrayList<String>();
        legs.add("left");
        legs.add("right");
        Toy toy = new Toy.Builder().setBody("body").setHands(hands).setLegs(legs).setHead("head").build();
        System.out.println(toy.toString());
    }
}
