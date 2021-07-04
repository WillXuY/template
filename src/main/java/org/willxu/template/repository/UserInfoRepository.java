package org.willxu.template.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.willxu.template.entity.UserInfo;

import java.util.List;

@Repository
public interface UserInfoRepository extends JpaRepository<UserInfo, Long> {
    List<UserInfo> findByFullName(String fullName);
}
