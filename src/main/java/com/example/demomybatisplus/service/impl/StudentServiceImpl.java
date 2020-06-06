package com.example.demomybatisplus.service.impl;

import com.example.demomybatisplus.entity.Student;
import com.example.demomybatisplus.mapper.StudentMapper;
import com.example.demomybatisplus.service.IStudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 学生表 服务实现类
 * </p>
 *
 * @author 王小甜
 * @since 2020-06-06
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements IStudentService {

}
