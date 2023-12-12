package com.book.lzf.dao;

import com.book.lzf.entity.Admin;
import org.springframework.stereotype.Repository;

/**
 * @Auther: 34838
 * @Date: 2023/2/15 18:42
 * @Description:
 */
@Repository
public interface AdminMapper {
    Admin selectAdminByAdmin(Admin admin);
}
