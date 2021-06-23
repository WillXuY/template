package com.willxu.template.build;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.willxu.algorithm.domain.AllOne;

@SpringBootTest
public class GradleIncludeOtherProjectTest {
    @Test
    public void testIncludeAlgorithmDomain() {
        AllOne allOne = new AllOne();
        System.out.println(allOne.getMaxKey());
    }
}
