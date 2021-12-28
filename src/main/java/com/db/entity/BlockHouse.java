package com.db.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (BlockHouse)实体类
 *
 * @author makejava
 * @since 2021-12-25 13:02:28
 */
public class BlockHouse implements Serializable {
    private static final long serialVersionUID = -25189664348668843L;
    
    private Long id;
    /**
    * 楼栋
    */
    private String building;
    /**
    * 小区ID
    */
    private Long blockId;
    /**
    * 楼层
    */
    private Integer floor;
    /**
    * 单元
    */
    private String unit;
    /**
    * 房间
    */
    private String room;
    
    private Date updateTime;
    
    private Date createTime;
    /**
    * 面积
    */
    private Double area;
    /**
    * 所属网格的id
    */
    private Long gridId;
    /**
    * 出租标识 0不可出租，1可出租
    */
    private Integer leasable;
    /**
    * 地址
    */
    private String address;
    /**
    * 0住宅 1商业 2车位 3办公
    */
    private Integer typ;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public Long getBlockId() {
        return blockId;
    }

    public void setBlockId(Long blockId) {
        this.blockId = blockId;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Long getGridId() {
        return gridId;
    }

    public void setGridId(Long gridId) {
        this.gridId = gridId;
    }

    public Integer getLeasable() {
        return leasable;
    }

    public void setLeasable(Integer leasable) {
        this.leasable = leasable;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getTyp() {
        return typ;
    }

    public void setTyp(Integer typ) {
        this.typ = typ;
    }

}