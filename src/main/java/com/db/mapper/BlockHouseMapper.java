package com.db.mapper;

import com.db.entity.BlockHouse;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (BlockHouse)表数据库访问层
 *
 * @author makejava
 * @since 2021-12-25 13:02:33
 */
public interface BlockHouseMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    BlockHouse queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<BlockHouse> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param blockHouse 实例对象
     * @return 对象列表
     */
    List<BlockHouse> queryAll(BlockHouse blockHouse);

    /**
     * 新增数据
     *
     * @param blockHouse 实例对象
     * @return 影响行数
     */
    int insert(BlockHouse blockHouse);

    /**
     * 修改数据
     *
     * @param blockHouse 实例对象
     * @return 影响行数
     */
    int update(BlockHouse blockHouse);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}