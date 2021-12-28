package com.db.mapper;

import com.db.entity.BlockUserAssetBind;
import org.apache.ibatis.annotations.Param;


import java.util.List;

/**
 * (BlockUserAssetBind)表数据库访问层
 *
 * @author makejava
 * @since 2021-12-25 13:03:11
 */
public interface BlockUserAssetBindMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    BlockUserAssetBind queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<BlockUserAssetBind> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param blockUserAssetBind 实例对象
     * @return 对象列表
     */
    List<BlockUserAssetBind> queryAll(BlockUserAssetBind blockUserAssetBind);

    /**
     * 新增数据
     *
     * @param blockUserAssetBind 实例对象
     * @return 影响行数
     */
    int insert(BlockUserAssetBind blockUserAssetBind);

    /**
     * 修改数据
     *
     * @param blockUserAssetBind 实例对象
     * @return 影响行数
     */
    int update(BlockUserAssetBind blockUserAssetBind);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}