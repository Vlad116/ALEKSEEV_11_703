package OptimizationOfTheTree;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TreeBalancerTest {
    private TreeBalancer treeBalancer;

    @Before
    public void setUp() {
        treeBalancer = new TreeBalancer();
    }

    @Test
    public void testOnNormalTreeData() {
        boolean test = true;
        if (treeBalancer.howMuchNodeToAdd("inputTreeData") != 2)
            test = false;
        assertTrue(test);
    }

    @Test
    public void testOnDoNotAddTreeData() {
        boolean test = true;
        int result = treeBalancer.howMuchNodeToAdd("inputTreeData2");
        if (result != 0)
            test = false;
        assertTrue(test);
    }

    @Test
    public void testOnAllNodesLeaves() {
        boolean test = true;
        if (treeBalancer.howMuchNodeToAdd("inputTreeData1") != 7)
            test = false;
        assertTrue(test);
    }

    @Test
    public void testOnMaxLeavesIsThree() {
        boolean test = true;
        if (treeBalancer.howMuchNodeToAdd("inputTreeData3") != 4)
            test = false;
        assertTrue(test);
    }
}
