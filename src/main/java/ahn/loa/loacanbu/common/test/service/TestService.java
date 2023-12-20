package ahn.loa.loacanbu.common.test.service;

import ahn.loa.loacanbu.common.test.mapper.TestMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TestService {

    private final TestMapper testMapper;


    public String testService(){
        String str = testMapper.testSelect();
        System.out.println(str);
        return "hello";
    }

}
