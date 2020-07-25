package com.study.service;

import com.study.entity.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 对指定service中的每一个方法进行异常的处理
 */
@Component//不要忘记添加，不要忘记添加
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {
    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public Dept get(long id) {
                Dept dept = new Dept();
                dept.setDeptNo(id);
                dept.setDeptName("该ID：" + id + "没有没有对应的信息,null--@HystrixCommand");
                dept.setDbSource("no this database in MySQL");
                return dept;
            }

            @Override
            public List<Dept> list() {
                return null;
            }

            @Override
            public boolean add(Dept dept) {
                return false;
            }
        };
    }
}



