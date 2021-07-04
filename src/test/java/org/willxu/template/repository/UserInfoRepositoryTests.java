package org.willxu.template.repository;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.willxu.template.TemplateApplication;
import org.willxu.template.entity.UserInfo;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class UserInfoRepositoryTests {
    @Autowired
    UserInfoRepository repository;

    private static final Logger log = LoggerFactory.getLogger(TemplateApplication.class);

    /**
     * TODO cannot insert the data to databases
     */
    @Test
    public void testInsert() {
        // save a few users
        repository.save(new UserInfo(1L, "root", "root"));
        repository.save(new UserInfo(1L, "Jack", "J"));
        repository.save(new UserInfo(1L, "Chloe", "C"));
        repository.save(new UserInfo(1L, "Kim", "K"));
        repository.save(new UserInfo(1L, "David", "D"));
        repository.save(new UserInfo(1L, "Michelle", "M"));
        // fetch all users
        log.info("Users found with findAll():");
        for (UserInfo userInfo : repository.findAll()) {
            log.info(userInfo.toString());
        }
        // fetch an individual userInfo by ID
        UserInfo userInfo = new UserInfo();
        if (repository.findById(1L).isPresent()) {
            userInfo = repository.findById(1L).get();
        }
        log.info("UserInfo found with findById(1L):");
        log.info(userInfo.toString());
        // fetch userInfos by last name
        log.info("UserInfo found with findByFullName('root'):");
        repository.findByFullName("root").forEach(user -> log.info(user.toString()));
    }
}
