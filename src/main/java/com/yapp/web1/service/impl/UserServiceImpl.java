package com.yapp.web1.service.impl;

import com.yapp.web1.domain.Project;
import com.yapp.web1.domain.User;
import com.yapp.web1.dto.res.ProjectListResponseDto;
import com.yapp.web1.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * UserService 구현 클래스
 *
 * @author Dakyung Ko
 * @author Jihye Kim
 * @since 0.0.3
 * @version 1.0
 */
@Service
@Transactional
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    @Transactional(readOnly = true)
    @Override
    public List<ProjectListResponseDto> getFavoriteProjects(User user) {
        return null;
    }

    @Override
    public boolean setFavoriteProject(Long idx, User user) {
        return false;
    }

    @Override
    public Project joinProject(Long idx, User user) {
        return null;
    }
}