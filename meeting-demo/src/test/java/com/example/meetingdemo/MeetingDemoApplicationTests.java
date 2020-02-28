package com.example.meetingdemo;

import com.example.meeting.common.vo.BaseResponse;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MeetingDemoApplicationTests {

    @Test
    void contextLoads() {
        BaseResponse br = new BaseResponse("hello");
        System.out.println(br);
    }

}
