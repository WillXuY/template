package com.willxu.template.build;

import com.willxu.algorithm.domain.AllOne;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class GradleIncludeOtherProjectTest {
    @Test
    public void testIncludeAlgorithmDomain() {
        AllOne allOne = new AllOne();
        System.out.println(allOne.getMaxKey());
    }
}
