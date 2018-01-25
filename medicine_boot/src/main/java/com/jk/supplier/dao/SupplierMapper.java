package com.jk.supplier.dao;

import com.jk.kit.pojo.Kit;
import com.jk.supplier.pojo.Supplier;
import org.apache.ibatis.annotations.*;

import java.util.List;
@Mapper
public interface SupplierMapper {
    @Select({
            "<script>",
            "select count(1) from t_supplier u ,t_brand b WHERE u.sup_brand  = b.brand_id ",
            "<if test='supplier.supName != null and supplier.supName != &apos;&apos;'> and u.sup_name LIKE CONCAT('%',#{supplier.supName},'%')</if>",
            "<if test='supplier.supAddress != null and supplier.supAddress != &apos;&apos;'> and u.sup_address LIKE CONCAT('%',#{supplier.supAddress},'%')</if>",
            "<if test='supplier.supAdddatemin != null and supplier.supAdddatemin != &apos;&apos;'> and u.sup_adddate &gt;=  str_to_date(#{supplier.supAdddatemin},'%Y-%m-%d')</if>",
            "<if test='supplier.supAdddatemax != null and supplier.supAdddatemax != &apos;&apos;'> and u.sup_adddate &lt;=  str_to_date(#{supplier.supAdddatemax},'%Y-%m-%d')</if>",
            "<if test='supplier.supCreditlevel != null'> and u.sup_creditlevel = #{supplier.supCreditlevel}</if>",
            "</script>"
    })
    long querySupplierCount(@Param("supplier") Supplier supplier);

    @Select({
            "<script>",
            "select *,b.brand_name  as brandName  from t_supplier u ,t_brand b WHERE u.sup_brand  = b.brand_id ",
            "<if test='supplier.supName != null and supplier.supName != &apos;&apos;'> and u.sup_name LIKE CONCAT('%',#{supplier.supName},'%')</if>",
            "<if test='supplier.supAddress != null and supplier.supAddress != &apos;&apos;'> and u.sup_address LIKE CONCAT('%',#{supplier.supAddress},'%')</if>",
            "<if test='supplier.supAdddatemin != null and supplier.supAdddatemin != &apos;&apos;'> and u.sup_adddate &gt;=  str_to_date(#{supplier.supAdddatemin},'%Y-%m-%d')</if>",
            "<if test='supplier.supAdddatemax != null and supplier.supAdddatemax != &apos;&apos;'> and u.sup_adddate &lt;=  str_to_date(#{supplier.supAdddatemax},'%Y-%m-%d')</if>",
            "<if test='supplier.supCreditlevel != null'> and u.sup_creditlevel = #{supplier.supCreditlevel}</if>",
            "limit #{start},#{endPos}",
            "</script>"
    })
    @Results({
            @Result(column="sup_id" ,property="supId"),
            @Result(column="sup_name" ,property="supName"),
            @Result(column="sup_phone" ,property="supPhone"),
            @Result(column="sup_address" ,property="supAddress"),
            @Result(column="sup_creditlevel" ,property="supCreditlevel"),
            @Result(column="sup_info" ,property="supInfo"),
            @Result(column="sup_kits" ,property="supKits"),
            @Result(column="sup_adddate" ,property="supAdddate"),
            @Result(column="sup_update" ,property="supUpdate"),
            @Result(column="sup_linkman" ,property="supLinkman"),
            @Result(column="sup_type" ,property="supType"),
            @Result(column="sup_frame" ,property="supFrame"),
            @Result(column="sup_checkstate" ,property="supCheckstate"),
    })
    List<Supplier> querySupplierAll(@Param("endPos") Integer pageSize, @Param("start") Integer start, @Param("supplier")Supplier supplier);

    @Select("select *,b.brand_name  AS brandName FROM t_supplier u ,t_brand b WHERE u.sup_brand  = b.brand_id AND u.sup_id = #{id}")
    @Results({
            @Result(column="sup_id" ,property="supId"),
            @Result(column="sup_name" ,property="supName"),
            @Result(column="sup_phone" ,property="supPhone"),
            @Result(column="sup_address" ,property="supAddress"),
            @Result(column="sup_creditlevel" ,property="supCreditlevel"),
            @Result(column="sup_info" ,property="supInfo"),
            @Result(column="sup_kits" ,property="supKits"),
            @Result(column="sup_adddate" ,property="supAdddate"),
            @Result(column="sup_update" ,property="supUpdate"),
            @Result(column="sup_linkman" ,property="supLinkman"),
            @Result(column="sup_type" ,property="supType"),
            @Result(column="sup_frame" ,property="supFrame"),
            @Result(column="sup_checkstate" ,property="supCheckstate"),
    })
    Supplier querySupplierById(Integer id);
}