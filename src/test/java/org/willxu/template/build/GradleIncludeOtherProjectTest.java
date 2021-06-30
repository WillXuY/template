package org.willxu.template.build;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.willxu.algorithm.provide.TreeNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class GradleIncludeOtherProjectTest {
    @Test
    public void testIncludeAlgorithmDomain() {
        TreeNode treeNode = new TreeNode(0);
        assertEquals(0, treeNode.val);
    }
}
