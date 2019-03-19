package io.daocloud.shop.user.repository;

import io.daocloud.shop.user.entity.UserEntity;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * @Package io.daocloud.shop.user.repository
 * @Classname UserController
 * @Description TODO
 * @Date 2019/3/18 下午4:30
 * @Created by chenghao
 * @desc UserController
 * @project user-center
 */

@Repository
public interface UserRepository extends PagingAndSortingRepository<UserEntity,Long> {
}
