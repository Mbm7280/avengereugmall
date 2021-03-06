package com.avengereug.mall.product.dao;

import com.avengereug.mall.product.entity.AttrGroupEntity;
import com.avengereug.mall.product.vo.SpuItemAttrGroupVO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 属性分组
 * 
 * @author avengerEug
 * @email eugenesumarry@163.com
 * @date 2020-07-20 11:11:22
 */
@Mapper
public interface AttrGroupDao extends BaseMapper<AttrGroupEntity> {

    List<SpuItemAttrGroupVO> getAttrGroupWithAttrsBySpuId(@Param("spuId") Long spuId, @Param("catelogId") Long catelogId);

}
