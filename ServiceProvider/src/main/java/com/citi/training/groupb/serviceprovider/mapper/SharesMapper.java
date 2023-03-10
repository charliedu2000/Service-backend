package com.citi.training.groupb.serviceprovider.mapper;

import com.citi.training.groupb.serviceprovider.entity.Shares;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.citi.training.groupb.serviceprovider.vo.request.SharesNumUpdate;
import com.citi.training.groupb.serviceprovider.vo.response.SharesPrice;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Charlie Du
 * @since 2022-06-25
 */
@Mapper
public interface SharesMapper extends BaseMapper<Shares> {
    void updateSharesNum(SharesNumUpdate sharesNumUpdate);

    SharesPrice selectPriceByRic(String ric);

    Shares selectByName(String ticker);
}
