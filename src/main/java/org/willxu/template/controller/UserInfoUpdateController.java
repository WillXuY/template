package org.willxu.template.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.willxu.template.entity.UserInfo;
import org.willxu.template.enumerate.ResponseStatusEnum;
import org.willxu.template.repository.UserInfoRepository;
import org.willxu.template.vo.ResponseVo;

import javax.annotation.Resource;

@RestController
public class UserInfoUpdateController {
    @Resource
    private UserInfoRepository userInfoRepository;

    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    @GetMapping("/addUserInfo")
    public String addUserInfo(@RequestParam Long createUser, @RequestParam String fullName,
                              @RequestParam String nickName)
            throws JsonProcessingException {
        ResponseVo responseVo = new ResponseVo();
        responseVo.setStatus(ResponseStatusEnum.FAIL.getStatus());
        try {
            UserInfo userInfo = new UserInfo(createUser, fullName, nickName);
            userInfoRepository.save(userInfo);
            responseVo.setStatus(ResponseStatusEnum.SUCCESS.getStatus());
            responseVo.setMessage("Add user info successful!");
        } catch (Exception e) {
            responseVo.setStatus(ResponseStatusEnum.EXCEPTION.getStatus());
            responseVo.setMessage("Exception!");
        }
        return OBJECT_MAPPER.writeValueAsString(responseVo);
    }
}
