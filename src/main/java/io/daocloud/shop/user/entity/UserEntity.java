package io.daocloud.shop.user.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @Package io.daocloud.shop.user.entity
 * @Classname UserEntity
 * @Description TODO
 * @Date 2019/3/18 下午4:28
 * @Created by chenghao
 * @desc UserEntity
 * @project user-center
 */

@Data
@Entity
@Table(name = "t_product")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String username;
    @Column
    private String password;

    @Column
    private String mobile;

}
