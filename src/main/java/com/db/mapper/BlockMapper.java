package com.db.mapper;

import com.db.entity.Block;
import org.apache.ibatis.annotations.Param;


import java.util.List;

/**
 * (Block)表数据库访问层
 *
 * @author makejava
 * @since 2021-12-25 13:04:14
 */
public interface BlockMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Block queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Block> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param block 实例对象
     * @return 对象列表
     */
    List<Block> queryAll(Block block);

    /**
     * 新增数据
     *
     * @param block 实例对象
     * @return 影响行数
     */
    int insert(Block block);

    /**
     * 修改数据
     *
     * @param block 实例对象
     * @return 影响行数
     */
    int update(Block block);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}