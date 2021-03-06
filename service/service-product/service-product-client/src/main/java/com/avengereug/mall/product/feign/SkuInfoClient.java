package com.avengereug.mall.product.feign;

import com.avengereug.mall.common.utils.R;
import com.avengereug.mall.common.utils.RPCResult;
import com.avengereug.mall.product.vo.SkuInfoEntityVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;
import java.util.List;


@FeignClient(value = "service-product", contextId = "skuInfoClient")
@RequestMapping("product/skuinfo")
public interface SkuInfoClient {

    @GetMapping("/inner/info/{skuId}")
    RPCResult<SkuInfoEntityVO> innerInfo(@PathVariable("skuId") Long skuId);

    @GetMapping("/inner/getPrice")
    BigDecimal getPrice(@RequestParam("skuId") Long skuId);
}
